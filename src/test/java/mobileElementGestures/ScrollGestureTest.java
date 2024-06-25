package mobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSessions.DriverUtility;
import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGestureTest {
  @Test
  public void f() throws InterruptedException 
  
  {
	  AppiumDriver driver=DriverUtility.initAndroidSession();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //view for action
	  WebElement pageArea=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  //scroll Gesture
//	  driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
//			  "elementId",((RemoteWebElement)pageArea).getId(),
//			  "direction","down",
//			  "percent",0.75
//			 	  ));
	  
	  
	  Utility.scrollDown(driver, pageArea);
	  System.out.println("Page scroll Down !");
	  
	  Thread.sleep(2000);
	  Utility.scrolUp(driver, pageArea);
	  System.out.println("Page Scroll Up!");
	  
	  Thread.sleep(2000);
	  
	  Utility.scrollUpToCount(driver, pageArea, 2);
	  
	  
	  
	  
  }
}
