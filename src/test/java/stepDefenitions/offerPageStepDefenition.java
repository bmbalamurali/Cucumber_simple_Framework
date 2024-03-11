package stepDefenitions;

import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pageObjectspack.gcHomePage;
import pageObjectspack.offerPage;
import pageObjectspack.pageObjectManager;
import utils.TestContextSetUp;
import utils.genericutils;

public class offerPageStepDefenition {
	
	
	public String offerPage_product;
	TestContextSetUp testContextSetUp;
	pageObjectManager pom;
	
	public offerPageStepDefenition(TestContextSetUp testContextSetUp)// passing instance of testContextSetup
	{
		this.testContextSetUp = testContextSetUp;
	}
	
	
	@Then("^user searched the shortname (.+) in offers page to check if product exist$")
	public void user_searched_the_shortname_in_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException {
	    
		switchToOfferPage();
		offerPage offerpageOb = testContextSetUp.pom.getOfferPageOb();
		offerpageOb.offerproductsearch(shortName);
		
//		testContextSetUp.driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(shortName);
		Thread.sleep(2000);
		offerPage_product = offerpageOb.offerproducttext();
		
	}
	
	public void switchToOfferPage()
	{

		gcHomePage homepage = testContextSetUp.pom.getHomePageOb();
		homepage.dealsPageClick();
		
		testContextSetUp.genericOb.switchWindowToChild();
		
//		Set<String> wl = testContextSetUp.driver.getWindowHandles();
//		java.util.Iterator<String> it = wl.iterator();
//		String pw = it.next();
//		String cw = it.next();
//		testContextSetUp.driver.switchTo().window(cw);
	}
	
	@Then("Validate product name of home page matches with product in offers page")
	public void Validate_product_name_of_home_page_matches_with_product_in_offers_page() {
		
//		System.out.println(testContextSetUp.homepage_product);
//		System.out.println(offerPage_product);
		Assert.assertEquals(testContextSetUp.homepage_product, offerPage_product);
		
	}
	

	
	
	
	
}
