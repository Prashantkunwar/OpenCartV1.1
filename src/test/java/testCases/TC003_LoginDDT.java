package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {
	
	
	
	
	@Test(dataProvider="loginData", dataProviderClass=DataProviders.class,groups="DataDriven",priority=2)
	public void loginDataDTesting(String email, String password, String exp) {
		logger.info("***TC003_LoginDDT Started****");
		try {
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clickLoginbtn();
		
		MyAccountPage mp = new MyAccountPage(driver);
		Boolean myAccountPageStatus= mp.isMyAccountPageExists();
		/*
		 * Data Valid ---> login success --->  Logout --> Test Passed
		 * 			  ---> login Failed -----> Test Failed
		 * 
		 * Data Invalid ---> Login Success ---> logout ---> Test Failed
		 * 				---> Login Failed -----> Test Passed		
		 * 
		 * */
		
		if (exp.equalsIgnoreCase("valid")) {
			
			if(myAccountPageStatus==true) {
				
				mp.clickLogout();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		if(exp.equalsIgnoreCase("invalid")){
			
			if(myAccountPageStatus==true) {
				mp.clickLogout();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
		else {
			Assert.assertTrue(true);
		}
		
		
		
		}catch(Exception e) {
			Assert.fail();
		}
		
	}

}
