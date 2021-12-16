package hw5;

import java.util.Arrays;
import java.util.Random;

public class Hw5_5 {
    public static void main(String[] args) {
        int[] myRandomList = new int[6];
        Random rand = new Random();

        //create random array
        for (int i = 0; i < myRandomList.length; i++) {
            myRandomList[i]= rand.nextInt(50);
        }
        System.out.println("myRandomList is created!");

        //print random array
        for (int i = 0; i < myRandomList.length; i++) {
            System.out.println("i= " + i+ ", "+ "content is: "+ myRandomList[i]);
        }

        //sort random array and print it
        Arrays.sort(myRandomList);
        System.out.println("myRandomList is sorted!");
        for (int i = 0; i < myRandomList.length; i++) {
            System.out.println("i= " + i+ ", "+ "content is: "+ myRandomList[i]);
        }
    }
}
