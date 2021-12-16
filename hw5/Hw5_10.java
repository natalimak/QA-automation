package hw5;

import java.util.HashMap;

public class Hw5_10 {
    public static void main(String[] args) {
        /*Create a HashMap object name it users,
        Add 3 pairs of users and passwords,
        Print all users password*/

        HashMap<String, String> userPassword = new HashMap<String, String>();
        userPassword.put("Natali", "1234");
        userPassword.put("Igor", "4321");
        userPassword.put("Lior", "9876");
        System.out.println(userPassword);
        System.out.println(userPassword.containsValue("123"));//false
        System.out.println(userPassword.containsValue("1234"));//true
        System.out.println(userPassword.containsValue("Natali"));//false
        System.out.println(userPassword.containsKey("Natali"));//true



    }
}
