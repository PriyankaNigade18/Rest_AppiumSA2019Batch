package mobileScenarios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driverSessions.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ReadNotifications {
  @Test
  public void testNotifications()
  {
	  AppiumDriver driver=DriverUtility.initAndroidSession();
	  
	  /*
	   * openNotifications()
	   */
	  //To open Notifications bar
	  ((AndroidDriver)driver).openNotifications();
	  
	  System.out.println("****test notifications headings*****");
	  List<WebElement> headings=driver.findElements(AppiumBy.id("android:id/title"));
	  System.out.println("Total Notifications are: "+headings.size());
	  
	  for(WebElement i:headings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  System.out.println("Appium setting Text");
	  String text=driver.findElement(AppiumBy.id("android:id/big_text")).getText();
	  System.out.println(text);
	  
	  System.out.println("Silent notification text");
	  
	  String text2=driver.findElement(AppiumBy.id("android:id/text")).getText();
	  
	  System.out.println(text2);
	  
	  
	  
	  
	  
	  
  }
}
