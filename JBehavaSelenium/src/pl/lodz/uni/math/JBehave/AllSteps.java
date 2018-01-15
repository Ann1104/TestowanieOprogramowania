package pl.lodz.uni.math.JBehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pl.lodz.uni.math.JBehave.CheckboxDemo;
import pl.lodz.uni.math.JBehave.webpage;


public class AllSteps {

	private webpage www;
	private WebDriver driver;

	
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Anna/workspace/Selenium/seleniumjar/geckodriver.exe");
		www = new webpage();
		driver = new FirefoxDriver();;
	}

	
	@Given("Wejdz na strone")
	public void testCheckBox1() throws InterruptedException {
		driver.get(www.URL() + "basic-checkbox-demo.html");
	}

	
	@When("Kliknij w checkbox")
	public void testCheckBox2() throws InterruptedException {
		CheckboxDemo object = new CheckboxDemo(driver);
		object.clickOnCheckBox();
	}

	
	@Given("Sprawdz czy na pewno kliknales")
	public void testCheckBox3() throws InterruptedException {
		Assert.assertTrue(driver.getPageSource().contains("Success - Check box is checked"));
	}

	
	@After
	public void setDown() {
		System.out.flush();
		System.gc();
		driver.quit();
	}

	
}
