package com.melaniejmyers;

//10/25/17 notes for continuing: working ok for one case, need to find way to extend to work for multiple cases. then need to work with actual file instead of hardcoded input

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.pow;

public class IOchallenge {

    public static void main(String[] args) throws IOException {
        
         Scanner inputFile = processInputFile("/Users/melanie.myers/Code/codeJamPractice/src/com/melaniejmyers/A-small-practice.in");
         int numOfCases = captureNumOfCases(inputFile);
         
        StringBuilder outputFileTest = new StringBuilder();

        for (int i=0; i < numOfCases; i++){   //for each test case (sentence)



            // capture provided  numOfLetters (number of letters in the string to be translated)
            int numOfLetters= inputFile.nextInt();

            // capture sentence to be translated
            String startingSentence = inputFile.next();

            // convert I,O to 1's and 0's
            startingSentence = startingSentence.replace("I","1");
            startingSentence = startingSentence.replace("O","0");

            //create sentence output string
            StringBuilder translatedSentence = new StringBuilder();

            //convert binary number to digital number

            for (int j=0; j < (numOfLetters * 8); j+=8){                                 //for every byte in the startingSentence
                String myByte = startingSentence.substring(j, j+8);                 // take 8 characters
                int decVal = 0;                                             //start with decimal value of 0
                for (int k=0; k <8; k++) {                                //for each character in the byte
                    char digitToEval = myByte.charAt(k);                   //take a character
                    int exponent = 7 - k;
                    if (digitToEval == '1') {                              //check if it is a 1 or 0
                        decVal += pow(2, exponent);                               // if it's a 1, use the power of 2, then add to decimal total
                    }
                }
                char newLetter = (char)decVal;
                translatedSentence.append(newLetter);
            }

            //create answer string
            String caseAnswer = "Case #" + (i + 1) + ":" + translatedSentence + "\n";

            outputFileTest.append(caseAnswer);
        }

        createOutputFile(outputFileTest);
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
        int numOfCases = file.nextInt();
        return numOfCases;
    }

    public static void createOutputFile(StringBuilder outputText) throws IOException{
        String outputTextAsString = outputText.toString();
        File outFile = new File ("output.txt");
        FileWriter fWriter = new FileWriter (outFile);
        PrintWriter outputFile = new PrintWriter(fWriter);
        outputFile.write(outputTextAsString);
    }

}

