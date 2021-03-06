package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumEasy_checkbox_task2 {
    public static void main(String[] args) {
        //1.Open Chrome	browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        // 3.Verify	“Check	All”	button	text	is	“Check	All”
        WebElement checkAll = driver.findElement(By.xpath("//input[@type='button']"));
        String checkAllText = checkAll.getAttribute("value");
        String expectedCheckAllText = "Check All";

        if (expectedCheckAllText.equals(checkAllText)) {
            System.out.println("Check all text verification PASSED");
        } else {
            System.out.println("Check all text verification FAILED");
        }


        // 4.Click	to	“Check	All”	button
        checkAll.click();


        // 5.Verify	all	check	boxes	are	checked
    //Option1:
//        WebElement checker = driver.findElement(By.xpath("//input[@id='isChkd']"));
//        String actualChecker = checker.getAttribute("value");
//        String expectedChecker = "true";
//
//        if (expectedChecker.equals(actualChecker)) {
//            System.out.println("All boxes are checked");
//        } else {
//            System.out.println("One or more boxes are NOT checked");
//        }
    // Option 2:
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));
        WebElement checkbox3 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[3]"));
        WebElement checkbox4 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[4]"));

        if (checkbox1.isSelected() && checkbox2.isSelected() && checkbox3.isSelected() && checkbox4.isSelected()) {
            System.out.println("All checkboxes are checked. Verification PASSED");
        } else {
            System.out.println("All checkboxes are not checked. Verification FAILED!");
        }


        // 6.Verify	button	text	changed	to	“Uncheck All"
        WebElement checkAllAfter = driver.findElement(By.xpath("//input[@id='check1']"));
        String checkAllTextAfter = checkAllAfter.getAttribute("value");
        String expectedCheckAllTextAfter = "Uncheck All";

        if (expectedCheckAllTextAfter.equals(checkAllTextAfter)) {
            System.out.println("Uncheck all text verification PASSED");
        } else {
            System.out.println("Uncheck all text verification FAILED");
        }



    }
}
