package string.problems;


import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String st1="CAT";
        String st2="ACT";
        System.out.println("Both strings are anagram"+anagramCheck(st1,st2));
    }

    public static boolean anagramCheck(String st1, String st2) {
        char[]charArrayOfst1=st1.toCharArray();
        char[]charArrayOfst2=st1.toCharArray();

        Arrays.sort(charArrayOfst1);
        Arrays.sort(charArrayOfst2);

        return Arrays.equals(charArrayOfst1, charArrayOfst2);//it's not giving me the false result
    }
}
