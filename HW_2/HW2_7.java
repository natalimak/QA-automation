package HW_2;

import java.util.Scanner;

public class HW2_7 {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner s1 = new Scanner(System.in);
        String name = s1.next();

        System.out.println("Please enter your age");
        Scanner s2 = new Scanner(System.in);
        int i = s2.nextInt();

        System.out.println("Please enter currency");
        Scanner s3 = new Scanner(System.in);
        double d = s3.nextDouble();

        printHello(name);
        calculate(d, i);
    }

    static void printHello(String name) {
        System.out.println("hello, "+ name);
    }

    static void calculate(double d, int i) {
        System.out.println(d + i/2);
    }
}
