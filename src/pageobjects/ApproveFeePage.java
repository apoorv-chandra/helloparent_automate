package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ApproveFeePage {
	@FindBys(@FindBy(xpath="//td[text()='Approved']"))
	private List<WebElement> allapproved;


	@FindBy(xpath="")
	private WebElement navtoApproveFee;

	public ApproveFeePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void navtoApproveFee() {

	}
	public List<WebElement> allelemnts() {

		return allapproved;
	}
}
