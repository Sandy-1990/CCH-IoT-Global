package com.qa.PageAction;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class Leave_Transactions extends TestBase{
	
	public Leave_Transactions() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(@class,'page-sidebar-wrapper')]//li[6]//a[1]//img[1]")
	WebElement menuScrllBar;
	
	@FindBy(xpath="//div[contains(@class,'page-sidebar-wrapper')]//li[6]//a[1]//img[1]")
	WebElement hoverToLeave;
	
	@FindBy(xpath="//span[contains(text(),'Leave Transactions')]")
	WebElement LeaveTransactions;
	
	@FindBy(xpath="//span[contains(text(),'Leave Types')]")
	WebElement LeaveType;
	
	

	public void menuScroll() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",menuScrllBar);
	}
	
	public void LeaveTransactions() {
	Actions action  = new Actions(driver);
	action.moveToElement(hoverToLeave).build().perform();	
	action.moveToElement(LeaveTransactions).click().build().perform();
		
	}
	
	public void LeaveType() {
		Actions action  = new Actions(driver);
		action.moveToElement(hoverToLeave).build().perform();	
		action.moveToElement(LeaveType).click().build().perform();
			
		}
	
	
}
