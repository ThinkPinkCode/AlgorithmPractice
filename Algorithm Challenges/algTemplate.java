
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class algTemplate {

  public static void main(String[] args) throws IOException {

    Scanner inputFile = processInputFile("/Users/melanie.myers/Code/codeJamPractice/src/com/melaniejmyers/sampleInput1.in"); //TODO Start #1: insert input file name
    int numOfCases = captureNumOfCases(inputFile);

    StringBuilder outputFileText = new StringBuilder();

    for (int i = 0; i <= numOfCases; i++) {
      StringBuilder caseAnswer = new StringBuilder();
      String nextLine = inputFile.nextLine();
                                                                                                                        //TODO Start #2: insert per case logic

      outputFileText.append("Case #" + (i + 1) + ": " + caseAnswer + "\n");
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
    PrintWriter out = new PrintWriter("sampleOutput1.txt");                                                    //TODO Start #3: update output file name
    out.println(outputText);
    out.close();
  }
}
