package com.melaniejmyers;

import static java.lang.Math.pow;

public class IOchallenge {

    public static void main(String[] args) {

        //load input file

        //capture t  (# of test cases)
        int t = 10;                                                                                                         //TODO: take out hardcode

        //for each test case (sentence)
        for (int i=0; i <= t; i++){

            //create answer string
            String caseAnswer = "Case #" + i + ":";

            // capture B (number of letters in the string to be translated)
            int B= 10;                                                                                                  //TODO: will need to take out this hardcode

            // capture sentence to be translated
            String beforeSentence = "";

            // convert I,O to 1's and 0's

            beforeSentence = beforeSentence.replace("I","1");
            beforeSentence = beforeSentence.replace("O","0");

            //create sentence output string
            String translatedSentence = "";

            //convert binary number to digital number            // <--- but is this really necessary? Why not convert directly to number?

            for (int j=0; j <= B; j+=7){                                    //for every byte in the beforeSentence
                String myByte = beforeSentence.substring(j, j+7);                 // take 8 characters
                int decVal = 0;                                             //start with decimal value of 0
                for (int k=0; k < B; k++) {                                //for each character in the byte
                    char digitToEval = myByte.charAt(k);                   //take a character
                    if (digitToEval == '1') {                              //check if it is a 1 or 0
                        decVal += pow(2, k);                               // if it's a 1, use the power of 2, then add to decimal total
                    }
                }
                //return decimal value

                //convert to letter (create a table/small db to look it up in?)

                //add letter to translatedSentence
            }
            // caseAnswer += translatedSentence

            // add caseAnswer to output file
        }

        //create/print output file
    }


}

