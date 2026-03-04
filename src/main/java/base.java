package main.java;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		// Items to add in cart
		List<String> itemsNeeded = Arrays.asList("Cucumber", "Beetroot", "Brocolli", "Carrot");

		// Get all product names
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// Get all ADD TO CART buttons
		List<WebElement> addToCartButtons = driver.findElements(By.xpath("//div[@class='product-action']/button"));

		int addedCount = 0;

		for (int i = 0; i < products.size(); i++) {

			String productName = products.get(i).getText();

			// Remove quantity part (like "- 1 Kg")
			String formattedName = productName.split("-")[0].trim();

			// Check if product is in required list
			if (itemsNeeded.contains(formattedName)) {

				addToCartButtons.get(i).click();
				addedCount++;

				// Stop when all items are added
				if (addedCount == itemsNeeded.size()) {
					break;
				}
			}
		}
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li/a\r\n")).click();
		Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy1");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		Thread.sleep(2000);
		 // Wait for promo info
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        // Print promo message
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

		//System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		// driver.quit();
	}
}
