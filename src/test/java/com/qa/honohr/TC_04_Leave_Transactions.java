package com.qa.honohr;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.PageAction.HomePage;
import com.qa.PageAction.Leave_Transactions;
import com.qa.PageAction.LoginPage;
import com.qa.TestBase.TestBase;

public class TC_04_Leave_Transactions extends TestBase{
	HomePage home;
	Leave_Transactions transaction;
	public TC_04_Leave_Transactions() throws IOException {
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
		Thread.sleep(3000);
		
	}

//	@Test(priority = 3)
//	public void menuScrollSlid() throws IOException, InterruptedException {
//		transaction = new Leave_Transactions();
//		transaction.menuScroll();
//		Thread.sleep(3000);
//			
//	}
	
	@Test(priority = 3)
	public void clickToLeaveTransactions() throws IOException, InterruptedException {		
		transaction = new Leave_Transactions();
		transaction.menuScroll();
		transaction.LeaveTransactions();
		System.out.println("clicked on the Leave transection");
		Thread.sleep(3000);
	}
	
	@Test(priority = 4)
	public void clickToLeaveType() throws IOException, InterruptedException {		
		transaction = new Leave_Transactions();
		transaction.menuScroll();
		transaction.LeaveType();
		System.out.println("clicked on the Leave type");	
	}
	
	
}
