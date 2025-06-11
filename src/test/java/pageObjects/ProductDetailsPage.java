package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage {
	
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='input-quantity']")
	WebElement quantity;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement addToCartConfirmation;
	
	
	
	
	//Action methods
	public void setQuantity(String qty) {
		quantity.clear();
		quantity.sendKeys(qty);
	}
	
	public void clickAddtoCart() {
		addToCartBtn.click();
	}
	
	public String getAddtoCart() {
		String confirm_message = addToCartConfirmation.getText();
		return confirm_message;
	}
	

}
