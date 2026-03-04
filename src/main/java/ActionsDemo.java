package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		Actions a = new Actions(driver);

		WebElement accountList =
		        driver.findElement(By.id("nav-link-accountList"));

		WebElement searchBox =
		        driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(accountList).moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("jitendra") .build() .perform();
	}

}
