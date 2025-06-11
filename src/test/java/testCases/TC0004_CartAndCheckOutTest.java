package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CheckoutClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.ProductDetailsPage;
import pageObjects.SearchDetailPage;
import pageObjects.ShoppingCartDetailsPage;
import testBase.BaseClass;

public class TC0004_CartAndCheckOutTest extends BaseClass {

	@Test(priority=1)
	public void CartAndCheckOutTest() {
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();

		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLoginbtn();

		MyAccountPage mp = new MyAccountPage(driver);
		mp.setSearchProduct(p.getProperty("productName"));
		mp.clickSearchbtn();

		SearchDetailPage sp = new SearchDetailPage(driver);
		sp.clickItemLink();

		ProductDetailsPage pp = new ProductDetailsPage(driver);
		pp.setQuantity(p.getProperty("quantity"));
		pp.clickAddtoCart();
		String addtocartmessage = pp.getAddtoCart();

		if (addtocartmessage.equals("Success: You have added HP LP3065 to your shopping cart!")) {
			hp.clickshoppingCart();

			ShoppingCartDetailsPage sdp = new ShoppingCartDetailsPage(driver);

			if (p.getProperty("quantity").equals(sdp.getactquantity())) {
				sdp.clickCheckout();

				CheckoutClass cc = new CheckoutClass(driver);
				cc.clickBillingContinue();
				cc.clickDeliveryDetailContinue();
				cc.clickDeliveryMethodContinue();
				cc.clickpolicyCheckbox();
				cc.clickPaymentMethodContinue();
				cc.confirmOrder();
				String orderConfirmation = cc.getConfirmMessage();

				if (orderConfirmation.equals("Your order has been placed!")) {
					Assert.assertTrue(true);

				} 
				else {
					Assert.assertTrue(false,"Order Failed");

				}
			}
		}

	
	}catch(Exception e) {
		Assert.fail();
	}

}
}
