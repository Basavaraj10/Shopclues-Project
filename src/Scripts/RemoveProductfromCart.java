package Scripts;

import org.testng.annotations.Test;

import Genericlib.BasePage;
import POM.HomePage;
import POM.LoginPage;
import POM.ProductPage;

public class RemoveProductfromCart extends BasePage
{
	
	@Test
	public void testingScript() throws InterruptedException
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
	
	h1.cartClick();                            
	Thread.sleep(5000);
	
	h1.viewcartClick();
	Thread.sleep(5000);
	
	System.out.println(" view clicked ");
	
	ProductPage p1 = new ProductPage(driver);
	System.out.println(" product object created ");
	p1.removeProductCart();
	System.out.println(" Remove done ");
	h1.accountClick();                      
	Thread.sleep(5000);
	
	h1.signOut();
	
}

}
