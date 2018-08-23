package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//*[contains(text(),'School Login')]")
	private WebElement goToLoginHyperlink;
	@FindBy(name="Email")
	private WebElement unTxtBx;
	@FindBy(name="Password")
	private WebElement pwdTxtBx;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;

	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void login(String username, String password){
		goToLoginHyperlink.click();
		unTxtBx.sendKeys(username);
		pwdTxtBx.sendKeys(password);
		loginBtn.click();
	}
}
