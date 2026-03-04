package main.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScroll {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Page scroll
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

        // Table scroll
        js.executeScript(
                "document.querySelector('.tableFixHead').scrollTop=500");
        Thread.sleep(2000);

        // 4rd column ke saare values
        List<WebElement> values =
                driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum=0;


        for (int i =0; i<values.size(); i++) {
        	
        	sum=sum+Integer.parseInt(values.get(i).getText());
        }
        System.out.println("Total amount "+ sum);
    }
}
