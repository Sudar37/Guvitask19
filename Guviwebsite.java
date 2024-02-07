package Guvitask19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guviwebsite {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Guvi registration page
        driver.get("https://www.guvi.in/register");

        driver.findElement(By.id("email"));

        driver.findElement(By.className("signup-button"));

        driver.findElement(By.tagName("input"));

        driver.findElement(By.cssSelector("#checkUser"));

        driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));

        // Print verification message
        System.out.println("All locators found successfully!");

        // Close the browser
        driver.quit();
	}

}
