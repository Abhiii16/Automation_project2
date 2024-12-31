package testngvalidationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebooklogintest {
	@Test 
	void TestHeading()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String AactualHeading=driver.findElement(By.xpath("//*[@id=\"header_block\"]/span/div")).getText();
		String ExpextedHesding = "Log in to Facebook";
		Assert.assertEquals(AactualHeading, ExpextedHesding);
	}
	
	@Test
	void TestValidCredential()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");	
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7775948846");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mh12fx5342");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
		String ActualPage = driver.findElement(By.xpath("//*[@id=\"mount_0_0_SA\"]/div/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/span")).getText();
		String Expectedpage = "search";
		Assert.assertEquals(ActualPage,Expectedpage );
	}

	@Test
	void invalidusernamecredential()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");	
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abhishekpanmand430@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mh12fx5342");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
		String ActualError = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();
		String ExpectedError = "invalid usename";
		Assert.assertEquals(ActualError,  ExpectedError);
	}
	
	@Test
	void invalidpasswordtest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7775948846");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mh12fx5242");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
		String ActualError = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]")).getText();
		String ExpectedError = "invalid Password";
		Assert.assertEquals(ActualError,  ExpectedError);
		
	}
	
	@Test
	void forgetpasswordtTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id=\"u_0_2_bm\"]/div[3]/a")).click();
		String ActualText = driver.findElement(By.xpath("//*[@id=\"header_block\"]/span/div/div[1]/div[2]/span")).getText();
		String ExpectedText="Log in as Abhishek Panmand";
		Assert.assertEquals(ActualText ,ExpectedText );
	}
	@Test
	void urlTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String Actualurl=driver.getCurrentUrl();
		String Expectedurl="https://www.facebook.com/login/";
		Assert.assertEquals(Actualurl,Expectedurl );
	}


@Test
void TileTest()
{

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	String ActualTitle = driver.getTitle();
	String ExpectedTitle="Log in to Facebook";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
}
@Test
void forgetAccountTest()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");
	driver.findElement(By.xpath("//*[@id=\"login_link\"]/a[1]")).click();
	String ActualText = driver.findElement(By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[2]/div/table/tbody/tr[1]/td[2]/div")).getText();
	String ExpectedText="identify your acount";
	Assert.assertEquals(ActualText ,ExpectedText );


}
}
