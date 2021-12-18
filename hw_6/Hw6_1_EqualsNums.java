package hw_6;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hw6_1_EqualsNums {

        @BeforeClass
        public void runOnceBeforeClass() {System.out.println("Start test");
        }

        @Test(priority = 1)
        public void IfEqual(){
            int x=1;
            int y=2; //int y=1
            Assert.assertEquals(x,y,"Not equals");
            System.out.println("The numbers is equals" );//run only if the numbers are equals.

        }
            @AfterClass
        public void EndTest() {
            System.out.println("End test");
        }

    }
