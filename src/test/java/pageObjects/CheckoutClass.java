package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutClass extends BasePage {
	
	public CheckoutClass(WebDriver driver) {
		super(driver);
		
	}
	
	//locator
	@FindBy(xpath="//input[@id='button-payment-address']")
	WebElement billingDetailsContinuebtn;
	
	@FindBy(xpath="//input[@id='button-shipping-address']")
	WebElement deliverydetailContinuebtn;
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	WebElement deliveryMethodContinuebtn;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement policyCheckbox;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement paymentContinuebtn;
	
	@FindBy(xpath="//input[@id='button-confirm']")
	WebElement confirmOrderbtn;
	
	@FindBy(xpath="//h1[normalize-space()='Your order has been placed!']")
	WebElement confirmMessage;
	
	
	

	//Actions Methods
	
	public void clickBillingContinue() {
		billingDetailsContinuebtn.click();
	}
	
	public void clickDeliveryDetailContinue() {
		deliverydetailContinuebtn.click();
	}
	
	public void clickDeliveryMethodContinue() {
		deliveryMethodContinuebtn.click();
	}
	public void clickpolicyCheckbox() {
		policyCheckbox.click();
	}
	public void clickPaymentMethodContinue() {
		paymentContinuebtn.click();
	}
	public void confirmOrder() {
		confirmOrderbtn.click();
	}
	public String getConfirmMessage() {
		String confirmText = confirmMessage.getText();
		return confirmText;
	}

}
