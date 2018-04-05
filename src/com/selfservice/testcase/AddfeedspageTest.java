package com.selfservice.testcase;

import java.io.IOException;

import org.testng.annotations.Test;

public class AddfeedspageTest extends TestBase{

	@Test
	public void feedspagetest() throws InterruptedException, IOException {
		
		homepage.scroll_pages().go_tologin().login().go_tofeeds().Alert_per_item().go_toprofile().profile_update().go_to_addfeeds().click_addfeeds().add_feeds().addfeedspage_wait().
		edit_feeds().addfeedspage_wait().delete_feeds();
		
	}
}
