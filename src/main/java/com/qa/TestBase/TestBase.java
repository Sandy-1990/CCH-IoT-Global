package com.qa.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qa.TestUtils.Utility;




public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
		
		File file =new File("C:\\Selenium automation\\HonoHR\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop = new Properties();
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
	}
	
	@BeforeClass
	public static void SetUp() {
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium automation\\HonoHR\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Utility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Utility.IMPLICIT_WAIT, TimeUnit.SECONDS);

			driver.get(prop.getProperty("url"));
			
		}
			
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	
	
//	@AfterMethod
//	 public static void TearDown(ITestResult result)
//	{
//		 if(result.getStatus()==ITestResult.FAILURE)
//		 {
//			 try {
//				Utility.takeScreenshotAtEndOfTest(driver, result.getName());
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		 }
//			driver.quit();
//		}

	
}











