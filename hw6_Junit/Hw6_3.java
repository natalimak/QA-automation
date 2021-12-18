package hw6_Junit;
/* Array include 4 Letters
       Testing printing only 3 first of letters
        First test print the letter A
        Second test print the letter B
        Third test print the letter C*/


import org.junit.Before;
import org.junit.jupiter.api.Order;
import org.junit.After;
import org.junit.Test;

       public class Hw6_3 {
           String[] strArray = new String[] {"A","B","C","D"};

           @Before
           public void runOnceBeforeClass() {
               System.out.println("Start test, My Array");
               PrintArray(strArray);
           }

           @Test
           @Order(1)
           public void PrintA(){
               System.out.println("First letter is: "+ strArray[0]);
           }
           @Test
           @Order(2)
           public void PrintB(){
               System.out.println("First letter is: "+ strArray[1]);
           }
           @Test
           @Order(3)
           public void PrintC(){
               System.out.println("First letter is: "+ strArray[2]);
           }
           @After
           public void EndTest() {
               System.out.println("End test");
           }
           //print array
       public void PrintArray(String arr[]){
               for (String strTemp : arr){
                   System.out.println(strTemp);
               }
           }
       }
