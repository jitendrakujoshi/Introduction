package main.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://the-internet.herokuapp.com");
	        driver.findElement(By.linkText("Multiple Windows")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Click Here")).click();
	        Thread.sleep(2000);
	        Set<String> windows = driver.getWindowHandles();
	        Iterator<String> it = windows.iterator();
	        String parentWindow = it.next();

	        String childWindow = it.next();

	        driver.switchTo().window(childWindow);

	        System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());

	}

}
