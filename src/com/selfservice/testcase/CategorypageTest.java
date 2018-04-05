package com.selfservice.testcase;

import org.testng.annotations.Test;

public class CategorypageTest extends TestBase{

	@Test
	public void category_test() throws InterruptedException {
		
		homepage.go_tologin().login().go_to_category().add_category().edit_category().category_wait().delete_category();
	}
}
