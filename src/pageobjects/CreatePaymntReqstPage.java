package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BaseLib;

public class CreatePaymntReqstPage extends BaseLib{
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
	
	public CreatePaymntReqstPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void CreateNewPaymntReq(String Title, String Descrptn, String Amount)
	{
		title.sendKeys(Title);
		Desc.sendKeys(Descrptn);
		amount.sendKeys(Amount);
		lstdate.sendKeys("10 June 2018");
		clickonstdntlst.click();
		slctStudent.click();
		createPaymntReq.click();	
		
	}
}
