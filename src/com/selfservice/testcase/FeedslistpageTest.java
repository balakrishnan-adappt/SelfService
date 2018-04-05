package com.selfservice.testcase;





import org.testng.annotations.Test;

public class FeedslistpageTest extends TestBase{
	
	@Test
	public void feedslist() throws InterruptedException {
		homepage.scroll_pages().go_tologin().login().go_tofeeds().feed_wait().select_feed().feed_wait().click_bell_icon().feed_wait().select_alertperitem();	
	}
}
