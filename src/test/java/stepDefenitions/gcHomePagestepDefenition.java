package stepDefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjectspack.gcHomePage;
import utils.TestContextSetUp;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class gcHomePagestepDefenition {
	
//	public WebDriver driver;
//	public String homepage_product;
	TestContextSetUp testContextSetUp;
	public gcHomePage homepage;
	
	public gcHomePagestepDefenition(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp = testContextSetUp;
		this.homepage = testContextSetUp.pom.getHomePageOb();
	}
	
	@Given("User is in the greencart home page")
	public void user_is_in_the_greencart_home_page() {
		
		Assert.assertTrue(homepage.getWebpageTitle().contains("GreenKart"));

//		System.setProperty("webdriver.chrome.driver","/Users/Ranji/Documents/msedgedriver");
//		testContextSetUp.driver = new EdgeDriver();
//		testContextSetUp.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	@When("^user searched with shortname (.+) and extracted product name in home page$")
	public void user_searched_with_shortname_and_extracted_product_name_in_home_page(String shortName) throws InterruptedException {
	    
		
		gcHomePage homepage = testContextSetUp.pom.getHomePageOb();
		homepage.searchItem(shortName);
		
//		testContextSetUp.driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys(shortName);
		Thread.sleep(2000);
//		testContextSetUp.homepage_product = testContextSetUp.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		testContextSetUp.homepage_product = homepage.getItemText().split("-")[0].trim();
	}
	
//	And user add "3" quantity of the product and add to cart
	
	@And("user add {string} quantity of the product and add to cart")
	public void user_add_product_and_add_to_cart(String quantity)
	{
		
		homepage.incrementItem(Integer.parseInt(quantity));
		homepage.addTocart();
	}
	
	
	
}
