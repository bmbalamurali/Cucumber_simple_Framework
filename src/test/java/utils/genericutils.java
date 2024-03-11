package utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericutils {
	
	public WebDriver driver;
	
	public genericutils(WebDriver driver)
	{
		this.driver = driver;
		
	}

	public void switchWindowToChild()
	{
		Set<String> wl = driver.getWindowHandles();
		java.util.Iterator<String> it = wl.iterator();
		String pw = it.next();
		String cw = it.next();
		driver.switchTo().window(cw);
	}
}
