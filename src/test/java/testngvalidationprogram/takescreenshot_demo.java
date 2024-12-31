package testngvalidationprogram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshot_demo {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		File fl=new File(".//screenshot//Subcategory.png");
		FileUtils.copyFile(file, fl);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]"));
		File file1=ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, file1(".//screenshot//Subcategory.png"));
		
		
		
	}

	private static File file1(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
