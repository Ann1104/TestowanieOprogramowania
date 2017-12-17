package seleniumTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import seleniumTests.o1;

public class testSelenium {

	
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/Anna/workspace/Selenium/seleniumjar/geckodriver.exe");
	}
	
	
	
	@Test
	public void testPage() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		o1 object = new o1(driver);
		object.clickOnCheckBox();
		Thread.sleep(5000);
		object.clickOnCheckButtion();
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getPageSource().contains("Success - Check box is checked"));
		
		driver.quit();
	}
	
	@After
	public void setDown(){
		//System.setProperty("webdriver.gecko.driver", "C:/Users/Anna/workspace/Selenium/seleniumjar/geckodriver.exe");
	}
}



