package hw5;

import java.util.Arrays;
import java.util.Random;

public class Hw5_9 {
    public static void main(String[] args) {
        int[] myRandomList = new int[20];
        Random rand = new Random();

        //create random array
        for (int i = 0; i < myRandomList.length; i++) {
            myRandomList[i]= rand.nextInt(6);
        }
        System.out.println("myRandomList is created!");

        //print random array
        for (int i = 0; i < myRandomList.length; i++) {
            System.out.println("i= " + i+ ", "+ "content is: "+ myRandomList[i]);
        }

        // Check if number 5 exist in the array and print it
        System.out.println();
            for (int i = 0; i < myRandomList.length; i++) {
                if (myRandomList[i]==5)
                System.out.println("i= " + i+ ", "+ "content is: "+ myRandomList[i]);
        }
    }
}
