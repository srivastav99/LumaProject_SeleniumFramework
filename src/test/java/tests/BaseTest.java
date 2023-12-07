package tests;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;

import pages.BasePage;
import pages.Constants;
import pages.SeleniumUtils;
import utils.ConfigProperties;


public class BaseTest {
	@BeforeSuite
	public void configPropertiesClassSetup() throws IOException {//This method is basicalu suiteSetUp
		System.out.println("config properties");
		ConfigProperties.loadProperties();
		
		BasePage.reportInitialization();
	}
//	@BeforeTest
	@BeforeMethod
	public void browserSetUp(ITestResult r) throws IOException {
		
	//Creating test report for a @test method for ExtentReport
		BasePage.test = BasePage.report.createTest(r.getMethod().getMethodName());
		BasePage.test.log(Status.INFO, r.getMethod().getMethodName());
		
		Reporter.log("Launching browser");
		BasePage.launchBrowser();
		
		assertEquals(SeleniumUtils.getURL(), Constants.homePageURL,"HomePage NOT opened successfully");
		Reporter.log("HomePage opened successfully");
		Reporter.log("Browser launch successful");
	}
	
	//@AfterTest
	@AfterMethod
	public void BrowserTearDown(ITestResult r) throws IOException {
		
		Reporter.log("Closing Browser");
		BasePage.closeBrowser();
		
		Reporter.log("Browser close successful");
		
		
		if(!r.isSuccess()) {
			BasePage.test.log(Status.FAIL, r.getMethod().getMethodName()+" TestCase failed");
			BasePage.test.log(Status.INFO, r.getThrowable());
			
			BasePage.takeScreenshotWhenFail();
		}
		else {
			BasePage.test.log(Status.PASS, r.getMethod().getMethodName()+" TestCase Passed");
			
		}
	}
	
	@AfterSuite
	public void suiteTearDown(){
		
		BasePage.report.flush();
		
		//Deleting previous files 
		File folder = new File(System.getProperty("user.dir")+"\\ExtentReports");
		 
		 File[] listOfFiles = folder.listFiles();
		 
		int x=1;//x represent days
		 for (int i = 0; i < listOfFiles.length; i++) {
			  
			 long diff = new Date().getTime() - listOfFiles[i].lastModified();
			 
			 if (diff > x * 6 * 60 * 60 * 1000) {//(days*hours*min*sec*millisecs) - here we have set last any files updated before 6 hours to get deleted
				 listOfFiles[i].delete();
				}
			}
	}
	
	

}
