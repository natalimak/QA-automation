package HW_2;

import java.util.Scanner;

public class HW2_1 {
    public static void main(String[] args) {
        System.out.println("Please enter a number (X)");
        Scanner s1 = new Scanner(System.in);
        int x = s1.nextInt();

        System.out.println("Please enter a number (Y)");
        Scanner s2 = new Scanner(System.in);
        int y = s1.nextInt();

        if (x > y){
            System.out.println("Big");
        }else {
            System.out.println("small");
        }
    }
}
