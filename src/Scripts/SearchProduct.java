package Scripts;

import org.testng.annotations.Test;
import Genericlib.BasePage;
import POM.HomePage;
import POM.LoginPage;

public class SearchProduct extends BasePage
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
	
	Thread.sleep(7000);
	h1.searchProduct("watches");
	
	Thread.sleep(5000);
	h1.Clicksearchbtn();
	
	Thread.sleep(10000);
	h1.accountClick();
	
	//Thread.sleep(5000);
	//h1.cartClick();
	
	Thread.sleep(5000);
	h1.signOut();
	
	
	}

}
