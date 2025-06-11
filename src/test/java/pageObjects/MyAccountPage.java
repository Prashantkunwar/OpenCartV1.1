package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		
		super(driver);
	}
	
	//Locator
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement msgHeading;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement logoutButton;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchButton;
	
	//Methods
	public boolean isMyAccountPageExists() {
		
		try {
			return msgHeading.isDisplayed();
			
		}
		catch (Exception e) {
			return false;
		}	
	}
	
	public void clickLogout() {
		logoutButton.click();
	}
	
	public void setSearchProduct(String productName) {
		search.sendKeys(productName);
	}
	
	public void clickSearchbtn() {
		searchButton.click();
	}
	
	
	
	
	
	
	

}
