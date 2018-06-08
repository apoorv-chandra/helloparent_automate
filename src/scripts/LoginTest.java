package scripts;

import org.testng.Reporter;

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
import pageobjects.CreatePaymntReqstPage;
import pageobjects.LoginPage;
import pageobjects.PaymentRequestPage;

public class LoginTest extends BaseLib{
	@Test
	public void loginTest(){
		LoginPage lp=new LoginPage(driver);
		PaymentRequestPage paymnt=new PaymentRequestPage(driver);
		CreatePaymntReqstPage newpaymntreq=new CreatePaymntReqstPage(driver);
		String username = ExcelUtilities.readData("Sheet1", 1, 1);
		String password = ExcelUtilities.readData("Sheet1", 1, 2);
		String Title = ExcelUtilities.readData("Sheet1", 5, 5);
		String Descrptn = ExcelUtilities.readData("Sheet1", 6, 5);
		String Amount = ExcelUtilities.readData("Sheet1", 7, 5);
		lp.login(username, password);
		try {
			Thread.sleep(3000);
			Reporter.log("Logged in successfully",true);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Reporter.log("Cannot login",true);
		}	
		paymnt.navToPaymentreq();
		Reporter.log("Successfully navigated to Create payment request page.",true);
		newpaymntreq.CreateNewPaymntReq(Title, Descrptn, Amount);
		try {
			Thread.sleep(2000);
			Reporter.log("New Payment Req created successfully",true);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("Cannot create",true);
		}
	}
}