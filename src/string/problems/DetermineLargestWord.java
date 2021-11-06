package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
   // my country name is Bangladesh
       String a="my country name is Bangladesh";
        String[]word=a.split(" ");
        System.out.println( "The length of string is " + word.length);
        int longestword=0;
        for (int i=0;i<word.length;i++){
            if (word[i].length()>longestword);
            longestword= word.length;

        }
        System.out.println(longestword);//it's not giving me correct result

    }

    }



