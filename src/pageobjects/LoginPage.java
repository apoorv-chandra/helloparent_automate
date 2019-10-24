package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WaitStatementLib;

public class LoginPage {
	@FindBy(xpath = "//*[contains(text(),'School Login')]")
	private WebElement goToLoginHyperlink;
	@FindBy(name = "Email")
	private WebElement unTxtBx;
	@FindBy(name = "Password")
	private WebElement pwdTxtBx;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	//Logout Elements
	@FindBy(xpath = "//li[@class='nav-item dropdown log-out open']")
	private WebElement clickfrLogout;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	private WebElement clicklogout;
	
	

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void login(String username, String password) {
		goToLoginHyperlink.click();
		unTxtBx.sendKeys(username);
		pwdTxtBx.sendKeys(password);
		loginBtn.click();
	}
	
	public void logout()
	{
		clickfrLogout.click();
		clicklogout.click();
	}
	
}
