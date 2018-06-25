package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import Genericlib.AutoUtil;
import Genericlib.BasePage;


public class HomePage extends BasePage
{

	@FindBy(xpath="//*[@id='sign-in']/a")
	private WebElement signin;
	 
	@FindBy(xpath="//li[@id='sc_uname']")              //     //li[@id='sc_uname']
	private WebElement account;                  //  //*[@id="sc_uname"]/a
	
	@FindBy(xpath = "//span[@class='notification_count']")
	private WebElement notification;
	
	@FindBy(xpath="//*[@id='autocomplete']") 
	private WebElement searchtb;
	
	@FindBy(xpath="//*[@id='search']/a")
	private WebElement searchbtn;
	
	@FindBy(xpath="//a[.='Location']")
	private WebElement sharelocation;
	
	@FindBy(xpath="//li[@id='wishlist_d']/a")
	private WebElement wishlist;
	
	@FindBy(xpath="//li[@class='qCart']")
	private WebElement cartLogo;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[4]/ul/li[4]/div/div/div[3]/a[1]")
	private WebElement viewcart;
	
	@FindBy(xpath="//*[@id='sc_uname']/div/ul/li[4]/a")
	private WebElement myProfile;
	
	@FindBy(xpath="//a[.='Sign Out']")   
	private WebElement signOut;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signIn()
	{
		signin.click();
	}
	
	public void notification()
	{
		notification.click();
	}
	
	public void searchProduct(String str)
	{
		searchtb.sendKeys(str);
	}
	
	public void shareLocation()
	{
		sharelocation.click();
	}
	
	
	public void accountClick()
	{
		account.click();
	}
	
	public void cartClick()
	{
		cartLogo.click();
	}
	
	public void viewcartClick()
	{
		viewcart.click();
	}
	
	public void Clicksearchbtn()
	{
		searchbtn.click();
	}
	
	
	public void clickWishlist()
	{
		wishlist.click();
	}
	
	public void myprofileClick()
	{
		 myProfile.click();
	}
	
	public void signOut()
	{
		signOut.click();
	}
	
}
