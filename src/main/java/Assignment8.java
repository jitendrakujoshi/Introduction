package main.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> options =
                driver.findElements(By.cssSelector("li.ui-menu-item div"));
        
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("India")) {
                System.out.println("Selected Name: " + option.getText());
                option.click();
                break;
            }
        }

	}

}
