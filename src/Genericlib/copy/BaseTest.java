package Genericlib.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constant
{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(chrome_key, chrome_Value);
		driver=new ChromeDriver();
		driver.get("http:/www.shopclues.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
}
