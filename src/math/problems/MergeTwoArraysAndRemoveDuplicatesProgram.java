package math.problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}

    public static void main(String[] args) {
        int[]A={1,3,4};
        int[]B={4,5,6,7,8};
        int A_leng= A.length;
        int B_leng=B.length;
        int C_leng= A.length+ B.length;
        int[]C=new int[C_leng];
        for (int i=0; i<A_leng; i++){
            C[i]=A[i];

        }
        for (int i=0; i<B_leng; i++){
            C[A_leng+i]=B[i];
        }
        for (int i=0;i<C_leng;i++){
            System.out.print(C[i]+" ");  //need help to remove duplicate
        }
    }





}