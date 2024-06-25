package mobileScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driverSessions.DriverUtility;
import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AndroidKeyEvent {
  @Test
  public void testKeyboard()
  {
	  AppiumDriver driver=DriverUtility.initAndroidSession();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //scroll-3
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  Utility.scrollUpToCount(driver, area, 3);
	  //text
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  
	  //edit
	  driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).sendKeys("Hello All!");
	  
	  //edit1
	  driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit1")).click();
	  
	( ( AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.T));
	  	( ( AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.E));
	( ( AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.S));
	( ( AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.T));
	( ( AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.I));
	( ( AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.N));
	( ( AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.G));
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
