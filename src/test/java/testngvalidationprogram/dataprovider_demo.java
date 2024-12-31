package testngvalidationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_demo {
	@Test(dataProvider = "login_Data")
	void testvalidation(String username,String pass)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	}
	
	@DataProvider
	Object [][] login_Data()
	{
	Object[][] obj={
			{"admin","password123"},
			{"admin121","passwpord123345"},
			{"###","&@@*"},
			{"   ","  "}
			};
	return obj;
	
	}

	}

