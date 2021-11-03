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
            int i,j,k,number;
            Scanner scan=new Scanner(System.in);
            System.out.println("input number of stars");
           number=scan.nextInt();
           for (int a=1;a<=number;a++){
               for (int b=a;b<number;b++){
                   System.out.print(" ");
                   for (int c=1;c<a*2;c++){
                       System.out.print("*");
                       System.out.print("\n");
                   }

               }


           }




        }

    }

