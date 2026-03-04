package main.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
        WebElement table = driver.findElement(By.id("product"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println("Total Rows = " + rows.size());
        List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
        System.out.println("Total Columns = " + columns.size());
        System.out.println("Second Row Data:");

        List<WebElement> secondRowData =
                rows.get(1).findElements(By.xpath("/html/body/div[3]/div[1]/fieldset/table/tbody/tr[3]"));

        for (WebElement data : secondRowData) {
            System.out.println(data.getText());
        }

	}

}
