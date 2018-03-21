package com.selfservice.testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class UserprofilepageTest extends TestBase{
	

	@Test
	public void verify_profile() throws InterruptedException, IOException {
		homepage.scroll_pages().go_tologin().login().go_toprofile().profile_update();
	}
	
}
