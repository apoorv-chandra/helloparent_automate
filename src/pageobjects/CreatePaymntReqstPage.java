package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BaseLib;

public class CreatePaymntReqstPage extends BaseLib{
	@FindBy(xpath="//a[text()='Create New']")
	private WebElement clickonCreate;
	@FindBy(id="Title")
	private WebElement title;
	@FindBy(id="Description")
	private WebElement Desc;
	@FindBy(id="Amount")
	private WebElement amount;
	@FindBy(id="LastDate")
	private WebElement lstdate;
	@FindBy(xpath="//input[@type='search']/following::li[1]")
	private WebElement clickonstdntlst;
	@FindBy(xpath="//li[@class='select2-results__option']/following::li[2]")
	private WebElement slctStudent;
	@FindBy(xpath="//span[contains(text(),'Send')]")
	private WebElement createPaymntReq;
	@FindBy(id="view")
	private WebElement clickoutside;

	@FindBy(xpath="//span[text()='Fees']")
	private WebElement navToPaymntreqlink;
	@FindBy(xpath="//li[text()='Payment Requests']")
	private WebElement clickonPaymntReq;


	public CreatePaymntReqstPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void CreateNewPaymntReq(String Title, String Descrptn)
	{
		clickonCreate.click();
		title.sendKeys(Title);
		Desc.sendKeys(Descrptn);
		//amount.sendKeys(String.valueOf(Amount));
		amount.sendKeys("550");
		lstdate.sendKeys("10 June 2018");
		clickoutside.click();
		clickonstdntlst.click();
		slctStudent.click();
		createPaymntReq.click();

	}

	public void navToPaymentreq(){
		navToPaymntreqlink.click();
		clickonPaymntReq.click();
	}
}
