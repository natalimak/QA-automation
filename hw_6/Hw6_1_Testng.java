//Testing Adding and Multiple 2 numbers: 7 and 5
package hw_6;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hw6_1_Testng {

    @BeforeClass
    public void runOnceBeforeClass() {System.out.println("Start test");
        }

    @Test(priority = 1)
    public void Test_Mult(){
        int result = 5 * 7;
        System.out.println("Mult Result: " + result);
    }
    @Test(priority = 0)
    public void Test_Add(){
        int result = 5 + 7;
        System.out.println("Add Result: " + result);
    }
    @AfterClass
    public void EndTest() {
        System.out.println("End test");
    }

}
