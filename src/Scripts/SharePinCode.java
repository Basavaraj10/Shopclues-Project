package Scripts;

import org.testng.annotations.Test;
import Genericlib.BasePage;
import POM.HomePage;
import POM.LocationPage;
import POM.LoginPage;

public class SharePinCode extends BasePage
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
	
	System.out.println(" Loging done");
	
	Thread.sleep(5000);
	h1.shareLocation();                               // click on share location
	
	System.out.println(" Share location done");
	
	Thread.sleep(5000);
	LocationPage l2 = new LocationPage(driver); // location page object is created
	
	Thread.sleep(5000);
	l2.enterLocationPin("753004");      //   takes location pin
	
	System.out.println(" entering pin done");
	
	Thread.sleep(5000); 
	l2.submitLocationPin();                                   //    clicks on submit button
	
	System.out.println(" submit done");
	
	Thread.sleep(10000);
	h1.accountClick();                                      // clicks on my account 
	
	System.out.println(" account clicking done");
	
	Thread.sleep(5000);                                  //         click on sign out
	h1.signOut();
	
	
	}


}
