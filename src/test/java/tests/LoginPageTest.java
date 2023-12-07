package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.BasePage;
import pages.Constants;
import pages.LoginPage;
import pages.SeleniumUtils;
import testHelpers.LoginPage_TestHelper;
import utils.ConfigProperties;


public class LoginPageTest extends BaseTest{
	
	@Test(priority = 1)
	public static void forgotPassword() {
		
		BasePage.test.log(Status.INFO, "test method forgotPassword entered");
		
		LoginPage_TestHelper.clickOnSigninLink();
		Reporter.log("Clicking on Forgot your password link");
		LoginPage.forgotPasswordClick();
		Assert.assertEquals(SeleniumUtils.getPageTitle(), Constants.forgotYourPasswordPageTitle, "Forgot your Password NOT opened successfully");
		Reporter.log("Forgot your Password page opened successfully");
	//	navigateToSignInPage();
		
		BasePage.test.log(Status.INFO, "test method forgotPassword exiting");
		
	}
	
	@Test(priority = 2)
	public static void createAccount() {
		
		BasePage.test.log(Status.INFO, "test method createAccount entered");
		
		LoginPage_TestHelper.clickOnSigninLink();
		Reporter.log("Clicking on Create an Account");
		LoginPage.createAccountClick();
		Assert.assertEquals(SeleniumUtils.getURL(), Constants.createAnAccountPageURL, "Create New Customer Account page NOT opened successfully");
		Reporter.log("Create New Customer Account page opened successfully");
	//	navigateToSignInPage();
		
		BasePage.test.log(Status.INFO, "test method createAccount exiting");
	}
	/*
	@Test(priority = 8)
	public static void login() {
		
		
		
		LoginPage_TestHelper.clickOnSigninLink();
		Reporter.log("Entering username in username textbox");
		LoginPage.userNameEnter(ConfigProperties.p.getProperty("username"));
		Assert.assertEquals(LoginPage.usernameElement().getAttribute("value"), ConfigProperties.p.getProperty("username"), "Username successfully NOT entered in username textbox");
		Reporter.log("Username successfully entered in username textbox");
		
		
		Reporter.log("Entering password in password textbox");
		LoginPage.passwordEnter(ConfigProperties.p.getProperty("password"));
		Assert.assertEquals(LoginPage.passwordElement().getAttribute("value"), ConfigProperties.p.getProperty("password"), "Password successfully NOT entered in password textbox");
		Reporter.log("Password successfully entered in password textbox");
		
		
		//Here when we come to sign in page and directly enter UN,PWD and click on signin button, it will go to homepage , but if we go to sigin page then navigate to some other page come back to sign in page and then enter UN,PWD and click on signin page then it goes to Accounts Page.
				//Thus the validaton for this test will fail.
				Reporter.log("Clicking on Signin In button");
				LoginPage.signInClick();
				//System.out.println(SeleniumUtils.getPageTitle());
				Assert.assertEquals(SeleniumUtils.getPageTitle(), Constants.homePageTitle, "Home Page NOT opened successfully Login failed");
				Reporter.log("Home Page opened successfully Login successfully");
		
	}
	*/
	@Test(priority = 3)
	public static void userName() throws InterruptedException {
		
		BasePage.test.log(Status.INFO, "test method userName entered");
		
		LoginPage_TestHelper.clickOnSigninLink();
		Reporter.log("Entering username in username textbox");
		LoginPage.userNameEnter(ConfigProperties.p.getProperty("username"));
		Assert.assertEquals(LoginPage.usernameElement().getAttribute("value"), ConfigProperties.p.getProperty("username"), "Username successfully NOT entered in username textbox");
		Reporter.log("Username successfully entered in username textbox");
		
		BasePage.test.log(Status.INFO, "test method userName exiting");
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 4)
	public static void password() {
		
		BasePage.test.log(Status.INFO, "test method password entered");
		
		LoginPage_TestHelper.clickOnSigninLink();
		Reporter.log("Entering password in password textbox");
		LoginPage.passwordEnter(ConfigProperties.p.getProperty("password"));
		Assert.assertEquals(LoginPage.passwordElement().getAttribute("value"), ConfigProperties.p.getProperty("password"), "Password successfully NOT entered in password textbox");
		Reporter.log("Password successfully entered in password textbox");
		
		BasePage.test.log(Status.INFO, "test method password exiting");
	}
	
	@Test(priority = 5)
	public static void signInButton() throws InterruptedException {
		
		BasePage.test.log(Status.INFO, "test method signInButton entered");
		
		LoginPage_TestHelper.clickOnSigninLink();
		LoginPage.userNameEnter(ConfigProperties.p.getProperty("username"));
		LoginPage.passwordEnter(ConfigProperties.p.getProperty("password"));
		
		//Here when we come to sign in page and directly enter UN,PWD and click on signin button, it will go to homepage , but if we go to sigin page then navigate to some other page come back to sign in page and then enter UN,PWD and click on signin page then it goes to Accounts Page.
		Reporter.log("Clicking on Signin In button");
		LoginPage.signInClick();
		//System.out.println(SeleniumUtils.getPageTitle());
		Assert.assertEquals(SeleniumUtils.getPageTitle(), Constants.homePageTitle, "Home Page NOT opened successfully Login failed");
		Reporter.log("Home Page opened successfully Login successfully");
		
		BasePage.test.log(Status.INFO, "test method signInButton exiting");
		
		Thread.sleep(2000);
		
	}
	/*
	@Test(priority = 8)
	public static void username() {
		
		Reporter.log("Entering username in username textbox");
		LoginPage.userNameEnter(ConfigProperties.p.getProperty("username"));
		Assert.assertEquals(LoginPage.usernameElement().getAttribute("value"), ConfigProperties.p.getProperty("username"), "Username successfully NOT entered in username textbox");
		Reporter.log("Username successfully entered in username textbox");
		
	}
	
	@Test(priority = 9)
	public static void password() {
		
		Reporter.log("Entering password in password textbox");
		LoginPage.passwordEnter(ConfigProperties.p.getProperty("password"));
		Assert.assertEquals(LoginPage.passwordElement().getAttribute("value"), ConfigProperties.p.getProperty("password"), "Password successfully NOT entered in password textbox");
		Reporter.log("Password successfully entered in password textbox");
		
	}
	
	@Test(priority = 10)
	public static void signinbutton() {
		//Here when we come to sign in page and directly enter UN,PWD and click on signin button, it will go to homepage , but if we go to sigin page then navigate to some other page come back to sign in page and then enter UN,PWD and click on signin page then it goes to Accounts Page.
		//Thus the validaton for this test will fail.
		Reporter.log("Clicking on Signin In button");
		LoginPage.signInClick();
		//System.out.println(SeleniumUtils.getPageTitle());
		Assert.assertEquals(SeleniumUtils.getPageTitle(), Constants.homePageTitle, "Home Page NOT opened successfully Login failed");
		Reporter.log("Home Page opened successfully Login successfully");
		
	}
	*/
	/*
	public static void navigateToSignInPage() {
		
		Reporter.log("Navigating back to login page");
		BasePage.navigateToSignInPage();
		Assert.assertEquals(SeleniumUtils.getPageTitle(), Constants.loginPageTitle,"Navigating back to login page NOT successful");
		Reporter.log("Navigating back to login page successful");
		
		
	}
	
	*/

}
