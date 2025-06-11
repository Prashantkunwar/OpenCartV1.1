package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_AccountLoginTest extends BaseClass {

	@Test(groups={"Sanity","Master"},priority=3)
	public void TestLogin() {

		try {
			logger.info("**** Starting TC002_AccountLoginTest**********");

			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			logger.info("**** Clicked on Login Button On Homepage**********");

			LoginPage lp = new LoginPage(driver);

			// Giving id and password from config.properties file
			lp.setEmail(p.getProperty("email"));

			lp.setPassword(p.getProperty("password"));
			logger.info("**** Entered Email and Password from config.properties file*****");

			lp.clickLoginbtn();
			logger.info("**** Clicked login button*****");

			MyAccountPage macc = new MyAccountPage(driver);
			Boolean targetpage = macc.isMyAccountPageExists();

			Assert.assertEquals(targetpage, true, "Login Failed");

		} catch (Exception e) {

			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.fail();

		}

	}
}
