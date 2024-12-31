package testngvalidationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Deletbutton_demo {
	@Test
	void deletebutttondemo()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");	
		driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[2]")).click();
		driver.switchTo().alert().accept();
		}

}
