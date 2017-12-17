package seleniumTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import seleniumTests.o1;
//import seleniumTests.o2;
//import seleniumTests.o3;
//import seleniumTests.o4;
//import seleniumTests.o5;
//import seleniumTests.o6;
//import seleniumTests.o7;
//import seleniumTests.o8;
import seleniumTests.o9;
//import seleniumTests.o10;

public class testSelenium {

	
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/Anna/workspace/Selenium/seleniumjar/geckodriver.exe");
	}
	
	
	/* DOBRZE
	@Test //1 checkBox
	public void testo1() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		o1 object = new o1(driver);
		object.clickOnCheckBox();
		Thread.sleep(5000);
		object.clickOnCheckButton();
		Thread.sleep(5000);

		driver.quit();
	}
	*/
	/*DOBRZE
	@Test //2 DateTimePicker
	public void testo2() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		
		o2 object = new o2(driver);
		
		object.clickOnFrom();
		Thread.sleep(5000);
		object.clickOnFromDate("12/21/2017");
		Thread.sleep(5000);
		
		object.clickOnTo();
		Thread.sleep(5000);
		object.clickNextMonth();
		Thread.sleep(5000);
		object.clickOnToDate("01/06/2018");
		Thread.sleep(5000);
		
		driver.quit();
	}
	*/
	/* 3 DOBRZE
	@Test //3 table(green, red)
	public void testo3() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/table-records-filter-demo.html");
		
		o3 object = new o3(driver);
		object.clickOnGreen();
		Thread.sleep(5000);
		object.clickOnRed();
		Thread.sleep(5000);
		
		driver.quit();
	}
	*/
	/* DOBRZE
	@Test //4 pobieranie pliku
	public void testo4() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		
		o4 object = new o4(driver);
		object.clickOnStart();
		Thread.sleep(2000);
		Assert.assertTrue(driver.getPageSource().contains("File Download"));
		Thread.sleep(10000);
		Assert.assertTrue(driver.getPageSource().contains("Complete!"));
		
		driver.quit();
	}
	*/
	/* DOBRZE
	@Test //5
	public void testo5() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
		
		o5 object = new o5(driver);
		object.clickOnAutoSuccess();
		Thread.sleep(5000);
		object.clickOnNormalWarning();
		Thread.sleep(5000);
		object.clickOnAutoDanger();
		Thread.sleep(2000);
		Assert.assertTrue(driver.getPageSource().contains("autocloseable danger message"));
		Thread.sleep(5000);
		object.clickOnNormalInfo();
		
		Assert.assertTrue(driver.getPageSource().contains("normal warning message"));
		Assert.assertTrue(driver.getPageSource().contains(" normal info message"));
		
		driver.quit();
	}
	*/
	/* DOBRZE
	@Test //6
	public void testo6() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/data-list-filter-demo.html");
		
		o6 object = new o6(driver);
		object.searchName("Tyreese");
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getPageSource().contains("Manager"));
		
		driver.quit();
	}
	*/
	/* DOBRZE
	@Test //7
	public void testo7() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");
		
		o7 object = new o7(driver);
		object.clickOnButton();
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getPageSource().contains("First Name"));
		
		driver.quit();
	}
	*/
	/*Dobrze
	@Test //8
	public void testo8() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");
		
		o8 object = new o8(driver);
		object.setData("Anna", "Nowak", "anna@gmail.com", "7960001112", "Piotrkowska 6A", "Lodz", "F", "22223","anna.com.pl", "Formularz uzupelniony");
		Thread.sleep(2000);
		object.submit();

		driver.quit();
	}
	*/
	
	@Test //9
	public void testo9() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		
		o9 object = new o9(driver);
		object.clickOnCheckBox();
		Thread.sleep(5000);
		object.clickOnCheckButtion();
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getPageSource().contains("Success - Check box is checked"));
		
		driver.quit();
	}
	
	/*
	@Test //10
	public void testo10() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		o10 object = new o10(driver);
		object.clickOnCheckBox();
		Thread.sleep(5000);
		object.clickOnCheckButtion();
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getPageSource().contains("Success - Check box is checked"));
		
		driver.quit();
	}
	*/
	@After
	public void setDown(){
		//System.setProperty("webdriver.gecko.driver", "C:/Users/Anna/workspace/Selenium/seleniumjar/geckodriver.exe");
	}
}



