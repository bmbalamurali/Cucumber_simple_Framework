package pageObjectspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class gcHomePage {

	public WebDriver driver;
	
	By search = By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	By product = By.cssSelector("h4.product-name");
	By dealsLink = By.linkText("Top Deals");
	By incrementbtn = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/a[2]");
	By addTocartbtn = By.cssSelector(".product-action button");
	
	
	public gcHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void searchItem(String productname)
	{
		driver.findElement(search).sendKeys(productname);
	}
	
	public String getItemText()
	{
		return driver.findElement(By.cssSelector("h4.product-name")).getText();
	}

	public void dealsPageClick()
	{
		driver.findElement(dealsLink).click();
	}
	
	public String getWebpageTitle()
	{
		String title = driver.getTitle();
		return title;
		
	}
	
	public void incrementItem(int quantity)
	{
		int i = quantity - 1;
		while(i>0)
		{
			driver.findElement(incrementbtn).click();
			i--;
		}
	}

	public void addTocart()
	{
		driver.findElement(addTocartbtn).click();
	}
}
