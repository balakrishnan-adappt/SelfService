package com.selfservice.testcase;




import java.awt.Toolkit;
import java.util.List;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.selfservice.pages.Addfeedspage;
import com.selfservice.pages.Categorypage;
import com.selfservice.pages.Feedslistpage;
import com.selfservice.pages.Homepage;
import com.selfservice.pages.Loginpage;
import com.selfservice.pages.Userprofilepage;
import com.selfservice.pages.Userspage;

public class TestBase {
	
	public WebDriver driver;
	private String browsertype="chrome";
	public String user_role="companyuser";
	protected Homepage homepage;
	protected Loginpage loginpage;
	protected Feedslistpage feedslistpage;
	protected Userprofilepage userprofilepage;
	protected Addfeedspage addfeedspage;
	protected Categorypage categorypage;
	protected Userspage userspage;
	
	
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
	protected List<WebElement> bell_icon;
	
	@FindBy(xpath="//button[contains(text(),'Done')]")
	protected WebElement done_button;
	
	@FindBy(xpath="//input[@value='Alert per item']")
	protected List<WebElement> select_alertperitem;
	
	
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
	
	/*Add Feeds page elements*/
	
	@FindBy(xpath="//a[contains(text(),'Add Feeds')]")
	protected WebElement click_addfeedsmenu;
	
	@FindBy(xpath="//div[@class='page-count']")
	protected WebElement feed_count;
	
	@FindBy(xpath="//button[contains(text(),'Add Feed')]")
	protected WebElement addfeed_button;
	
	@FindBy(id="feed_title")
	protected WebElement feed_title;
	
	@FindBy(id="feed_url")
	protected WebElement feed_url;
	
	@FindBy(xpath="//span[contains(text(),'Upload Image')]")
	protected WebElement upload_feedimage;
	
	@FindBy(xpath="//button[contains(text(),'center')]")
	protected WebElement center_feedimage;
	
	@FindBy(xpath="//button[contains(text(),'create')]")
	protected WebElement create_feed;
	
	@FindBy(xpath="//span[@class='fa fa-pencil']")
	protected List<WebElement> edit_feedicon;
	
	@FindBy(xpath="//button[contains(text(),'update')]")
	protected WebElement update_feed;
	
	
	@FindBy(xpath="//span[@class='fa fa-trash']")
	protected List<WebElement> delete_feedicon;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	protected WebElement delete_OK;
	
	
	/*Category Page Elements*/
	
	@FindBy(xpath="//a[contains(text(),'Category')]")
	protected WebElement button_categorymenu;
	
	@FindBy(xpath="//button[contains(text(),'Add Category')]")
	protected WebElement button_addcategory;
	
	@FindBy(id="catname")
	protected WebElement category_name;
	
	@FindBy(xpath="//button[contains(text(),'create')]")
	protected WebElement button_categorycreate;
	
	@FindBy(xpath="//button[contains(text(),'cancel')]")
	protected WebElement button_categorycancel;
	
	@FindBy(xpath="//span[@class='fa fa-pencil']")
	protected List<WebElement> button_categoryedit; 
	
	@FindBy(xpath="//button[contains(text(),'update')]")
	protected WebElement button_categoryupdate;
	
	@FindBy(xpath="//span[@class='fa fa-trash']")
	protected List<WebElement> button_categorydelete;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	protected WebElement delete_category_ok;
	
	@FindBy(xpath="//div[@class='page-count']")
	protected WebElement category_count;
	
	
	/*Users page Elements*/
	
	@FindBy(xpath="//a[contains(text(),'Users')]")
	protected WebElement button_usersmenu;
	
	@FindBy(xpath="//button[contains(text(),'Add User')]")
	protected WebElement button_adduser;
	
	@FindBy(id="username")
	protected WebElement text_username;
	
	@FindBy(id="email")
	protected WebElement text_email;
	
	@FindBy(id="password")
	protected WebElement text_password;
	
	@FindBy(id="confrmPass")
	protected WebElement text_confrmPass;
	
	@FindBy(xpath="//select[@placeholder='Select User Roles']")
	protected WebElement userrole_dropdown;
	
	@FindBy(xpath="//button[contains(text(),'create')]")
	protected WebElement button_createuser;
	
	@FindBy(xpath="//div[@class='page-count']")
	protected WebElement user_count;
	
	
	
	
	
	
	@BeforeClass
	public void setup() {
		
		switch(browsertype) 
		{
		case "chrome":
			ChromeOptions chrome_Profile = new ChromeOptions();
			chrome_Profile.addArguments("chrome.switches","--disable-extensions"); 
			chrome_Profile.addArguments("--disable-save-password");
			chrome_Profile.addArguments("disable-infobars");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala\\Downloads\\chromedriver_2.37\\chromedriver2.37.exe");
//			 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		        LoggingPreferences loggingprefs = new LoggingPreferences();
//		        loggingprefs.enable(LogType.BROWSER, Level.ALL);
//		        capabilities.setCapability(CapabilityType.LOGGING_PREFS, loggingprefs);
		        driver = new ChromeDriver();
			System.out.println("Chrome browser is launched");
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bala\\Downloads\\geckodriver.exe");
//			 DesiredCapabilities capabilities1 = DesiredCapabilities.firefox();
//		        LoggingPreferences loggingprefs1 = new LoggingPreferences();
//		        loggingprefs1.enable(LogType.BROWSER, Level.ALL);
//		        capabilities1.setCapability(CapabilityType.LOGGING_PREFS, loggingprefs1);
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
