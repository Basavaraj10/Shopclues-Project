package Scripts;

import org.testng.annotations.Test;

import Genericlib.BasePage;
import POM.HomePage;
import POM.LoginPage;
import POM.ProductPage;

public class RemoveProductfromWishList extends BasePage
{
	@Test
	public void testingScripts() throws InterruptedException
	{
		HomePage h1 = new HomePage(driver);
		h1.signIn();
		Thread.sleep(5000);
		
		LoginPage l1 = new LoginPage(driver);         
		l1.username(Genericlib.Excel.excelSheet(Sheet, 0, 0, path));   
		Thread.sleep(5000);
		l1.password(Genericlib.Excel.excelSheet(Sheet, 0, 1, path));
		Thread.sleep(5000);
		l1.login();
		Thread.sleep(5000);              
		
		h1.clickWishlist();
		Thread.sleep(5000);
		
		ProductPage p1 = new ProductPage(driver);
		
		Thread.sleep(5000);
		p1.removeProductCart();
		
		Thread.sleep(5000);
		h1.accountClick();
		Thread.sleep(5000);
		
		h1.signOut();
		
		
		
		
	}

}
