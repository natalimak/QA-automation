package HW_2;//import java.util.Scanner;
import java.util.*;

public class HW2_5 {
    public static void main(String[] args) {
        System.out.println("Please enter your age");
        Scanner s1 = new Scanner(System.in);
        int age = s1.nextInt();
        System.out.println("Your age is: " + age);


        System.out.println("Please enter first letter in your last name");
        Scanner s2 = new Scanner(System.in);
        char c = s2.next().charAt(0);
        System.out.println("First letter in your last name is: " + c);


        System.out.println("Please enter shekels dollar currency");
        Scanner s3 = new Scanner(System.in);
        double cur = s3.nextDouble();
        System.out.println("Shekels dollar currency is: " + cur);
        System.out.println("Please enter true if you flew abroad, else enter false");
        Scanner s4 = new Scanner(System.in);
        boolean ab = s4.nextBoolean();
        if (!ab) {
            System.out.println("You not flew abroad");
        }
        else{
            System.out.println("You flew abroad");
        }

        System.out.println("Please enter your apartment number");
        Scanner s5 = new Scanner(System.in);
        String ap = s5.next();
        System.out.println("your apartment number is: " + ap);


        int cur_new = (int) cur;
        System.out.println("new currency is: " + cur_new);

        int ap_new=Integer.parseInt(ap);
        System.out.println("your new apartment number is: " + ap_new);



    }
}
