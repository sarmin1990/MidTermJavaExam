package math.problems;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MakePyramid {


        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        public static void main(String[] args) {

            for (int i=1; i<=6;i++){
                for (int j=6; j>=i;j--){
                    System.out.print(" ");
                }
                for (int k=1;k<(i*2);k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

                   }












