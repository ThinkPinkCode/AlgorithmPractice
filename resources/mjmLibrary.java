import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class mjmLibrary {

//----- codejam methods-----


  public static void setupFile (String fileName) throws IOException {
    Scanner inputFile = processInputFile(fileName);
    int numOfCases = captureNumOfCases(inputFile);
    StringBuilder outputFileText = new StringBuilder();
  }


  public static int captureNumOfCases (Scanner file){
    String numOfCases = file.nextLine();
    return parseInt(numOfCases);
  }


 //--------

 public static Scanner processInputFile(String fileName) throws IOException {
   Scanner file = loadFile(fileName);
   return file;
 }

  public static Scanner loadFile(String fileName) throws IOException {
    File incomingFile = new File(fileName);
    return new Scanner(incomingFile);
  }

  public static PrintWriter createOutputFile() throws IOException{
    File outFile = new File ("sampleOutput1.txt");
    FileWriter fWriter = new FileWriter (outFile);
    return new PrintWriter (fWriter);
  }

  public static String loadSentences(Scanner file) throws IOException {
    return file.nextLine();
  }

  public static void printArrayBackwards(String[] myArray, PrintWriter outputWriter){
    for (int i= (myArray.length-1); i > -1; i-- ) {
      System.out.print(myArray[i] + " ");
      outputWriter.print(myArray[i] + " ");
    }
    System.out.println();
    outputWriter.println();
  }










}
