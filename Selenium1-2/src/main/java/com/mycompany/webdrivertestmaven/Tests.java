package com.mycompany.webdrivertestmaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\aleks\\Desktop\\SeleniumT\\chromedriver.exe");

    // Initialize browser
    WebDriver driver=new ChromeDriver();

    // Open facebook
    //driver.get("http://www.facebook.com");
    driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");

    // Maximize browser

    driver.manage().window().maximize();
}
}
