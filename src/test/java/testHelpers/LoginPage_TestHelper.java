package testHelpers;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.Constants;
import pages.HomePage;
import pages.SeleniumUtils;

public class LoginPage_TestHelper{
	
	@Test
	public static void clickOnSigninLink(){
		
		Reporter.log("Clicking on Signin button for login page test cases");
		HomePage.signInButton();
		//System.out.println(SeleniumUtils.getURL());
		Assert.assertEquals(SeleniumUtils.getPageTitle(), Constants.loginPageTitle, "Login page NOT opened successfully");
		
		Reporter.log("Login page opened successfully");
	}
	

}
