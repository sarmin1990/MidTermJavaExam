package math.problems;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[]a={1,2,3,4,5,6,7,8,10};
        int sum1=0;
        for (int b=0;b<a.length;b++) {
            sum1 = sum1 + a[b];
        }

        System.out.println("sum of all the element of array:"+ sum1);

        int sum2=0;
        for (int b=1;b<=10;b++){
            sum2=sum2+b;
        }
        System.out.println("sum of range of element:"+sum2);

        System.out.println("missing number of array is:"+(sum2-sum1) );
    }

}


