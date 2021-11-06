package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the quiz score");
        double quiz = scan.nextDouble();

        System.out.println("Enter the mid-term score");
        double midterm = scan.nextDouble();

        System.out.println("Enter the final score");
        double Final=scan.nextDouble();

        double total= quiz+ midterm+ Final;
        double average=total/3;

        if (average>=90){
            System.out.printf("your average was a: %f and receive Grade A ", average);
        }else if (average>=70 && average<90){
            System.out.printf("your average was a: %f and receive Grade B ", average);
        }else if (average>=50 && average<70){
            System.out.printf("your average was a: %f and receive Grade C ", average);
        }else if (average<50){
            System.out.printf("your average was a: %f and receive Grade F ", average);


        }
    }




}
