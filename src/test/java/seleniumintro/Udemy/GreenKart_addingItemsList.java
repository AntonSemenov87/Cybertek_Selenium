package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class GreenKart_addingItemsList {
    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().get("https://rahulshettyacademy.com/seleniumPractise/#/");

        int j=0;
        String [] itemsNeeded = {"Brocolli", "Cucumber", "Beetroot", "Almonds"};

        List<WebElement> products = Driver.getDriver().findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {

            // Broccoli - 1 Kg

           String[] name =products.get(i).getText().split("-");
           String formattedName = name[0].trim();

            List itemsNeededList = Arrays.asList(itemsNeeded);


            if (itemsNeededList.contains(formattedName)) {
                j++;
                Driver.getDriver().findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                //Thread.sleep(4000);
                if (j == itemsNeeded.length) {
                    break;
                }

            }
        }





        //Driver.quitDriver();
    }
}
