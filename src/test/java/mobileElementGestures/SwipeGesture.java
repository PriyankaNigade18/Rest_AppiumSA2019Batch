package mobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSessions.DriverUtility;
import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeGesture {
  @Test
  public void testSwipe()
  {
	  AppiumDriver driver=DriverUtility.initAndroidSession();
		 
		 //view
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		 
		 //gallery
		 driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		 
		 //photos
		 driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		 
		 //elearea-swipe
		 
		 WebElement area=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
		 //swipe
		 
//		 driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
//				 "elementId",((RemoteWebElement)area).getId(),
//				 "direction","left",
//				 "percent",0.75
//				  ));
//		 
		 Utility.swipeLeft(driver, area);
		 
		 System.out.println("Swipe Gesture Completed!");




	  
	  
	  
	  
  }
}
