import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StartTest{
    WebDriver wd;

    @BeforeTest
    public void precondition(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");


    }

    @Test
    public void testMethod(){
        wd.findElement(By.tagName("a"));
        wd.findElement(By.id("root"));
        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.partialLinkText("HO"));
    }

    @AfterTest
    public void postcondition(){
        wd.quit();
    }

}
