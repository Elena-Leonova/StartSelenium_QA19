import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {
    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }

    @Test
    public void testCss(){
        WebElement germany = wd.findElement(By.cssSelector("#customers tr:nth-child(7) td:last-child"));
        String text = germany.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Germany");

        //========================HW========================
        //task 1- print amount of table rows
        List<WebElement> rowElements = wd.findElements(By.cssSelector("#customers tr"));
        int rowQuantity = rowElements.size();
        System.out.println(rowQuantity);

        //task 2 - print amount of table columns
        List<WebElement> columElements = wd.findElements(By.cssSelector("#customers tr th"));
        int columQuantity = columElements.size();
        System.out.println(columQuantity);

        //task 3 - find locator for the row3
        wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));

        //task 4 - find locator for the last column
        wd.findElement(By.cssSelector("#customers tr :last-child"));
    }

    @AfterTest
    public void tearDown(){
        wd.quit();
    }
}
