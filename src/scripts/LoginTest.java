package scripts;

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
import pageobjects.LoginPage;
import pageobjects.PaymentRequestPage;

public class LoginTest extends BaseLib{
	@Test
	public void loginTest(){
		LoginPage lp=new LoginPage(driver);
		PaymentRequestPage paymnt=new PaymentRequestPage(driver);
		String username = ExcelUtilities.readData("Sheet1", 1, 1);
		String password = ExcelUtilities.readData("Sheet1", 1, 2);
		lp.login(username, password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		paymnt.navToPaymentreq();
	
	}
}
