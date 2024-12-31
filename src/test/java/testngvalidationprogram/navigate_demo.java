package testngvalidationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class navigate_demo {
	@Test
	void navigatedemo() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("Pke_EE")).sendKeys("shooes");
		Actions as = new Actions(driver);
		as.sendKeys(Keys.ENTER);
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
