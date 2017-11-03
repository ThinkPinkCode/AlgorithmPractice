package question1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class answer1 {



    public static void main(String[] args) throws IOException {

        Scanner inputFile = processInputFile("/Users/melanie.myers/Code/codeJamPractice/src/com/melaniejmyers/sampleInput1.in");
        int numOfCases = captureNumOfCases(inputFile);

        StringBuilder outputFileText = new StringBuilder();

        for (int i=0; i <= numOfCases; i++){
                int numOfLetters = Integer.parseInt(inputFile.nextLine());
                String startingSentence = inputFile.nextLine();

                startingSentence = startingSentence.replace("I", "1");
                startingSentence = startingSentence.replace("O", "0");

                StringBuilder translatedSentence = new StringBuilder();

                //convert binary number to digital number
                for (int j = 0; j < (numOfLetters * 8); j += 8) {                                        //for every byte in the startingSentence
                    String myByte = startingSentence.substring(j, j + 8);                             // take 8 characters
                    int decVal = 0;                                                                 //start with decimal value of 0
                    for (int k = 0; k < 8; k++) {                                                      //for each character in the byte
                        char digitToEval = myByte.charAt(k);                                        //take a character
                        int exponent = 7 - k;
                        if (digitToEval == '1') {                                                   //check if it is a 1 or 0
                            decVal += pow(2, exponent);                                             // if it's a 1, use the power of 2, then add to decimal total
                        }
                    }
                    char newLetter = (char) decVal;
                    translatedSentence.append(newLetter);
                }
                outputFileText.append("Case #" + (i +1) + ": " + translatedSentence + "\n");
        }
        String outputFileTextAsString= outputFileText.toString();
        createOutputFile(outputFileTextAsString);
    }

    public static Scanner processInputFile(String fileName) throws IOException {
        Scanner file = loadFile(fileName);
        return file;
    }

    public static Scanner loadFile(String fileName) throws IOException {
        File incomingFile = new File(fileName);
        return new Scanner(incomingFile);
    }

    public static int captureNumOfCases (Scanner file){
        String numOfCases = file.nextLine();
        return parseInt(numOfCases);
    }

    public static void createOutputFile(String outputText) throws IOException{
        PrintWriter out = new PrintWriter("sampleOutput1.txt");
        out.println(outputText);
        out.close();
    }

}

