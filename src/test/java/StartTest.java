import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

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

        WebElement element = wd.findElement(By.id("root"));
        List<WebElement> list = wd.findElements(By.tagName("div"));
        System.out.println(list.size());


    }

    @AfterTest
    public void postcondition(){
        wd.quit();
    }

}
