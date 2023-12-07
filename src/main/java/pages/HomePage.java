package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

public class HomePage extends BasePage{
	
	static By createAccount = By.xpath("//div[@class='panel header']//a[text()='Create an Account']");
	
	public static WebElement createAccountElement() {
		
		return driver.findElement(createAccount);
		
		
	}
	
	public static void clickCreateAccountButton() {
		
		BasePage.test.log(Status.INFO, "Page method - clickCreateAccountButton entered");
		
		createAccountElement().click();
		
		BasePage.test.log(Status.INFO, "Page method - clickCreateAccountButton exiting");
	}
	
	static By shopNewYoga = By.xpath("//span[text()='Shop New Yoga']");
	
	public static WebElement shopNewYogaElement() {
		
		return driver.findElement(shopNewYoga);
	}
	
	public static void shopNewYogaButton() {
		
		BasePage.test.log(Status.INFO, "Page method - shopNewYogaButton entered");
		
		shopNewYogaElement().click();
		
		BasePage.test.log(Status.INFO, "Page method - shopNewYogaButton exiting");
	}
	
	
	static By women = By.xpath("//span[text()='Women']");
	
	public static WebElement womenElement() {
			
		return driver.findElement(women);
			
	}
	
	public static void womenButton() {
		
		BasePage.test.log(Status.INFO, "Page method - womenButton entered");
		
		womenElement().click();
		
		BasePage.test.log(Status.INFO, "Page method - womenButton exiting");
	}
	
	
	static By men = By.xpath("//span[text()='Men']");
	
	public static WebElement menElement() {
		
		return driver.findElement(men);
	}
	
	public static void menButton() {
		
		BasePage.test.log(Status.INFO, "Page method - menButton entered");
		
		menElement().click();
		
		BasePage.test.log(Status.INFO, "Page method - menButton exiting");
	}
	
	
	static By login = By.xpath("//div[@class='panel header']//a[text()[normalize-space()= 'Sign In']]");
	
	public static WebElement loginElement() {
		return driver.findElement(login);
	}
	
	public static void signInButton() {
		
		BasePage.test.log(Status.INFO, "Page method - signInButton entered");
		
		loginElement().click();
		
		BasePage.test.log(Status.INFO, "Page method - signInButton exiting");
	}

}
