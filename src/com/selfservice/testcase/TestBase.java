package com.selfservice.testcase;




import java.awt.Toolkit;
import java.util.List;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.selfservice.pages.Feedslistpage;
import com.selfservice.pages.Homepage;
import com.selfservice.pages.Loginpage;
import com.selfservice.pages.Userprofilepage;

public class TestBase {
	
	public WebDriver driver;
	private String browsertype="chrome";
	protected Homepage homepage;
	protected Loginpage loginpage;
	protected Feedslistpage feedslistpage;
	protected Userprofilepage userprofilepage;
	
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
	
	@FindBy(xpath="//div[starts-with(@id,'5a')]")
	protected List<WebElement> dynamic_feeds;
	
	@FindBy(xpath="//img[starts-with(@id,'5a')]")
	protected By bell_icon;
	
	@FindBy(xpath="//input[@value='Alert per item']")
	protected By select_alertperitem;
	
	/*User profile page Elements*/
	
	@FindBy(xpath="//a[@class='update']")
	protected WebElement update_profile;
	
	@FindBy(xpath="//i[@class='fa fa-pencil']")
	protected WebElement click_photoicon;
	
	@FindBy(xpath="//button[@type='button']")
	protected List<WebElement> upload_button;
	
	@FindBy(xpath="//input[@name='firstName']")
	protected WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastName']")
	protected WebElement lastname;
	
	@FindBy(xpath="//input[@name='username']")
	protected WebElement username;
	
	@FindBy(xpath="//input[@name='email']")
	protected WebElement email;
	
	@FindBy(xpath="//input[@name='firstName']")
	protected WebElement firstname1;
	
	@FindBy(xpath="//input[@name='lastName']")
	protected WebElement lastname1;
	
	@FindBy(xpath="//button[@type='submit']")
	protected WebElement profile_submit;
	
	
	
	
	
	
	
	
	
	
	@BeforeClass
	public void setup() {
		
		switch(browsertype) 
		{
		case "chrome":
			ChromeOptions chrome_Profile = new ChromeOptions();
			chrome_Profile.addArguments("chrome.switches","--disable-extensions"); 
			chrome_Profile.addArguments("--disable-save-password");
			chrome_Profile.addArguments("disable-infobars");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala\\Downloads\\chromedriver.exe");
			 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		        LoggingPreferences loggingprefs = new LoggingPreferences();
		        loggingprefs.enable(LogType.BROWSER, Level.ALL);
		        capabilities.setCapability(CapabilityType.LOGGING_PREFS, loggingprefs);
		        driver = new ChromeDriver(capabilities);
			System.out.println("Chrome browser is launched");
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bala\\Downloads\\geckodriver.exe");
			 DesiredCapabilities capabilities1 = DesiredCapabilities.firefox();
		        LoggingPreferences loggingprefs1 = new LoggingPreferences();
		        loggingprefs1.enable(LogType.BROWSER, Level.ALL);
		        capabilities1.setCapability(CapabilityType.LOGGING_PREFS, loggingprefs1);
			driver=new FirefoxDriver(capabilities1);
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
