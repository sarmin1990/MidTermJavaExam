package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.
    public static void main(String[] args) {
        Random rand =new Random();
        for (int i=1; i<=8; i++){
            System.out.println( rand.nextInt(100));
        }
    }

}