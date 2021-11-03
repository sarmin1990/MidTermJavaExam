package math.problems;
import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[]a={2,1,5,9,8,3,4};
       Arrays.sort(a);
       for (int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
       int different= Integer.MAX_VALUE;
      for (int i=0;i<a.length-1;i++){
          if (a[i+1] -a[i]<different){
              different=a[i+1]-a[i];
          }
      }
        System.out.println("Lowest different is");
       System.out.println(different);
   }

}



