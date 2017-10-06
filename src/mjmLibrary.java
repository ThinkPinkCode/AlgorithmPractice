import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mjmLibrary {

//----- codejam methods-----

  public void processInputFile(String fileName) throws IOException {
    Scanner file = loadFile(fileName);
    int numOfCases = file.nextInt() + 1;

    for (int i = 0; i < numOfCases; i++) {
      //put what's needed for each case here
    }
  }

  public static Scanner loadFile(String fileName) throws IOException {
    File incomingFile = new File(fileName);
    return new Scanner(incomingFile);
  }

  public static PrintWriter createOutputFile() throws IOException{
    File outFile = new File ("output.txt");
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
