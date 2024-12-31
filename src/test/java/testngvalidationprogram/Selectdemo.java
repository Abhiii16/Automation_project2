package testngvalidationprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selectdemo {
	@Test
	void selectdemoprogram()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		driver.findElement(By.id("add-subcategory")).click();
		WebElement ele=driver.findElement(By.name("parentCategory"));
Select sc = new Select(ele);
sc.selectByIndex(1);


		 
		 
}
	@Test
	void validatecount()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		driver.findElement(By.id("add-subcategory")).click();
		WebElement ele=driver.findElement(By.name("parentCategory"));
		Select sc = new Select(ele);
		List<WebElement> values= sc.getOptions();
	}

}
