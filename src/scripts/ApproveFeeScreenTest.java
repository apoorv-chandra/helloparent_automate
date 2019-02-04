package scripts;

import org.openqa.selenium.WebElement;
import java.util.Iterator;
import generic.BaseLib;
import pageobjects.ApproveFeePage;

public class ApproveFeeScreenTest extends BaseLib {
	public void approveandall() {
		ApproveFeePage appge = new ApproveFeePage(driver);
		Iterator<WebElement> itr = appge.allelemnts(driver).iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
