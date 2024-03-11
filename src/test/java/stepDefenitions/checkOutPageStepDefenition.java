package stepDefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjectspack.checkOutPage;
import pageObjectspack.gcHomePage;
import utils.TestContextSetUp;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class checkOutPageStepDefenition {
	
//	public WebDriver driver;
//	public String homepage_product;
	TestContextSetUp testContextSetUp;
	public checkOutPage checkOut;
	
	public checkOutPageStepDefenition(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp = testContextSetUp;
		this.checkOut = testContextSetUp.pom.getcheckoutOb();
		
	}
	
//	Then user proceeds to checkout page and validate <Name> in check out page
//	And user Validate the button for apply promotion code and place order
	
//	@Given("User is in the greencart home page")
//	public void user_is_in_the_greencart_home_page() {
	
	@And("user Validate the button for apply promotion code and place order")
	public void user_validate_promo_and_place_order_btn()
	{
		
		checkOut.validatePromotionbtn();
		checkOut.validatePlaceOrderbtn();
	}
	
	@Then("^user proceeds to checkout page and validate (.+) in check out page$")
	public void user_validate_product_inside_checkout(String name) throws InterruptedException
	{
		checkOut.checkOutClick();
//		Thread.sleep(2000);
		Assert.assertTrue(checkOut.getprodnamecho().contains("Tom"));
	}
	
	
}
