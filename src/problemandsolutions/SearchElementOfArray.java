package problemandsolutions;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.
    public static void main(String[] args) {
        int [] a={5,2,3,6,9,7,1,10,4};
        int search_ele=10;
        boolean flag=false;

        for (int i=0;i<a.length;i++){
            if (search_ele==a[i]){
                System.out.println("Found the element at : "+i);
                flag=true;
                break;
            }
        }
        if (flag==false){
            System.out.println("Element not found");
        }
    }

}
