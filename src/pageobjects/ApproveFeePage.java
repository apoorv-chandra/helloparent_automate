package pageobjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApproveFeePage {
	@FindBys(@FindBy(xpath = "//td[text()='Approved']"))
	private List<WebElement> allapproved;

	@FindBy(xpath = "//span[text()='Fees']")
	private WebElement hovtoFees;

	@FindBy(xpath = "//a[text()='Generate Fees']")
	private WebElement hovtoGenFees;

	@FindBy(xpath = "//li[text()=' Approve Fees']")
	private WebElement navtoApproveFee;

	@FindBy(xpath = "//ul[@class='select2-selection__rendered']")
	private WebElement filterBoxClick;
	
	@FindBy(xpath = "//span[@class='select2-selection__choice__remove']")
	private WebElement rmvAlready;
	
	//@FindBy(xpath = "//span[@aria-activedescendant='select2-FeeStatus-result-8hjb-Approved']")
	@FindBy(xpath = "//li[@id='select2-FeeStatus-result-d6r7-Approved']")
	private WebElement selectApprovedFilter;
	
	@FindBy(xpath = "//button[text()='Filter']")
	private WebElement clickFilter;
	
	@FindBy(xpath = "//ul[@id='select2-FeeStatus-results']/li[1]")
	private WebElement selectAlloption;
	
	@FindBys
	({@FindBy(xpath = "//td[text()='Approved']")})
	private List<WebElement> allApproved;
	
	public ApproveFeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void navtoApproveFee(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(hovtoFees).moveToElement(hovtoGenFees).click(navtoApproveFee).build().perform();
		// moveToElement(navtoApproveFee)
		// navtoApproveFee.click();
	}
	
	public void applyFilter(WebDriver driver)
	{
		rmvAlready.click();
		filterBoxClick.click();
		selectAlloption.click();
		//filterchange.sendKeys("Appro");
		selectApprovedFilter.click();
		//Select approved=new Select(selectApprovedFilter);
		//approved.selectByValue("Approved");
		clickFilter.click();
		
	}

	public List<WebElement> allelemnts(WebDriver driver) {
		Iterator<WebElement> itr = allApproved.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		return (List<WebElement>) itr;
	}
}
