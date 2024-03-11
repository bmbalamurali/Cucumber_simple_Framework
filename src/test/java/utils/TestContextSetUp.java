package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pageObjectspack.pageObjectManager;

public class TestContextSetUp {

	public WebDriver driver;
	public String homepage_product;
	public pageObjectManager pom;
	public baseTest testBase;
	public genericutils genericOb;
	
	public TestContextSetUp() throws IOException
	{
		testBase = new baseTest();
		driver = testBase.WebDriverManager();
		pom = new pageObjectManager(testBase.WebDriverManager());
		genericOb = new genericutils(testBase.WebDriverManager());
				
	}
	
	
}
