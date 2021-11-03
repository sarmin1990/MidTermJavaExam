package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.
    public static void main(String[] args) {
        ArithmeticOperator obj =  new ArithmeticOperator();
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }

    void add(){

        Scanner sc = new Scanner(System.in);
        System.out.println("input first value");
        int a= sc.nextInt();
        System.out.println("input 2nd value");
        int b= sc.nextInt();
        System.out.println("total value");
        System.out.println(a+b);
    }
    void subtract(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input 1st value");
        int a=sc.nextInt();
        System.out.println("input 2nd value");
        int b=sc.nextInt();
        System.out.println("subtract value");
        System.out.println(a-b);

    }
    void multiply(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input 1st value");
        int a=sc.nextInt();
        System.out.println("input 2nd value");
        int b=sc.nextInt();
        System.out.println("multiply value");
        System.out.println(a*b);

    }
    void divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input 1st value");
        int a=sc.nextInt();
        System.out.println("input 2nd value");
        int b=sc.nextInt();
        System.out.println("divide value");
        System.out.println(a/b);

    }




}
