package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // Name
        driver.findElement(By.name("name")).sendKeys("jitendra");

        // Email
        driver.findElement(By.name("email")).sendKeys("jitu@123");

        // Password
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("123");

        // Checkbox
        driver.findElement(By.id("exampleCheck1")).click();

        // Dropdown (Gender)
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Female");

        // Radio Button (Employed / Student)
        driver.findElement(By.id("inlineRadio2")).click();
		Thread.sleep(1000);

        // DOB select (IMPORTANT)
        driver.findElement(By.name("bday")).sendKeys("08-10-2002");

        // Submit
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // Success message print
        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());



    }
}
