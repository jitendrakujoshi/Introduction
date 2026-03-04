package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
		driver.findElement( By.cssSelector("#ctl00_mainContent_chk_IndArm")).click();
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
		
		
		
		
		//count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
//		int i=1;
//		while(i<5)
//		{
//		driver.findElement(By.id("hrefIncAdt")).click();
//		i++;
//		}
		for(int i=1; i<4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		Thread.sleep(1000);
		
		for(int j=1; j<=2; j++) {
			driver.findElement(By.id("hrefIncChd")).click();

		}
		Thread.sleep(2000);
		
		for(int j=1; j<=1; j++) {
			driver.findElement(By.id("hrefIncInf")).click();

		}
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Thread.sleep(2000);


		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		
	//	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		String style = driver.findElement(By.id("Div1")).getAttribute("style");
		System.out.println(style);
 
		if (style.contains("1")) {
		    System.out.println("Div1 is enabled");
		    Assert.assertTrue(true);
		} else {
		    System.out.println("Div1 is disabled");
		    Assert.assertTrue(false);
		}

	}

}
