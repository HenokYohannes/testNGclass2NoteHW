package class2;

import org.testng.annotations.Test;

public class DependOn {

    @Test
    public void login() {
        System.out.println(" I am login test");
    }

    @Test(dependsOnMethods = "login")
    public void verificationofDashBoard() {
        System.out.println(" I am dependent scenario");
    }
}
