package problemandsolutions;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of
    // 10 elements in ascending.
    public static void main(String[] args) {
        int[]a={2,5,3,1,4,7,6,9,10,8};
        System.out.println("array before sorting" + Arrays.toString(a));

        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("array after sorting"+Arrays.toString(a));
    }




}
