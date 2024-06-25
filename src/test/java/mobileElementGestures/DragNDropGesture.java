package mobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSessions.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragNDropGesture {
  @Test
  public void testDrag() 
  {
	  
	  AppiumDriver driver=DriverUtility.initAndroidSession();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  //drag n drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //3dot
	  
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  
	  //dragGesture
	  driver.executeScript("mobile: dragGesture", ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX",704,
			  "endY",1134
			    ));
	  
	  //result text
	  String text=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  
	  System.out.println("Result text is: "+text);
	  
	  System.out.println("Drag Gesture is comepleted!");
	  
	  
  }
}
