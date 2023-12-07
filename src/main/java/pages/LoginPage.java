package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import utils.ConfigProperties;

public class LoginPage extends BasePage{
	
	
	static By forgotPassword = By.xpath("//a[@class='action remind']//span[text()='Forgot Your Password?']");
	
	public static WebElement forgotPasswordElement() {
		
		return driver.findElement(forgotPassword);
	}
	
	public static void forgotPasswordClick() {
		
		BasePage.test.log(Status.INFO, "page method forgotPasswordClick entered");
		
		forgotPasswordElement().click();
		
		BasePage.test.log(Status.INFO, "page method forgotPasswordClick exiting");
	}
	
	
	static By createAccount = By.xpath("//a[@class='action create primary']//span[text()='Create an Account']");
	
	public static WebElement createAccountElement() {
		
		return driver.findElement(createAccount);
	}
	
	public static void createAccountClick() {
		
		BasePage.test.log(Status.INFO, "page method createAccountClick entered");
		
		createAccountElement().click();
		
		BasePage.test.log(Status.INFO, "page method createAccountClick exiting");
	}
	
	
	static By username = By.id("email");
	
	public static WebElement usernameElement() {
		
		return driver.findElement(username);
	}
	
	public static void userNameEnter(String name) {
		
		BasePage.test.log(Status.INFO, "page method userNameEnter entered");
		//usernameElement().sendKeys(ConfigProperties.p.getProperty("username"));
		usernameElement().sendKeys(name);;
		
		BasePage.test.log(Status.INFO, "page method userNameEnter exiting");
			
	}
	
	
	static By password = By.id("pass");
	
	public static WebElement passwordElement() {
		
		return driver.findElement(password);
	}
	
	public static void passwordEnter(String pwd) {
		
		BasePage.test.log(Status.INFO, "page method passwordEnter entered");
		//passwordElement().sendKeys(ConfigProperties.p.getProperty("password"));
		passwordElement().sendKeys(pwd);;
		
		BasePage.test.log(Status.INFO, "page method passwordEnter exiting");
		
	}
	
	static By signIn = By.xpath("//button[@class='action login primary']//span[text()='Sign In']");
	
	public static WebElement signInElement() {
		
		return driver.findElement(signIn);
	}
	
	public static void signInClick() {
		
		BasePage.test.log(Status.INFO, "page method signInClick entered");
		
		signInElement().click();
		
		BasePage.test.log(Status.INFO, "page method signInClick exiting");
		
	}
	//As of now not required
	/*
	public static void Login(String name, String pwd) throws InterruptedException
	{
		HomePage.signInButton();;
		LoginPage.userNameEnter(name);
		LoginPage.passwordEnter(pwd);
		LoginPage.signInClick();;
	}
	*/
	
	

}
