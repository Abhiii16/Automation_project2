package testngvalidationprogram;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingWebTable {
	@Test
	void handlingTableHederCount()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		int count=0;
		for(int i=1;i<=5;i++)
		{
		String headertextcount=driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th["+i+"]")).getText();
		System.out.println( headertextcount);
		count++;
		}
		//System.out.println(count);
		Assert.assertEquals(count, 6);
	}
	
	@Test
	void handlingTextHeder()
	{ArrayList<String> arr = new ArrayList<String>();
	arr.add("Category ID");
	arr.add("Category Name");
	arr.add("Created At");
	arr.add("Modified At");
	arr.add("Actions");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");	
		for(int i=1;i<=5;i++)
		{
		String Actualheadertext=driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th["+i+"]")).getText();
		String ExpectedText=arr.get(i-1);
		Assert.assertEquals(Actualheadertext,ExpectedText );
		
		}
	}

}
;
