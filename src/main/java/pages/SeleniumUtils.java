package pages;

public class SeleniumUtils extends BasePage {
	
	
	public static String getURL() {
		
		return BasePage.driver.getCurrentUrl();
	}
	
	public static String getPageTitle() {
		
		return BasePage.driver.getTitle();
	}
	
	

}
