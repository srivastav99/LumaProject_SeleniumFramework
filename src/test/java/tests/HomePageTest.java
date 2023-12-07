package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.BasePage;
import pages.Constants;
import pages.HomePage;
import pages.SeleniumUtils;
import utils.ConfigProperties;

public class HomePageTest extends BaseTest{
	
	@Test(priority = 1)
	public static void clickOnShopNewYoga() throws IOException {
		//ConfigProperties.loadProperties();
		//BasePage.launchBrowser();
		
		BasePage.test.log(Status.INFO, "test method - clickOnShopNewYoga entered");
		
		Reporter.log("Clicking on Shop New Yoga button");
		HomePage.shopNewYogaButton();
		Assert.assertEquals(SeleniumUtils.getURL(), Constants.shopNewYogaURL, "Shop new Yoga page NOT opened successfully");
		Reporter.log("Shop new Yoga page opened successfully");
		
		BasePage.test.log(Status.INFO, "test method - clickOnShopNewYoga exiting");
	}
	
	@Test(priority = 2)
	public static void clickOnCreateAccount() {
		
		BasePage.test.log(Status.INFO, "test method - clickOnCreateAccount entered");
		
		Reporter.log("Clicking on Create an Account button");
		HomePage.clickCreateAccountButton();
		Assert.assertEquals(SeleniumUtils.getURL() , Constants.createAnAccountPageURL, "Create An Account page NOT opened successfully");
		Reporter.log("Create an Account page opened successfully");
		
		BasePage.test.log(Status.INFO, "test method - clickOnCreateAccount exiting");
	}
	
	@Test(priority = 3)
	public static void clickOnWomen() {
		
		BasePage.test.log(Status.INFO, "test method - clickOnWomen entered");
		
		Reporter.log("Clicking on Women Tab");
		HomePage.womenButton();
		Assert.assertEquals(SeleniumUtils.getURL(), Constants.womenPageURL, "Women page NOT opened successfully");
		Reporter.log("Women page opened successfully");
		
		BasePage.test.log(Status.INFO, "test method - clickOnWomen exiting");
	}
	
	@Test(priority = 4)
	public static void clickOnMen() {
		
		BasePage.test.log(Status.INFO, "test method - clickOnMen entered");
		
		Reporter.log("Clicking on Men Tab");
		HomePage.menButton();
		Assert.assertEquals(SeleniumUtils.getURL(), Constants.menPageURL, "Men page NOT opened successfully");
		Reporter.log("Men page opened successfully");
		
		BasePage.test.log(Status.INFO, "test method - clickOnMen exiting");
	}
	
	@Test(priority = 5)
	public static void clickOnSigninLink() {
		
		BasePage.test.log(Status.INFO, "test method - clickOnSigninLink entered");
		
		Reporter.log("Clicking on Signin link");
		HomePage.signInButton();
		//System.out.println(SeleniumUtils.getURL());
		Assert.assertEquals(SeleniumUtils.getPageTitle(), Constants.loginPageTitle, "Login page NOT opened successfully");
		Reporter.log("Login page opened successfully");
		
		BasePage.test.log(Status.INFO, "test method - clickOnSigninLink exiting");
		
	}
	

}
