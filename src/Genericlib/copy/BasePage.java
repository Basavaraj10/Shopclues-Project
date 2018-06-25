package Genericlib.copy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage extends BaseTest
{
	public void elementPresent (WebElement element)
	{
		try
		{
			WebDriverWait w = new WebDriverWait(driver,20);
			w.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not present", true);
			Assert.fail();
		}
	}
	
	public void clickableElement(WebElement element)
	{
		try
		{
			WebDriverWait w = new WebDriverWait(driver,20);
			w.until(ExpectedConditions.elementToBeClickable(element));
			Reporter.log("element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not present", true);
			Assert.fail();
		}
	}
	
	public void verifyTitle(String title)
	{
		try{
			WebDriverWait w = new WebDriverWait(driver,5);
			w.until(ExpectedConditions.titleContains(title));
					Reporter.log("element is present",true);
			}
			catch(Exception e)
			{
				Reporter.log("element not present", true);	
				Assert.fail();
			}
	}
	
	
}
