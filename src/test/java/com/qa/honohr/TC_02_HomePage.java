package com.qa.honohr;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.PageAction.HomePage;
import com.qa.PageAction.LoginPage;
import com.qa.TestBase.TestBase;

public class TC_02_HomePage extends TestBase{
	
	LoginPage login;
	HomePage home;

	public TC_02_HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
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
		home.mouseHover_Employee();
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void selectItem() throws IOException {
		home = new HomePage();
		home.selectOfficialInfo();
	}
	
	@Test(priority = 3)
	public void clickBankDetails() throws IOException {
		home = new HomePage();
		home.bankDetails();
		
	}
	
	
	

}
