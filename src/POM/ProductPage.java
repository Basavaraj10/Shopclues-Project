package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;

public class ProductPage extends BasePage
{	
	@FindBy(xpath="//*[@id='nav_2']/a")          
	private WebElement pdctElement; 
	
	@FindBy(xpath="(//*[@id='column_1']/ul/li[7]/a)[1]")         /// //img[@id="det_img_125282511"]
	private WebElement pdctcmpny;
	
	@FindBy(xpath="//a[@class='remove']")
	private WebElement pdtRemovecart;
	
	@FindBy(xpath=" //img[contains(@id,'det_img_125282511')]")                     //  //img[contains(@id,'det_img_125282511')]             
	private WebElement product;
	
	@FindBy(xpath="//*[@id='add_cart']")
	private WebElement addCart;
	
	@FindBy(xpath="//*[@id='product_list']/div[3]/div[1]/a[1]")
	private WebElement addWishList;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickProductElement()
	{
		pdctElement.click();
	}
	
	public void clickProductCmpny()
	{
		pdctcmpny.click();
	}

	public void clickProduct()
	{
		clickableElement(product);
	}
	
	public void removeProductCart()
	{
		pdtRemovecart.click();
	}

	public void addToCart()
	{
		addCart.click();
	}
	
	public void addToWishlist() 
	{													
		addWishList.click();
	}
}
