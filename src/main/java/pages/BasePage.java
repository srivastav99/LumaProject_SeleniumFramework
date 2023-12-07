package pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.ConfigProperties;

public class BasePage {
	
	static WebDriver driver;
	public static void launchBrowser() {
			
			driver = new ChromeDriver();
			driver.get(ConfigProperties.p.getProperty("baseURL"));
			
			driver.manage().window().maximize();
			
		

	}
	
	public static void closeBrowser() {
		
		driver.quit();
	}
	
	public static ExtentReports report;
	public static ExtentTest test;
	public static Date date;
	
	public static void reportInitialization() throws IOException {
		
		date = new Date();
		String path = System.getProperty("user.dir")+"\\ExtentReports\\"+date.toString().replace(":", "_")+"myReport.html";
		ExtentSparkReporter reportfile = new ExtentSparkReporter(path);
		reportfile.loadXMLConfig(System.getProperty("user.dir")+"\\report_config.xml");
		
		report = new ExtentReports();
		report.attachReporter(reportfile);
		
		
	}
	
	public static void takeScreenshotWhenFail() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir")+"\\Screenshots\\"+date.toString().replace(":", "_")+"myReport.jpg");
		FileHandler.copy(src, des);
	}
	
	public static void navigateToSignInPage() {
		driver.navigate().to(Constants.loginPageURL);
		
	}

}
