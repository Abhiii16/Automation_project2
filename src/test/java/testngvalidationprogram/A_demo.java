package testngvalidationprogram;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_demo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("java");
	Actions as = new Actions(driver);
	as.sendKeys(Keys.ENTER).perform();
		
		
	
	}
	

}
