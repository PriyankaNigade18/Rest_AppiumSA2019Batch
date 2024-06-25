package mobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSessions.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LongClickGesture {
  @Test
  public void testLongclick()
  {
	  
	  AppiumDriver driver=DriverUtility.initAndroidSession();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag n drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //first dot
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //longClick Gesture
	  
	  driver.executeScript("mobile: longClickGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "duration",3000
			    ));
	  
	  
	  System.out.println("Long click Gesture completed!");
	  
	  
	  
	  
	  
	  
	  
	  
  
  
  }
}
