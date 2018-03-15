package com.selfservice.pages;

import java.util.Date;
import java.util.logging.Level;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.selfservice.testcase.TestBase;

public class Homepage extends TestBase {

	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Homepage ExtractJSLogs() {
		homepage=new Homepage(driver);
		PageFactory.initElements(driver, Homepage.class);
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
        }
        return homepage;
	}
	
	public Homepage scroll_page_down() throws InterruptedException {
		homepage=new Homepage(driver);
		PageFactory.initElements(driver, Homepage.class);
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		System.out.println("Moved page down");
		return homepage;
	}
	
	public Homepage scroll_page_up() throws InterruptedException {
		homepage=new Homepage(driver);
		PageFactory.initElements(driver, Homepage.class);
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(2000);
		System.out.println("Moved page up");
		return homepage;
	}

	public Homepage scroll_pages() throws InterruptedException {
		homepage=new Homepage(driver);
		PageFactory.initElements(driver, Homepage.class);
		ExtractJSLogs();
		scroll_page_down().scroll_page_up();
		return homepage;
	}
	
	public Loginpage go_tologin() {
		loginpage=new Loginpage(driver);
		PageFactory.initElements(driver, Loginpage.class);
		return loginpage;
	}
	
	
}
