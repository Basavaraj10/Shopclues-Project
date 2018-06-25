package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;

public class LocationPage extends BasePage 
{
	@FindBy(id="pin_code_popup")
	private WebElement addpin;
	
	@FindBy(id="get_pincode_popup")
	private WebElement submitpin;
	
	
	
	public LocationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterLocationPin(String str)
	{
		addpin.sendKeys(str);
	}
	
	public void submitLocationPin()
	{
		submitpin.click();
	}

}
