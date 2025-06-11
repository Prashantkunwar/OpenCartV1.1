package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
	
	@Test(groups= {"Regression","Master"},priority=2)
	public void RegistrationTest() {
		
		logger.info("*** Starting TC001_AccountRegistrationTest ******");
		
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("*** Clicked On MyAccount Link ******");
		
		
		hp.clickRegister();
		logger.info("*** Clicked on Register Link ******");
		
		
		
		RegistrationPage rp = new RegistrationPage(driver);
		
		logger.info("*** Providing Customer details ******");
		rp.setFirstName(randomString());
		rp.setLastName(randomString());
		rp.setPhone(randomNumber());
		rp.setEmail(randomString()+"@gamil.com");
		
		String pwd = alphaNumeric();
		rp.setPassword(pwd);
		rp.setConfirmPassword(pwd);
		rp.setNewsletter();
		rp.setPolicy();
		rp.registerButton();
		String message = rp.getConfirmationMessage();
		
		logger.info("*** Validating expected message ******");
		
		if(message.equals("Your Account Has Been Created!")){
			Assert.assertTrue(true);
			
		}
		else {
			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.fail("Expected 'Your Account Has Been Created!' but got "+message);
			
		}
		
		
		//Assert.assertEquals(message,"Your Account Has Been Created!" );
		
	}
	
	catch(Exception e) {
		
		Assert.fail();
	}
		
		
		logger.info("*** Finished TC001_AccountRegistrationTest ******");
	



}
}
