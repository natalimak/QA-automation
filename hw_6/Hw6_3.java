       /* Array include 4 Letters
       Testing printing only 3 first of letters
        First test print the letter A
        Second test print the letter B
        Third test print the letter C*/
package hw_6;

       import org.testng.annotations.AfterClass;
       import org.testng.annotations.BeforeClass;
       import org.testng.annotations.Test;

       public class Hw6_3 {
           String[] strArray = new String[] {"A","B","C","D"};

           @BeforeClass
           public void runOnceBeforeClass() {
               System.out.println("Start test, My Array");
               PrintArray(strArray);
           }

           @Test(priority = 1)
           public void PrintA(){
               System.out.println("First letter is: "+ strArray[0]);
           }
           @Test(priority = 2)
           public void PrintB(){
               System.out.println("First letter is: "+ strArray[1]);
           }
           @Test(priority = 3)
           public void PrintC(){
               System.out.println("First letter is: "+ strArray[2]);
           }

           @AfterClass
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
