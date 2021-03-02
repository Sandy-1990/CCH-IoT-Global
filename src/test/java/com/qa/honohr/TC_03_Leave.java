package com.qa.honohr;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.PageAction.HomePage;
import com.qa.PageAction.LeavePage;
import com.qa.PageAction.LoginPage;
import com.qa.TestBase.TestBase;

public class TC_03_Leave extends TestBase{

	LoginPage login;
	HomePage home;
	LeavePage leave;
	
	public TC_03_Leave() throws IOException {
		super();
		
	}
	
	@Test(priority = 1)
	public void login() throws IOException, InterruptedException {
		LoginPage login = new LoginPage();
		login.setUsername();
		login.setPassword();
		login.clickSubmit();
		
		Thread.sleep(3000);
		
		
	}
	@Test(priority = 2)
	public void clickMenu() throws IOException, InterruptedException {
		home = new HomePage();
		home.menu();
		Thread.sleep(1000);
	}
	
	@Test(priority = 3)
	public void ClickOnCreateLeaveRequest() throws IOException, InterruptedException {
		leave = new LeavePage();
		leave.createLeaveRequest();
		Thread.sleep(1000);
	}
	
	@Test(priority = 4)
	public void applyForLeavePage() throws IOException, InterruptedException {
		leave = new LeavePage();
		leave.applyForLeave();
		Thread.sleep(1000);
		
}
	@Test(priority = 5)
	public void datePicker() throws IOException, InterruptedException {
		leave = new LeavePage();
		leave.datePickerFromDate();
		leave.datePickerToDate();
		Thread.sleep(5000);
		
		
	}

}
