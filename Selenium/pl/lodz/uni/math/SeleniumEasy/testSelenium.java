package pl.lodz.uni.math.SeleniumEasy;

import org.jbehave.core.annotations.Given;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pl.lodz.uni.math.SeleniumEasy.*;
/*
import pl.lodz.uni.math.SeleniumEasy.InputFormsCheckboxDemo;
import pl.lodz.uni.math.SeleniumEasy.TableTableSortANDSearch;
import pl.lodz.uni.math.SeleniumEasy.DatePickersJQueryDatePicker;
import pl.lodz.uni.math.SeleniumEasy.TableTableFilter;
import pl.lodz.uni.math.SeleniumEasy.ProgressBarsANDSlidersJqueryDownloadProgressBars;
import pl.lodz.uni.math.SeleniumEasy.AlertsANDModalsBootstrapAlerts;
import pl.lodz.uni.math.SeleniumEasy.ListBoxDataListFilter;
import pl.lodz.uni.math.SeleniumEasy.OthersDynamicDataLoading;
import pl.lodz.uni.math.SeleniumEasy.InputFormsInputFormSubmit;
import pl.lodz.uni.math.SeleniumEasy.DatePickersBootstrapDatePicker;
*/

public class testSelenium {

	private webpage www;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/Anna/workspace/Selenium/seleniumjar/geckodriver.exe");
		www = new webpage();
	}


	@Test //1 InputFormsCheckBoxDemo
	
	public void testoInputFormsCheckboxDemo() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(www.URL()+"basic-checkbox-demo.html");
		
		InputFormsCheckboxDemo object = new InputFormsCheckboxDemo(driver);
		object.clickOnCheckBox();
		Assert.assertTrue(driver.getPageSource().contains("Success - Check box is checked"));

		driver.quit();
	}

	@Test //2 DatePickersJQueryDatePicker
	public void testoInputFormsSimpleFormDemo() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"basic-first-form-demo.html");
		
		InputFormsSimpleFormDemo object = new InputFormsSimpleFormDemo(driver);
		
		object.clickOnMessage();
		Assert.assertTrue(driver.getPageSource().contains("Please enter your Message"));
		
		object.fillMessage("My first try message.");
		
		object.clickOnButtonShowMessage();
		//Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("My first try message."));
		
		driver.quit();
	}
	
	@Test //3 TableTableFilter (table(green, orange, red))
	public void testoTableTableFilter() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"table-records-filter-demo.html");
		
		TableTableFilter object = new TableTableFilter(driver);
		object.clickOnGreen();
		Assert.assertEquals("Smile colour green is not found on the page.", true, object.isElementPresented("green"));
		
		object.clickOnOrange();
		Assert.assertEquals("Smile colour orange is not found on the page.", true, object.isElementPresented("orange"));
		
		object.clickOnRed();
		Assert.assertEquals("Smile colour red is not found on the page.", true, object.isElementPresented("red"));
		
		driver.quit();
	}


	@Test //4 ProgressBarsANDSlidersJqueryDownloadProgressBars (pobieranie pliku)
	public void testoProgressBarsANDSlidersJqueryDownloadProgressBars() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"jquery-download-progress-bar-demo.html");
		
		ProgressBarsANDSlidersJqueryDownloadProgressBars object = new ProgressBarsANDSlidersJqueryDownloadProgressBars(driver);
		object.clickOnStart();
		Assert.assertTrue(driver.getPageSource().contains("File Download"));
		object.closeWindow();
		
		
		
		driver.quit();
	}

	@Test //5 AlertsANDModalsBootstrapAlerts (multicolored message)
	public void testoAlertsANDModalsBootstrapAlerts() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"bootstrap-alert-messages-demo.html");
		
		AlertsANDModalsBootstrapAlerts object = new AlertsANDModalsBootstrapAlerts(driver);
		object.clickOnAutoSuccess();
		Assert.assertTrue(driver.getPageSource().contains("normal success message"));
		object.clickOnNormalWarning();
		Assert.assertTrue(driver.getPageSource().contains("normal warning message"));
		object.clickOnAutoDanger();
		Assert.assertTrue(driver.getPageSource().contains("autocloseable danger message"));
		object.clickOnNormalInfo();
		Assert.assertTrue(driver.getPageSource().contains("normal info message"));
		
		driver.quit();
	}

	@Test //6 ListBoxDataListFilter (Data list with people)
	public void testoListBoxDataListFilter() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"data-list-filter-demo.html");
		
		ListBoxDataListFilter object = new ListBoxDataListFilter(driver);
		object.clickOnSearch();
		Assert.assertTrue(driver.getPageSource().contains("Search Attendees"));
		object.searchName("Tyreese");
		Assert.assertTrue(driver.getPageSource().contains("Manager"));
		
		driver.quit();
	}

	@Test //7 OthersDynamicDataLoading (Get New User)
	public void testoOthersDynamicDataLoading() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"dynamic-data-loading-demo.html");
		
		OthersDynamicDataLoading object = new OthersDynamicDataLoading(driver);
		object.clickOnButton();
		Assert.assertTrue(driver.getPageSource().contains("loading..."));
		Assert.assertTrue(object.waiting());
		
		driver.quit();
	}

	@Test //8 InputFormsInputFormSubmit (formularz)
	public void testoInputFormsInputFormSubmit() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"input-form-demo.html");
		
		InputFormsInputFormSubmit object = new InputFormsInputFormSubmit(driver);
		
		object.clickFirstName();
		Assert.assertTrue(driver.getPageSource().contains("First Name"));
		object.setFirstName("Anna");
		
		object.clickLName();
		Assert.assertTrue(driver.getPageSource().contains("Last Name"));
		object.setLName("Nowak");
		
		object.clickEmail();
		Assert.assertTrue(driver.getPageSource().contains("E-Mail Address"));
		object.setEmail("anna@gmail.com" );
		
		object.clickPhone();
		Assert.assertTrue(driver.getPageSource().contains("(845)555-1212"));
		object.setPhone("7960001112");
		
		object.clickAddress();
		Assert.assertTrue(driver.getPageSource().contains("Address"));
		object.setAddress("Piotrkowska 6A");
		
		object.clickCity();
		Assert.assertTrue(driver.getPageSource().contains("city"));
		object.setCity("Lodz");
		
		object.clickOnState();
		Assert.assertTrue(driver.getPageSource().contains("Please select your state"));
		
		object.setState("F");
		Assert.assertTrue(driver.getPageSource().contains("Florida"));

		object.clickZip();
		Assert.assertTrue(driver.getPageSource().contains("Zip Code"));
		object.setZip("22223");
		
		object.clickWeb();
		Assert.assertTrue(driver.getPageSource().contains("Website or domain name"));
		object.setWeb("anna.com.pl" );
		object.clickOnHosting();
		
		//specjalnie wprowadzone bledne dane
		//specially entered incorrect data
		object.clickOnProjectDescription();
		Assert.assertTrue(driver.getPageSource().contains("Project Description"));
		object.setProjectDescription("TEST SELENIUM");
		object.submit();
	
		driver.quit();
	}
	
	
	
	@Test //9 DatePickersBootstrapDatePicker
	public void testoDatePickersBootstrapDatePicker() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"bootstrap-date-picker-demo.html");
		
		DatePickersBootstrapDatePicker object = new DatePickersBootstrapDatePicker(driver);
		object.clickOnDate();
		Assert.assertTrue(driver.getPageSource().contains("dd/mm/yyyy"));
		object.clickOnToday();
		
		driver.quit();
	}
	
	
	@Test //10 fTableTableSortANDSearch  (filtrowanie(Ilosc stron, nazwa))
	public void testoTableTableSortANDSearch() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"table-sort-search-demo.html");
		
		TableTableSortANDSearch object = new TableTableSortANDSearch(driver);
		object.clickOnPages();
		object.setIntoPages("2");
		Assert.assertTrue(driver.getPageSource().contains("25"));
		object.clickOnSearch();
		object.setIntoSearch("Green");
		Assert.assertTrue(driver.getPageSource().contains("Green"));
	
		Assert.assertTrue(driver.getPageSource().contains("COO"));
		
		driver.quit();
	}
	
	
	@After
	public void setDown(){
		System.out.flush();
        System.gc();
	}
}



