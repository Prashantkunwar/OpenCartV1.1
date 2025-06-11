package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	//locators
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbtn;
	//Action Methods
	
	public void setEmail(String email_address) {
		email.sendKeys(email_address);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLoginbtn() {
		
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()",loginbtn );
		
	}

}
