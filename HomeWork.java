package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.security.util.Password;

import java.util.concurrent.TimeUnit;


/*TC 2: HRMS Application Negative Login:
Open chrome browser
Go to http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
Enter valid username
Leave password field empty
Verify error message with text “Password cannot be empty” is displayed.

 */

public class HomeWork {
    WebDriver driver;

    @BeforeMethod
    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void VerifyPasswLogin() {

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("btnLogin")).click();

        WebElement error = driver.findElement(By.xpath("//*[@id='spanMessage']"));

        String actualErrorText=error.getText();
        String expectedErrorText="Password cannot be empty";
        Assert.assertEquals(actualErrorText,expectedErrorText);
    }
@AfterMethod
    public void closeBrowser(){
//driver.quit();
}
}