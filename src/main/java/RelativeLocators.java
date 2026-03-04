package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // ABOVE
        WebElement nameEditBox =
                driver.findElement(By.cssSelector("[name='name']"));

        String labelText = driver.findElement(
                with(By.tagName("label")).above(nameEditBox)
        ).getText();

        System.out.println("Name: " + labelText);

        // BELOW
        WebElement dateOfBirthLabel =
                driver.findElement(By.cssSelector("[for='dateofBirth']"));

        driver.findElement(
                with(By.tagName("input")).below(dateOfBirthLabel)
        ).click();
        System.out.println("Clicked input below label: " + dateOfBirthLabel.getText());

        // TO LEFT OF
        WebElement iceCreamLabel =
                driver.findElement(By.cssSelector(".form-check-label"));

        driver.findElement(
                with(By.tagName("input")).toLeftOf(iceCreamLabel)
        ).click();
        System.out.println("Checkbox selected for: " + iceCreamLabel.getText());

        
        WebElement rdb = driver.findElement(By.id("inlineRadio1"));
        
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
        
        
        
        
        
        
        
        
        
        
        
    }
}
