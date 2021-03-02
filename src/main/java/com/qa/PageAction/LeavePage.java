package com.qa.PageAction;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.TestBase.TestBase;

public class LeavePage extends TestBase{

	public LeavePage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//div[contains(@class,'page-sidebar-wrapper')]//li[6]//a[1]//img[1]")
	WebElement hoverToLeave;
	
	@FindBy(xpath= "//span[contains(text(),'Create Leave Request')]")
	WebElement CreateLeaveRequest;
	
	@FindBy(xpath= "//span[contains(text(),'Apply For Leave')]")
	WebElement pageTitle;
	
	@FindBy (xpath = "//select[@id='leaveType']")
	WebElement leaveType;
	
	@FindBy(xpath = "//input[@id='fromDate']")
	WebElement fromDate;
	
	@FindBy(xpath = "//input[@id='toDate']")
	WebElement ToDate;
	
	@FindBy(xpath = "//textarea[@id='reason']")
	WebElement reason;
	
	@FindBy(xpath = "//button[@id='leaveSubmit']")
	WebElement submit;
	
	public void createLeaveRequest() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(hoverToLeave);
		action.moveToElement(CreateLeaveRequest).click().build().perform();
		String title = pageTitle.getText();
		Assert.assertEquals(title, "APPLY FOR LEAVE");
		Thread.sleep(1000);
		
	}
	
	public void applyForLeave() throws InterruptedException {
		leaveType.click();
		Thread.sleep(2000);
		Select select = new Select(leaveType);
		select.selectByIndex(2);
		
	}
	
	public void datePickerFromDate() throws InterruptedException {
		String date = "07/08/2020";
		JavascriptExecutor js  = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('placeholder', '"+date+"'); ", fromDate);
	}
	
	public void datePickerToDate() throws InterruptedException {
		String date = "07/08/2020";
		JavascriptExecutor js  = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('placeholder', '"+date+"'); ", ToDate);
		
		reason.sendKeys("I request to grant my leave");
		Thread.sleep(3000);
		submit.click();
	}
	
	
	
	
}
