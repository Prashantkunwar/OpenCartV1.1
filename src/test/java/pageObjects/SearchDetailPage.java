package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchDetailPage extends BasePage {
	
	public SearchDetailPage(WebDriver driver) {
		super(driver);
		
	}
	
	//Locator
	
	@FindBy(xpath="//div[@class='caption']//a[contains(text(),'HP LP3065')]")
	WebElement item_link;
	
	
	
	
	
	
	
	//Action Methods
	
	public void clickItemLink() {
		item_link.click();
	}

}
