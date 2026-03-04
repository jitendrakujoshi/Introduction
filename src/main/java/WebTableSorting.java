package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//thead/tr/th[1]")).click();
        List<WebElement> elementList =
                driver.findElements(By.xpath("//tbody/tr/td[1]"));
        List<String> originalList =elementList.stream() .map(e -> e.getText()).toList();
        List<String> sortedList = new ArrayList<String>(originalList);
        Collections.sort(sortedList);
               if (originalList.equals(sortedList)) {
            System.out.println("✅ Column is sorted properly");
        } else { 
            System.out.println("❌ Column is NOT sorted properly");
        }

        List<String> price;

        do {
            List<WebElement> rows =
                    driver.findElements(By.xpath("//tbody/tr/td[1]"));

            price = rows.stream()
                    .filter(s -> s.getText().contains("Rice"))
                    .map(s -> getPriceVeggie(s))
                    .collect(Collectors.toList());

            if (price.size() < 1) {
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }

        } while (price.size() < 1);

        price.forEach(a -> System.out.println("Rice Price = " + a));    

	}
	  private static String  getPriceVeggie(WebElement s) {
          return s.findElement(By.xpath("following-sibling::td[1]")).getText();
      }

}
