package Scripts;
import org.testng.annotations.Test;

import Genericlib.BaseTest;
import POM.LoginPage;
import POM.ProductPage;
import POM.HomePage;

public class AddProducttoCart extends BaseTest
{
		@Test
	public void testingScript() throws InterruptedException
	{
		
		HomePage h1 = new HomePage(driver);
		h1.signIn();
		
		LoginPage l1 = new LoginPage(driver);
		Thread.sleep(5000);
		l1.username(Genericlib.Excel.excelSheet(Sheet, 0, 0, path));
		Thread.sleep(5000);
		l1.password(Genericlib.Excel.excelSheet(Sheet, 0, 1, path));
		Thread.sleep(5000);
		l1.login();
		
		ProductPage p1 = new ProductPage(driver);
		Thread.sleep(7000);
		
		p1.clickProductElement();
		Thread.sleep(5000);
		
		//p1.clickProductCmpny();
	//	Thread.sleep(5000);
		
		//p1.clickProduct();
		//Thread.sleep(5000);
		                                         //dont erase
		//p1.addToCart();
		//Thread.sleep(5000);
		
		h1.accountClick();
		Thread.sleep(5000);
		
		h1.signOut();
		
		
		
		
	}
}
