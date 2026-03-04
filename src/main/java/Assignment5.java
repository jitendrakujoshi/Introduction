package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com");

        // Click on Frames link
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[22]/a")).click();
       Thread.sleep(2000);
        // Click on Nested Frames
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a")).click();

        // Switch to top frame
        driver.switchTo().frame("frame-top");
        Thread.sleep(2000);

        // Switch to middle frame
        driver.switchTo().frame("frame-middle");

        // Get text from middle frame
        String text = driver.findElement(By.id("content")).getText();
        System.out.println(text);

        driver.quit();
    }
}
