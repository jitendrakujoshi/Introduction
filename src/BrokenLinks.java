import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

    public static void main(String[] args) {
    	
    	ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://rahulshettyacademy.com/AutomationPractice");
    	WebElement footer = driver.findElement(By.id("gf-BIG"));
        List<WebElement> links = footer.findElements(By.tagName("a"));
        System.out.println("Total links in footer: " + links.size());

         for (WebElement link : links) {
            String url = link.getAttribute("href");
           try {
                HttpURLConnection conn =
                       (HttpURLConnection) new URL(url).openConnection();

                  conn.setRequestMethod("HEAD");
                  conn.connect();

                 int responseCode = conn.getResponseCode();

                // Step 4: Broken link condition
                if (responseCode >= 400) {
                    System.out.println(url + " ---- Broken link ❌ ("  + responseCode + ")");
                } 
                else 
                {
                     System.out.println(url + " ---- Valid link ✅ ("  + responseCode + ")");
                }

            } catch (Exception e) {
                System.out.println(url + " ---- Exception occurred");
            }
            
        }

//        driver.quit();
    }
}
