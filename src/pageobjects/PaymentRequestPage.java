package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BaseLib;

public class PaymentRequestPage extends BaseLib{
  @FindBy(xpath="//span[text()='Fees']")
  private WebElement navToPaymntreqlink;
  @FindBy(xpath="//li[text()='Payment Requests']")
  private WebElement clickonPaymntReq;
 			  
  public PaymentRequestPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
  
  public void navToPaymentreq(){
		navToPaymntreqlink.click();
		clickonPaymntReq.click();
			}
}