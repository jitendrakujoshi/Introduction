package main.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadDownload {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click Download button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("downloadButton"))).click();

        // ✅ Full file path with file name
        String filePath = "C:\\Users\\Lenovo\\Downloads\\download.xlsx";

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

        
        // Wait till upload input is present & upload file
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fileinput")))
            .sendKeys(filePath);
        
        System.out.println("Updated Excel Data Successfully");
    }
}
