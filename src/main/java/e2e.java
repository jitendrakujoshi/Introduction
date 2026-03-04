package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2e {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open website
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // -------- FROM CITY --------
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
        Thread.sleep(1000);

        // -------- TO CITY --------
        driver.findElement(By.xpath(
            "//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"
        )).click();

        // -------- CURRENT DATE --------
       // driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        // -------- CHECK RETURN DATE ENABLED --------
        String style = driver.findElement(By.id("Div1")).getAttribute("style");
        System.out.println("Return date style: " + style);

        if (style.contains("0.5")) {
            System.out.println("Return date is enabled");
        } else {
            System.out.println("Return date is NOT enabled");
        }

        Thread.sleep(2000);
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
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
		driver.findElement( By.cssSelector("#ctl00_mainContent_chk_IndArm")).click();
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

       // driver.quit();
    }
}
