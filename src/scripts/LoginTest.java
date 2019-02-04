package scripts;

import org.testng.Reporter;
import generic.WaitStatementLib;

/*import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import generic.BaseLib;

public class LoginTest extends BaseLib{
 @Test
  public void Login()
 {
	 //go to login page
	 driver.findElement(By.xpath("//*[contains(text(),'School Login')]")).click();
	 //Input username
	 driver.findElement(By.name("Email")).sendKeys("apoorvchandra@gmail.com");
	 //pwd
	 driver.findElement(By.name("Password")).sendKeys("asdf1234");
	 //login button with implicit wait
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//span[text()='More']")).click();
	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//li[text()='Payment Requests']")).click();
	 //driver.findElement(By.xpath("//a[@href='/PaymentRequests']")); 


 }
}*/

import org.testng.annotations.Test;
import generic.BaseLib;
import generic.ExcelUtilities;
import pageobjects.ApproveFeePage;
import pageobjects.CreatePaymntReqstPage;
import pageobjects.LoginPage;

public class LoginTest extends BaseLib {
	@Test
	public void loginTest() {
		LoginPage lp = new LoginPage(driver);
		CreatePaymntReqstPage paymnt = new CreatePaymntReqstPage(driver);
		ApproveFeePage onlyappfee = new ApproveFeePage(driver);
		String username = ExcelUtilities.readData("Sheet1", 1, 1);
		String password = ExcelUtilities.readData("Sheet1", 1, 2);
		lp.login(username, password);
		WaitStatementLib.implicitWaitForMinutes(driver, 20);
		/*
		 * try { Thread.sleep(3000); Reporter.log("Logged in successfully",true); }
		 * catch (InterruptedException e) { e.printStackTrace();
		 * Reporter.log("Cannot login",true); }
		 */
		// navigate to payment request page
		paymnt.navToPaymentreq();
		Reporter.log("Successfully navigated to Lists of payment request page.", true);
		// navigate to create new payment request page
		// CreatePaymntReqstPage newpaymntreq=new CreatePaymntReqstPage(driver);
		String Title = ExcelUtilities.readData("Sheet1", 5, 6);
		String Descrptn = ExcelUtilities.readData("Sheet1", 5, 7);
		paymnt.CreateNewPaymntReq(Title, Descrptn);
		WaitStatementLib.implicitWaitForMinutes(driver, 20);
		/*
		 * try { Thread.sleep(2000);
		 * Reporter.log("New Payment Req created successfully",true); } catch (Exception
		 * e) { e.printStackTrace(); Reporter.log("Cannot create",true); }
		 */
		paymnt.navToPaymentreq();

		// Check for approve fee
	    WaitStatementLib.implicitWaitForMinutes(driver, 20);
		onlyappfee.navtoApproveFee(driver);
		try {
			Thread.sleep(5000);
			Reporter.log("Navigated to approve fee screen successfully.", true);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("Cannot navigate", true);
		}
		onlyappfee.applyFilter(driver);
		WaitStatementLib.implicitWaitForMinutes(driver, 20);
		onlyappfee.allelemnts(driver);
	}

}
