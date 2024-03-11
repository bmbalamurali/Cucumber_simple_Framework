package pageObjectspack;

import org.openqa.selenium.WebDriver;

import utils.genericutils;

public class pageObjectManager {
	
//	gcHomePage homepage = new gcHomePage(testContextSetUp.driver);
//	offerPage offerpageOb = new offerPage(testContextSetUp.driver);
	
	public WebDriver driver;
	public gcHomePage homepage;
	public offerPage offerpageOb;
	public checkOutPage checkoutOb;
	
	public pageObjectManager(WebDriver driver)
	{
		
		this.driver = driver;
		
	}
	
	public gcHomePage getHomePageOb()
	{
		
		homepage = new gcHomePage(driver);
		return homepage;
	}
	
	public offerPage getOfferPageOb()
	{
		
		offerpageOb = new offerPage(driver);
		return offerpageOb;
	}
	
	public checkOutPage getcheckoutOb()
	{
		
		checkoutOb = new checkOutPage(driver);
		return checkoutOb;
	}

	
}
