package scripts;

import generic.BaseLib;
import pageobjects.CreatePaymntReqstPage;
//import pageobjects.PaymentRequestPage;

public class PaymentRequestTest extends BaseLib {
	public void paymentRequest() {
		CreatePaymntReqstPage paymntreq = new CreatePaymntReqstPage(driver);
		paymntreq.navToPaymentreq();
	}
}
