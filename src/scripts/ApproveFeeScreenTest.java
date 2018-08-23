package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Iterator;

import generic.BaseLib;
import pageobjects.ApproveFeePage;

public class ApproveFeeScreenTest extends BaseLib {
	@Test
	public void approveandall() {
		ApproveFeePage appge = new ApproveFeePage(driver);
		Iterator<WebElement> itr = appge.allelemnts().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
