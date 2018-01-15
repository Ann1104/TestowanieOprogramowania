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
	//* OKOKOKOKOK
	
	@Test //1 InputFormsCheckBoxDemo
	
	public void testo1() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(www.URL()+"basic-checkbox-demo.html");
		
		InputFormsCheckboxDemo object = new InputFormsCheckboxDemo(driver);
		object.clickOnCheckBox();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("Success - Check box is checked"));

		driver.quit();
	}

	/* OKOKOKOKOK
	@Test //2 DatePickersJQueryDatePicker
	public void testo2() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"basic-first-form-demo.html");
		
		InputFormsSimpleFormDemo object = new InputFormsSimpleFormDemo(driver);
		
		object.clickOnMessage();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("Please enter your Message"));
		
		object.fillMessage("My first try message.");
		Thread.sleep(5000);
		
		object.clickOnButtonShowMessage();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("My first try message."));
		
		driver.quit();
	}
	*/
/*
	@Test //3 TableTableFilter (table(green, orange, red))
	public void testo3() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"table-records-filter-demo.html");
		
		TableTableFilter object = new TableTableFilter(driver);
		object.clickOnGreen();
		Thread.sleep(5000);
		Assert.assertEquals("Smile colour green id not found on the page.", true, object.isElementPresented("green"));
		
		object.clickOnOrange();
		Thread.sleep(5000);
		Assert.assertEquals("Smile colour orange id not found on the page.", true, object.isElementPresented("orange"));
		
		object.clickOnRed();
		Thread.sleep(5000);
		Assert.assertEquals("Smile colour red id not found on the page.", true, object.isElementPresented("red"));
		
		driver.quit();
	}
	*/
/* Do sprawdzenia 
	@Test //4 ProgressBarsANDSlidersJqueryDownloadProgressBars (pobieranie pliku)
	public void testo4() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"jquery-download-progress-bar-demo.html");
		
		ProgressBarsANDSlidersJqueryDownloadProgressBars object = new ProgressBarsANDSlidersJqueryDownloadProgressBars(driver);
		object.clickOnStart();
		Assert.assertTrue(driver.getPageSource().contains("File Download"));
		object.closeWindow();
		
		
		
		driver.quit();
	}
*/
	/*OKOKOKOK 
	@Test //5 AlertsANDModalsBootstrapAlerts (colorfull message)
	public void testo5() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"bootstrap-alert-messages-demo.html");
		
		AlertsANDModalsBootstrapAlerts object = new AlertsANDModalsBootstrapAlerts(driver);
		object.clickOnAutoSuccess();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("normal success message"));
		object.clickOnNormalWarning();
		Thread.sleep(3000);
		Assert.assertTrue(driver.getPageSource().contains("normal warning message"));
		object.clickOnAutoDanger();
		Thread.sleep(2000);
		Assert.assertTrue(driver.getPageSource().contains("autocloseable danger message"));
		Thread.sleep(5000);
		object.clickOnNormalInfo();
		Assert.assertTrue(driver.getPageSource().contains(" normal info message"));
		
		driver.quit();
	}
	*/
	/* OKOKOKOKOKOKOK
	@Test //6 ListBoxDataListFilter (Data list with people)
	public void testo6() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"data-list-filter-demo.html");
		
		ListBoxDataListFilter object = new ListBoxDataListFilter(driver);
		object.clickOnSearch();
		Thread.sleep(1000);
		object.searchName("Tyreese");
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("Manager"));
		
		driver.quit();
	}
	*/
	
	
	
	
	/*
	@Test //7 OthersDynamicDataLoading (Get New User)
	public void testo7() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"dynamic-data-loading-demo.html");
		
		OthersDynamicDataLoading object = new OthersDynamicDataLoading(driver);
		object.clickOnButton();
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getPageSource().contains("First Name"));
		
		driver.quit();
	}
	
	@Test //8 InputFormsInputFormSubmit (formularz)
	public void testo8() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"input-form-demo.html");
		
		InputFormsInputFormSubmit object = new InputFormsInputFormSubmit(driver);
		object.setData("Anna", "Nowak", "anna@gmail.com", "7960001112", "Piotrkowska 6A", "Lodz", "F", "22223","anna.com.pl", "Formularz uzupelniony");
		Thread.sleep(2000);
		object.submit();

		driver.quit();
	}
	
	@Test //9 DatePickersBootstrapDatePicker
	public void testo9() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"bootstrap-date-picker-demo.html");
		
		DatePickersBootstrapDatePicker object = new DatePickersBootstrapDatePicker(driver);
		object.setDate1();
		Thread.sleep(5000);
		object.setDate2("21/12/2017");//, "01/06/2018");
		
		
		driver.quit();
	}
	
	
	@Test //10 fTableTableSortANDSearch  (iltrowanie(Ilosc stron, nazwa))
	public void testo10() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get(www.URL()+"table-sort-search-demo.html");
		
		TableTableSortANDSearch object = new TableTableSortANDSearch(driver);
		object.clickOnPages("2");
		Thread.sleep(1000);
		object.setSearch("Green");
		Thread.sleep(5000);
	
		Assert.assertTrue(driver.getPageSource().contains("COO"));
		
		driver.quit();
	}
	*/
	@After
	public void setDown(){
		System.out.flush();
        System.gc();
	}
}



