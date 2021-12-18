package hw6_Junit;
//Testing Adding and Multiple 2 numbers: 7 and 5

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.jupiter.api.Order;

public class Hw6_1_Testng {

    @BeforeClass
    public static void runOnceBeforeClass() {System.out.println("Start test");
        }

    @Test
    @Order(2)
    public void Test_Mult(){
        int result = 5 * 7;
        System.out.println("Mult Result: " + result);
    }
    @Test
  //  @Order(1)
    public void Test_Add(){
        int result = 5 + 7;
        System.out.println("Add Result: " + result);
    }
    @AfterClass
    public static void EndTest() {
        System.out.println("End test");
    }

}
