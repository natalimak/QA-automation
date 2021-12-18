package hw_6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Hw6_4_ReadFromCSVFile {
    public static void main(String[] args) throws IOException {

        Scanner players=new Scanner((new File("Players.csv")));
        players.useDelimiter(",");
            while (players.hasNext())  //returns a boolean value
            {
                System.out.print(players.next());  //find and returns the next complete token from this scanner
                System.out.print(",");
            }

        players.close();  //closes the scanner

    }

}
