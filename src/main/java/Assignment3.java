package main.java;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        // Enter username
        driver.findElement(By.cssSelector("#username"))
                .sendKeys("rahulshettyacademy");

        // Enter password
        driver.findElement(By.cssSelector("#password"))
                .sendKeys("learning");

        // Accept terms
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[4]/div/label[2]/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("okayBtn")).click();
        WebElement roleDropdown =
                driver.findElement(By.cssSelector("select.form-control"));

        Select select = new Select(roleDropdown);
        select.selectByVisibleText("Teacher");
        driver.findElement(By.id("terms")).click();

        
        // Click Sign In
        driver.findElement(By.id("signInBtn")).click();

        
        List<String> itemsNeeded = Arrays.asList(
                "iphone X",
                "Samsung Note 8",
                "Nokia Edge",
                "Blackberry"
        );

        // All product titles
        List<WebElement> products =
                driver.findElements(By.cssSelector("h4.card-title"));

        // All Add buttons
        List<WebElement> addButtons =
                driver.findElements(By.cssSelector("button.btn.btn-info"));

        for (int i = 0; i < products.size(); i++) {

            String productName = products.get(i).getText();

            if (itemsNeeded.contains(productName)) {
                addButtons.get(i).click();
            }
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector(".nav-link.btn.btn-primary")
        )).click();
        


        // driver.quit();
    }
}
