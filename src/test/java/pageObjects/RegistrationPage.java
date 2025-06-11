package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	// locators

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement telephone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement confirmPassword;

	@FindBy(xpath = "//label[normalize-space()='Yes']")
	WebElement suscribe_yes;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement policyCheckbox;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement buttonContinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confirmMessage;

	// Actions Methods getter setter

	public void setFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}

	public void setLastName(String lastname) {
		lastName.sendKeys(lastname);
	}

	public void setEmail(String usr_email) {
		email.sendKeys(usr_email);
	}

	public void setPhone(String phone) {
		telephone.sendKeys(phone);
	}

	public void setPassword(String usr_password) {
		password.sendKeys(usr_password);

	}

	public void setConfirmPassword(String usr_password) {
		confirmPassword.sendKeys(usr_password);

	}

	public void setNewsletter() {
		suscribe_yes.click();

	}

	public void setPolicy() {
		policyCheckbox.click();

	}

	public void registerButton() {
		buttonContinue.click();
	}

	public String getConfirmationMessage() {
		try {

			return confirmMessage.getText();

		} catch (Exception e) {
			return e.getMessage();

		}

	}

}
