package pageObjectspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkOutPage {

	public WebDriver driver;
	private By checkOutbtn = By.xpath("//img[@alt='Cart']");
	private By proceedbtn = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	private By placeOrderbtn = By.xpath("//button[contains(text(),'Place Order')]");
	private By promobtn = By.cssSelector(".promoBtn");
	private By prodnamecho = By.xpath("//*[@id=\"productCartTables\"]/tbody/tr/td[2]/p");
	
	
	
	public checkOutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void checkOutClick()
	{
		driver.findElement(checkOutbtn).click();
		driver.findElement(proceedbtn).click();
		
	}
	
	public boolean validatePromotionbtn()
	{
		return driver.findElement(promobtn).isDisplayed();
		
	}
	
	public boolean validatePlaceOrderbtn()
	{
		return driver.findElement(placeOrderbtn).isDisplayed();
		
	}
	
	public String getprodnamecho()
	{
		return driver.findElement(prodnamecho).getText();
	}
	
	
	
}
