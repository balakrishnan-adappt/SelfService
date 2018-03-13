package com.selfservice.testcase;


import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FeedslistpageTest extends TestBase{
	
	@Test
	public void feedslist() throws InterruptedException {
		homepage.scroll_pages().go_tologin().login().go_tofeeds().feed_wait().select_feed();	
	}
}
