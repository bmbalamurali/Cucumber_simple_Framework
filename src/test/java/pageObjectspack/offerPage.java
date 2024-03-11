package pageObjectspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offerPage {

	public WebDriver driver;
	private By offerSearch = By.xpath("//input[@id='search-field']");
	private By offerProduct = By.cssSelector("tr td:nth-child(1)");
	
	public offerPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void offerproductsearch(String offerProdname)
	{
		driver.findElement(offerSearch).sendKeys(offerProdname);
	}
	
	public String offerproducttext()
	{
		return driver.findElement(offerProduct).getText();
	}
	
	
}
