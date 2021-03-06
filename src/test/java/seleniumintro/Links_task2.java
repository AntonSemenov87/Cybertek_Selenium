package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Links_task2 {
    public static void main(String[] args) {
        //1.Open	Chrome	browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go	to	https://www.openxcell.com
        driver.get("https://www.openxcell.com");

        // 3.Print out the texts of all links

        List<WebElement> list  = driver.findElements(By.xpath("//body//a"));

        for (WebElement e : list) {
            System.out.println(e.getText());
        }

        // OR
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).getText();
//            System.out.println(i);
//        }


    }
}
