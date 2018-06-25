package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Genericlib.BasePage;

public class MyProfile extends BasePage
{
	@FindBy(xpath="//*[@id='content']/div[1]/div[5]/div/div/div[2]/div/div/div/div[1]/ul/li[4]/a")         
	private WebElement changepwd; 
	
	@FindBy(id="passwordc")
	private WebElement currentPwd;
	
	@FindBy(id="password1")
	private WebElement newPwd;
	
	@FindBy(id="password2")
	private WebElement confirmPwd;
	
	@FindBy(name="dispatch[profiles.updatepassword]")
	private WebElement changepwdbtn;
	
	
	public MyProfile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickChangepwd()
	{
		changepwd.click();
	}
	
	public void changePassword(String oldpwd, String newpwd)
	{
		try{
		currentPwd.sendKeys(oldpwd);
		newPwd.sendKeys(newpwd);
		confirmPwd.sendKeys(newpwd);
		 Reporter.log("Password is Changed",true);
		}
		catch(Exception e)
		{
			 Reporter.log("Password is not Changed",true);	
		}
	}
	
	public void clickChangePwdButton()
	{
		 changepwdbtn.click();
	}
}
