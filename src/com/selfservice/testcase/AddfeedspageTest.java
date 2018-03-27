package com.selfservice.testcase;

import java.io.IOException;

import org.testng.annotations.Test;

public class AddfeedspageTest extends TestBase{

	@Test
	public void feedspagetest() throws InterruptedException, IOException {
		
		homepage.go_tologin().login().go_to_addfeeds().click_addfeeds().add_feeds().addfeedspage_wait().
		edit_feeds().addfeedspage_wait().delete_feeds();
		
//		homepage.go_tologin().login().go_to_addfeeds().add_feeds();
//		homepage.go_tologin().login().go_to_addfeeds().click_addfeeds().edit_feeds();
//		homepage.go_tologin().login().go_to_addfeeds().delete_feeds();
	}
}
