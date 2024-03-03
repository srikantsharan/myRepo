package android;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Install {
	
	
	
	
	private AndroidDriver driver;
	
	
	@BeforeClass
	public void startServer()
	{
		
		AppiumDriverLocalService service = new AppiumServiceBuilder()
				.withAppiumJS(new File("C:\\Users\\silpi\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1")
				.usingPort(4723)
				.withTimeout(Duration.ofSeconds(200))
				.build();
		service.start();
	}
	
	
	@Test(priority=1)
	public void setCApabilities() throws Throwable
	{
		UiAutomator2Options option=new UiAutomator2Options();
		option
		       .setAutomationName("UiAutomator2")
		       .setDeviceName("myMobile")
		       .setPlatformName("Android")
		       .setPlatformVersion("14")
		  //     .noReset().withBrowserName("Chrome");
		       .setApp("src\\test\\resources\\ApiDemos-debug.apk")
		       .setNoReset(false)
		        .setAppPackage("  io.appium.android.apis")
		       .setAppActivity("io.appium.android.apis.ApiDemos");
		
		URL url=URI.create("http://127.0.0.1:4723/").toURL();
	
		driver=new AndroidDriver(url,option);
		
	
		
	}
	@Test(priority=2)
	public void perforfActions() throws Throwable
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@text,'Views')]")).click();
		
	//	WebElement element=driver.findElement(By.xpath("//*[contains(@text,'TextClock')]"));
		String element="TextClock";
		WebElement press=driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector().scrollable(true))"
						+".scrollIntoView(new UiSelector().text(\""+element+"\"))"));
		
		press.click();
		
		
	}
	

}
