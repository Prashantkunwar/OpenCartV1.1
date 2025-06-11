package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {

		super(driver);
	}
	
	
	//locators
	@FindBy(how=How.XPATH, using="//a[@title='My Account']") 
	WebElement lnkMyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement lnkLogin;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Order History']")
	WebElement orderHistoryLink;
	
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	WebElement shoppingCartLink;
	
	
	
	
	//Actions methods
	public void clickMyAccount() {
		lnkMyAccount.click();
	}
	
	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin() {
		
		Actions act = new Actions(driver);
		act.click(lnkLogin).perform();
	}
	
	
	public void clickOrderHistory() {
		orderHistoryLink.click();
	}
	
	
	
	public void clickshoppingCart() {
		shoppingCartLink.click();
	}

}
