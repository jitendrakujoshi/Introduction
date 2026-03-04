package main.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Open URL
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();

        // Login (wrong credentials)
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademya");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();

        driver.findElement(By.className("signInBtn")).click();

       // driver.findElement(By.className("logout-btn")).click();

        // Print error message
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        // Click on Forgot password
        driver.findElement(By.linkText("Forgot your password?")).click();

        // Small wait for animation (learning purpose)
        Thread.sleep(3000);

        // Fill forgot password form
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jitendra joshi");
        driver.findElement(By.cssSelector("input[placeholder='Email']"))
              .sendKeys("jitendrajjoshi01@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']"))
              .sendKeys("7907095009");

        // Click on "Go to Login" using JavaScript (FIXED)
       // JavascriptExecutor js = (JavascriptExecutor) driver;
       // WebElement goToLoginBtn = driver.findElement(By.className("go-to-login-btn"));
       // js.executeScript("arguments[0].click();", goToLoginBtn);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
       //  System.out.println( driver.findElement(By.cssSelector("from p")).getText());

        Thread.sleep(3000);
           driver.findElement(By.className("go-to-login-btn")).click();

          // driver.findElement(By.id("visitUsTwo")).click();

          // //div[@class='forgot-pwd-btn-conainer']/button[1]
        // Optional: Close browser
        // driver.quit();
    }
}
