package com.selfservice.testcase;

import org.testng.annotations.Test;

public class FeedslistpageTest extends TestBase{
	
	@Test
	public void feedslist() throws InterruptedException {
		homepage.waitfor_element().click_on_login().enter_user().enter_pass().wait_for_element().click_on_submitbutton().
		move_to_feeds().feed_wait().select_alertperfeed();
	}
}
