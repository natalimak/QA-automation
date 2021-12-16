package hw5;

import java.util.Scanner;

public class Hw5_7_Seasons {
    public static void main(String[] args) {
        //user insert current season
        System.out.println("Please choose current season (Winter/Spring/Summer/Autumn)");
        Scanner scanner = new Scanner(System.in);
        //converting user choose into upper case
        String choice = scanner.next().toUpperCase();

        //print start and day current season
        try {
            Seasons season = Seasons.valueOf(choice);

            switch (season) {
                case WINTER:
                    System.out.println("Start day: 1.12, End day: 28.2");
                    break;
                case SPRING:
                    System.out.println("Start day: 1.3, End day: 31.5");
                    break;
                case SUMMER:
                    System.out.println("Start day: 1.6, End day: 31.8");
                    break;
                case AUTUMN:
                    System.out.println("Start day: 1.9, End day: 30.9");
                    break;
            }
        } catch (Exception season) {
           throw new Exception_WrongSeason ("Wrong current season");
        }
    }
}
