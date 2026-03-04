package main.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       String password =  getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
String name= "jitendra";
        // Login (wrong credentials)
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
       // driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();

        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(3000);

       // driver.findElement(By.className("logout-btn")).click();
        System.out.println(driver.findElement(By.tagName("p")).getText());
       driver.findElement(By.xpath("//*[text()='Log Out']")).click();
       driver.close();
	}
	
	
	public static  String getPassword(WebDriver driver) throws InterruptedException
	{
		// TODO Auto-generated method stub

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        Thread.sleep(3000);

        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        String[] passwordArray = passwordText.split("'");
        String password = passwordArray[1].split("'")[0];
        return password;

	}

}
