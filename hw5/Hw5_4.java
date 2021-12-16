package hw5;

import java.util.ArrayList;

public class Hw5_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        //Printing the arraylist object
        System.out.println("All list: " + list);

        //Iterate the ArrayList and print the second String only.
        for (int i = 0; i < list.size(); i++) {
            if (i == 1) {
                System.out.println(list.get(i));
            }
        }
    }
}
