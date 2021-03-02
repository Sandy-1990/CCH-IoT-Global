package com.qa.honohr;

import org.apache.log4j.Logger;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.PageAction.LoginPage;
import com.qa.TestBase.TestBase;

import java.io.IOException;


@Listeners(com.qa.ExtentReport.ExtentReporterNG.class)

public class Test_0001_LoginPage extends TestBase{
	
	Logger log = Logger.getLogger(Test_0001_LoginPage.class);
	
	 public Test_0001_LoginPage() throws IOException {
		
		 super();
	}
	 

	@Test
	public void loginPageTitleTest() throws IOException, InterruptedException 
	 {
		
		 driver.get(prop.getProperty("url"));
		 log.info("Entering application URL");
		 LoginPage login = new LoginPage();
		 
		 	if(driver.getTitle().equals("HONOHR Login")) {
		 		AssertJUnit.assertTrue(true);
		 	log.info("Title pass successful");
		 		
		 	}else {
		 		AssertJUnit.assertTrue(false);
		 	}
		 	
		 	login.setUsername();
		 	login.setPassword();
		 	login.clickSubmit();
		 	log.info("application login successful");
			Thread.sleep(3000);
			login.clickAlert();
		}	
	
	@Test
	public static void home() throws IOException {
		System.out.println(driver.getTitle());
		
	}
	
	 
}

	

