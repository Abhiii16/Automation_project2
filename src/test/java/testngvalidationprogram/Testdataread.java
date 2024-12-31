package testngvalidationprogram;


public class Testdataread {
	
	@Test
	void readdata() throws IOException
	{
		WebDriver driver;
	FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\SeleniumFolder\\testngvalidationprogram\\Propertyfile\\config.properties");	
	Properties pro = new Properties();
	pro.load(fis);
	String browser =pro.getProperty("browser");
	System.out.println(browser);
	String url=pro.getProperty("url");
	System.out.println(url);
	String Username=pro.getProperty("username");
	String Password=pro.getProperty("password");
	if(browser.equalsIgnoreCase("chrome"))
{
driver=new ChromeDriver();
}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("internetexplorer"))
	{
		driver=new InternetExplorerDriver();
	}
	else
	{
		driver= new ChromeDriver();
		
	}
	driver.get(url);
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("username");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	
	//String ele=driver.findElement(By.xpath("")).getText();
	//String text = ele.getText();
	String ActualResult=driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
	String ExpectedResult="Admin Success";
	Assert.assertequals(ActualResult,  ExpectedResult);            
	}

}

