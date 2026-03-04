package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
	        checkbox.click();
	        String checkboxValue = checkbox.getAttribute("value");

	        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
	        Select select = new Select(dropdown);
	        select.selectByValue(checkboxValue);

	        WebElement inputBox = driver.findElement(By.id("name"));
	        inputBox.sendKeys(checkboxValue);
	        driver.findElement(By.id("alertbtn")).click();
	        Thread.sleep(2000);
	        driver.switchTo().alert().accept();
	}

}
