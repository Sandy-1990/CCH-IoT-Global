package com.qa.PageAction;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.TestBase.TestBase;

public class HomePage extends TestBase{

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='menu-toggler hidden-xs hidden-sm']")
	WebElement main_menu;
	
	@FindBy(xpath = "//ul[@id='ulid']//li[2]//a[1]//img[1]")
	WebElement employee;
	
	@FindBy (xpath = "//span[contains(text(),'My Profile')]")
	WebElement myProfile;
		
	@FindBy(xpath = "//h3[contains(text(),'Raman TestAuto')]")
	WebElement pageTitle;
	
	@FindBy(xpath = "//span[contains(text(),'Official Details')]")
	WebElement OfficialDetailsTitle;
	
	@FindBy(xpath = "//a[contains(text(),'Bank Details')]")
	WebElement bankDetails;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/div[1]/div/div/div/div[1]/div/div[4]/div")
	WebElement officialInfo;
	
	
	public void menu() {
		main_menu.click();
		
	}
	
	public void mouseHover_Employee() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(employee);
		action.moveToElement(myProfile).click().build().perform();
		Thread.sleep(3000);
		String title = pageTitle.getText();
		Assert.assertEquals("Raman TestAuto", title);
		String subTitle = OfficialDetailsTitle.getText();
		Assert.assertEquals("OFFICIAL DETAILS", subTitle);
		//Thread.sleep(3000);
		
	}
	
	public void selectOfficialInfo() {
		officialInfo.click();
		Select select = new Select(officialInfo);
		select.selectByVisibleText("Personal Information");
		
	}
	
	
	public void bankDetails() {
		
		bankDetails.click();
	}
	
	
	

	
}
