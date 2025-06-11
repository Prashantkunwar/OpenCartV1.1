package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartDetailsPage extends BasePage{

	public ShoppingCartDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Locator
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement checkoutBtn;
	
	@FindBy(xpath="//div[@class='table-responsive']//tr//td[@class='text-left']//input")
	WebElement quantity;
	
	
	
	
	//Actions Methods
	public void clickCheckout() {
		checkoutBtn.click();
	}
	
	public String getactquantity() {
		String actquantity= quantity.getText();
		return actquantity;
	}
}
