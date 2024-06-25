package mobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSessions.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGesture
{
  @Test
  public void testClickGesture() 
  {
	 AppiumDriver driver=DriverUtility.initAndroidSession();
	 
	 //view
	 WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));
	 
	 
	 //clickGesture
	 driver.executeScript("mobile: clickGesture",ImmutableMap.of(
			 
			 "elementId",((RemoteWebElement)ele).getId()
			 
			 ));
	 
	 System.out.println("Click Gesture completed!");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
  }
}
