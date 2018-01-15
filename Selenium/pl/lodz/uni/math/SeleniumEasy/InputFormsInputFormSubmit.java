package pl.lodz.uni.math.SeleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFormsInputFormSubmit {
	WebDriver driver;

	By firstName = By.xpath("//input[@name='first_name']");
	By lastName = By.xpath("//input[@name='last_name']");
	By eMail = By.xpath("//input[@name='email']");
	By phone = By.xpath("//input[@name='phone']");
	By address = By.xpath("//input[@name='address']");
	By city = By.xpath("//input[@name='city']");
	By state = By.xpath("//select[@name='state']");

	By zipcode = By.xpath("//input[@name='zip']");
	By website = By.xpath("//input[@name='website']");
	By hosting = By.xpath("//input[@name='hosting'][@value='no'][@type='radio']");
	By projectDescription = By.xpath("//textarea[@name='comment']");
	By button = By.xpath("//button[@class='btn btn-default']");

	public InputFormsInputFormSubmit(WebDriver driver) {
		this.driver = driver;
	}

	public void clickFirstName() {
		driver.findElement(firstName).click();
	}

	public void setFirstName(String FName) {
		driver.findElement(firstName).sendKeys(FName);
	}

	public void clickLName() {
		driver.findElement(lastName).click();
	}

	public void setLName(String LName) {
		driver.findElement(lastName).sendKeys(LName);
	}

	public void clickEmail() {
		driver.findElement(eMail).click();
	}

	public void setEmail(String Email) {
		driver.findElement(eMail).sendKeys(Email);
	}

	public void clickPhone() {
		driver.findElement(phone).click();
	}

	public void setPhone(String Phone) {
		driver.findElement(phone).sendKeys(Phone);
	}

	public void clickAddress() {
		driver.findElement(address).click();
	}

	public void setAddress(String Address) {
		driver.findElement(address).sendKeys(Address);
	}

	public void clickCity() {
		driver.findElement(city).click();
	}

	public void setCity(String City) {
		driver.findElement(city).sendKeys(City);
	}

	public void clickOnState() {
		driver.findElement(state).click();
	}

	public void setState(String State) {
		driver.findElement(state).sendKeys(State);
	}

	public void clickZip() {
		driver.findElement(zipcode).click();
	}

	public void setZip(String Zip) {
		driver.findElement(zipcode).sendKeys(Zip);
	}

	public void clickWeb() {
		driver.findElement(website).click();
	}

	public void setWeb(String Web) {
		driver.findElement(website).sendKeys(Web);
	}

	public void clickOnHosting() {
		driver.findElement(hosting).click();
	}

	public void clickOnProjectDescription() {
		driver.findElement(projectDescription).click();
	}

	public void clickProjectDescription() {
		driver.findElement(projectDescription).click();
	}

	public void setProjectDescription(String Comment) {
		driver.findElement(projectDescription).sendKeys(Comment);
	}

	public void submit() {
		driver.findElement(button).click();
	}
}
