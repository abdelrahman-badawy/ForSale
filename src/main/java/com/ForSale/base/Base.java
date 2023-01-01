package com.ForSale.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;



public class Base {
	
	protected static AndroidDriver driver;
	protected FileInputStream fileInputStream;
	protected Properties properties;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	public Base() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@BeforeSuite
	public void beforeSuite() {
		
		extent = new ExtentReports("Reports/index.html");
		extent.addSystemInfo("Framework Type", "Appium Page Object");
		extent.addSystemInfo("Author", "Abdelrahman");
		extent.addSystemInfo("Environment", "Windows");
		extent.addSystemInfo("App", "4Sale");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		extent.flush();
	}
	 
	
	
	@BeforeMethod
	public void beforeMethod(java.lang.reflect.Method method) {
		logger = extent.startTest(method.getName());
		
	}
	
	@AfterMethod
	public void afterMethod(java.lang.reflect.Method method, ITestResult result) throws IOException {
		
		File image = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(image, new File ("Snapshots/" + method.getName() + ".jpg"));
		String fullPath = System.getProperty("user.dir") + File.separator + "Snapshots/" + method.getName() + ".jpg";
		if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(LogStatus.PASS, "Test is passed because there is no error");
			logger.log(LogStatus.PASS, logger.addScreenCapture(fullPath));
		}
		else if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL, "Test is failed");
			logger.log(LogStatus.FAIL, result.getThrowable());
			logger.log(LogStatus.FAIL, logger.addScreenCapture(fullPath));
		}
		else {
			logger.log(LogStatus.SKIP, "Test is Skipped because there is no error");
		}
	}
	
	
	@Parameters({"deviceName" , "platformName"})
	@BeforeTest
	public void beforeTest(String deviceName , String platformName) throws IOException {
		
		//Define PropertiesFile
		File propertiesFile = new File("src\\main\\resources\\config\\config.properties");
		
		//Define File Input Stream
		fileInputStream = new FileInputStream(propertiesFile);
		
		//Define Properties Object
		properties = new Properties();
		properties.load(fileInputStream);
		
		//Define Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//device name will be parameter
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, properties.getProperty("androidAutomationName"));
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, properties.getProperty("appActivity"));
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, properties.getProperty("appPackage"));
		
		//Define Android Driver
		driver = new AndroidDriver (new URL(properties.getProperty("appiumServerLink")), caps);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		logger = extent.startTest("test");
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
