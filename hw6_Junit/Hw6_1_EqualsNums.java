package hw6_Junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class Hw6_1_EqualsNums {

        @Before
        public void runOnceBeforeClass() {System.out.println("Start test");
        }

        @Test
        public void IfEqual(){
            int x=1;
            int y=2; //int y=1
            Assert.assertEquals("not equal:",x,y);
            System.out.println("The numbers is equals" );//run only if the numbers are equals.

        }
        @After
        public void EndTest() {
            System.out.println("End test");
        }

    }
