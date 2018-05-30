package scripts;
import generic.BaseLib;
import pageobjects.PaymentRequestPage;

public class PaymentRequestTest extends BaseLib{
	public void paymentRequest() {
		PaymentRequestPage paymntreq=new PaymentRequestPage(driver);
		paymntreq.navToPaymentreq();
	}
}



