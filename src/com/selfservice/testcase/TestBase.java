package com.selfservice.testcase;




import java.awt.Toolkit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.selfservice.pages.Feedslistpage;
import com.selfservice.pages.Homepage;
import com.selfservice.pages.Loginpage;

public class TestBase {
	
	public WebDriver driver;
	private String browsertype="chrome";
	protected Homepage homepage;
	protected Loginpage loginpage;
	protected Feedslistpage feedslistpage;
	
	/*Loginpage elements*/
	
	@FindBy(xpath="//a[contains(@href,'/login')]")
	protected WebElement click_login;
	
	@FindBy(xpath="//input[@type='text']")
	protected WebElement username_textfield;
	
	@FindBy(xpath="//input[@type='password']")
	protected WebElement password_textfield;
	 
	@FindBy(xpath="//button[@type='submit']")
	protected WebElement submit_button;
	
	/*Feedslist page elements*/
	
	@FindBy(xpath="//img[@id='5a33c824537e6db1119c951a']")
	protected WebElement firstfeed_bell_icon;
	
	@FindBy(xpath="//div[@id='5a33c824537e6db1119c951a']")
	protected WebElement select_firstfeed;
	
	@FindBy(xpath="//input[@value='Alert per item']")
	protected WebElement alert_per_item;
	
	@FindBy(xpath="//input[@value='Alert on schedule']")
	protected WebElement alert_on_schedule;
	
	@FindBy(xpath="//input[@value='Alert with combined mail']")
	protected WebElement alert_with_combined_mail;
	
	@FindBy(xpath="//input[@value='No alerts']")
	protected WebElement no_alerts;
	
	
	@BeforeClass
	public void setup() {
		
		switch(browsertype) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("Chrome browser is launched");
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bala\\Downloads\\geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("Firefox browser is launched");
			break;
			
		case "IE":
			System.setProperty("webdriver.IE.driver", "C:\\Users\\Bala\\Downloads\\geckodriver.exe");
			driver=new InternetExplorerDriver();
			System.out.println("IE browser is launched");
			break;
		}
		driver.get("https://selfservice-staging.adappt.co.uk/");
		System.out.println("URL has passed");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
    	Dimension screenResolution = new Dimension((int) 
    	                    toolkit.getScreenSize().getWidth(), (int) 
    	                    toolkit.getScreenSize().getHeight());

    	driver.manage().window().setSize(screenResolution);
    	homepage=PageFactory.initElements(driver, Homepage.class);
	}
	
	
	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
