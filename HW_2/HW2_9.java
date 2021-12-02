package HW_2;

import java.util.Scanner;

public class HW2_9 {

    static int sum_int(int a, int b) {
        return a+b;
    }

    static String sum_string(String f, String l) {
        return f+l;
    }

    public static void main(String[] args) {
        System.out.println("Please enter your First name");
        Scanner s1 = new Scanner(System.in);
        String f = s1.next();

        System.out.println("Please enter your Last name");
        Scanner s2 = new Scanner(System.in);
        String l = s2.next();

        System.out.println("Please enter your age");
        Scanner s3 = new Scanner(System.in);
        int a = s3.nextInt();

        System.out.println("Please enter currency");
        Scanner s4 = new Scanner(System.in);
        int b = s4.nextInt();

        System.out.println("new int: " + sum_int(a,b));
        System.out.println("Full name: " + sum_string(f, l));
    }


}
