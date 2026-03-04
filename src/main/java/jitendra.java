package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jitendra {

    public static void main(String[] args) {

        // Browser selection
        WebDriver driver = new ChromeDriver();
        // WebDriver driver = new FirefoxDriver(); // Firefox open
        //   WebDriver driver = new EdgeDriver();    // Edge open

        // Open website
        driver.get("https://rahulshettyacademy.com");
       System.out.println( driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       for(int i = 1; i <= 5; i++) {
    	    System.out.println(i+2);
    	}

        // Close browser
      // driver.quit();
    }
}
