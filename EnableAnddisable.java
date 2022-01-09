package class2;

import org.testng.annotations.Test;

public class EnableAnddisable {

    @Test(groups="regression")
    public void firstTest(){
        System.out.println("I am the first");
    }

    @Test(enabled = false)
    public void secondTest(){
        System.out.println("I am the second");
    }

    @Test (groups = "smoke")
    public void thirdTest(){
        System.out.println("I am the third");
    }
}