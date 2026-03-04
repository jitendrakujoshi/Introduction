package main.java;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Give me the count of link on the page.
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		 // Footer ko locate karo
        WebElement footer = driver.findElement(By.id("gf-BIG"));

        // Footer ke andar saare links
        List<WebElement> footerLinks = footer.findElements(By.tagName("a")); //Limiting webDriver scope

        // Count print karo
        System.out.println("Footer me total links: " + footerLinks.size());
        
        
     // Step 2: Footer ke first column ko locate karo
        WebElement firstColumn = footer.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));

        // Step 3: First column ke andar sabhi links
        List<WebElement> links = firstColumn.findElements(By.tagName("a"));

        // Step 4: Count print karo
        System.out.println("Footer ke first column me total links: " + links.size());
        
        // Step 4: Har link ko new tab me open karo
        for (WebElement link : links) {
            link.sendKeys(Keys.CONTROL, Keys.ENTER);
            Thread.sleep(1000); // thoda delay (optional)
        }
        
        
//        WebElement secondColumn = footer.findElement(By.xpath("/html/body/div[6]/table/tbody/tr/td[2]/ul"));
//        List<WebElement> links1 = secondColumn.findElements(By.tagName("a"));
//        System.out.println("Footer ke second column me total links: " + links1.size());
//        // Step 4: Har link ko new tab me open karo
//        for (WebElement link : links1) {
//            link.sendKeys(Keys.CONTROL, Keys.ENTER);
//            Thread.sleep(1000); // thoda delay (optional)
//        }
//        
        
        
        
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        while (it.hasNext()) {
            String windowId = it.next();
            driver.switchTo().window(windowId);
            System.out.println(driver.getTitle());
        }


	}

}
