package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String month="June";
		String date="15";
		String year= "2027";
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");		
		driver.findElement(By.cssSelector(".react-date-picker__calendar-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		Thread.sleep(1000);

        driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
        driver.findElement(By.xpath("//abbr[@aria-label='" + month + " " + year + "']")).click();
        driver.findElement(By.xpath("//abbr[@aria-label='" + month + " " + date + ", " + year + "']")).click();

        String selectedDate = driver
                .findElement(By.cssSelector(".react-date-picker__inputGroup input"))
                .getAttribute("value");

        System.out.println("Selected Date: " + selectedDate);        		
        		
        		
       }

}
