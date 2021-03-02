package com.qa.PageAction;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class LoginPage extends TestBase{
	
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}

		//Enter username
		@FindBy(xpath="//input[@name='username']")
		WebElement Username;
		
		//Enter Password
		@FindBy(xpath = "//input[@name='password']")
		WebElement Password;
		
		//click login
		
		@FindBy(xpath = "//button[@type = 'submit']")
		WebElement login;
		
		@FindBy(xpath ="//button[@class='btn red']")
		WebElement alert; 
		
		
		
		public String LoginPageTitleTest()
		{
			return driver.getTitle();
		}
		
		public void  setUsername() {
			Username.sendKeys( prop.getProperty("username"));
		}
		
		public void setPassword() {
			Password.sendKeys(prop.getProperty("password"));
		}
		
		public void clickSubmit() {
			login.click();
		}
		
		public void clickAlert() {
			alert.click();
		}
	
}
