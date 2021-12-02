package HW_2;

import java.util.Scanner;

public class HW2_3 {
    public static void main(String[] args) {
        System.out.println("Please enter a Current Month");
        Scanner s1 = new Scanner(System.in);
        int choice = s1.nextInt();
       /* switch (choice) {
            case 12, 1, 2 -> System.out.println("winter");
            case 9, 10, 11 -> System.out.println("Fall");
            case 6, 7, 8 -> System.out.println("summer");
            case 3, 4, 5 -> System.out.println("Spring");*/


            //IF//
        if (choice == 12||choice == 1||choice == 2) {
               System.out.println("winter");
           }
        if (choice == 9||choice == 10||choice == 11) {
                System.out.println("Fall");
            }
        if (choice == 6||choice == 7||choice == 8) {
                System.out.println("Summer");
            }
        if (choice == 3||choice == 4||choice == 5) {
            System.out.println("Spring");
        }
        }
        }
