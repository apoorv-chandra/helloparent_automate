package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ApproveFeePage {
	@FindBys(@FindBy(xpath = "//td[text()='Approved']"))
	private List<WebElement> allapproved;

	@FindBy(xpath = "//span[text()='Fees']")
	private WebElement hovtoFees;

	@FindBy(xpath = "//a[text()='Generate Fees']")
	private WebElement hovtoGenFees;

	@FindBy(xpath = "//a[text()='Approve Fees']")
	private WebElement navtoApproveFee;

	public ApproveFeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void navtoApproveFee(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(hovtoFees).moveToElement(hovtoGenFees).moveToElement(navtoApproveFee)
				.click(navtoApproveFee).build().perform();
		// navtoApproveFee.click();
	}

	public List<WebElement> allelemnts() {

		return allapproved;
	}
}
