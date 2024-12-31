package testngvalidationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class loginTest {
	
	@Test
	void Testheading()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String ActualText= driver.findElement(By.xpath("/html/body/div/div/h1")).getText();
		String ExpectedText="Welcome again";
		Assert.assertEquals(ActualText, ExpectedText);
	}
	
	
	@Test
	void TestSubheading()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String ActualSubheading = driver.findElement(By.xpath("/html/body/div/div/p")).getText();
		String ExpectedSubheading="login to manage your test and categories";
		Assert.assertEquals(ActualSubheading,ExpectedSubheading );
	}
	
	@Test
	void Testvalidcredential()
	{WebDriver driver = new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	
	String Actualpanel = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
	String Expectedpanel = "Admin Panel";
	Assert.assertEquals(Actualpanel, Expectedpanel);
		
	}

	@Test
	void Testinvalidcredential()
	{{WebDriver driver = new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	driver.findElement(By.xpath("//*[@id=\\\"username\\\"]")).sendKeys("admin23");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password1234");
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();	
	
	String Actualerror = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
	String Expectederror = "incorrect username and password";
	Assert.assertEquals(Actualerror,Expectederror);
	
	}
	
	
	
	
}
	@Test
	void testurl()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String Actualurl = driver.getCurrentUrl();
		String Expectedurl="https://javabykiran.com/selenium/login.html";
		Assert.assertEquals(Actualurl,Expectedurl );
	}
}
