package mobileScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driverSessions.DriverUtility;
import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class NetworkConfigurationTest {
  @Test
  public void testConfiguration() throws InterruptedException
  {
	  /*
	   * wifi- toggleWifi()
	   * mobile data- toggleData()
	   * airplanemode- toggleAirplaneMode()
	   * 
	   * 
	   */
	  //create a driver session
	  AppiumDriver driver=DriverUtility.initAndroidSession();
	  
	  
	  System.out.println("Initially wifi is ON");
	  //ON--->OFF
	  
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("Wifi setting is OFF");
	  Thread.sleep(1000);
	  //OFF--->ON
	  
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("Wifi setting is ON");

	  
	  //swipe to next window
	  //area
	  WebElement area=driver.findElement(AppiumBy.id("com.android.systemui:id/tile_page"));
	  Utility.swipeLeft(driver, area);
	  Thread.sleep(2000);
	  
	  System.out.println("Initial status of mobile data is ON");
	  //ON--->OFF
	  
	  ((AndroidDriver)driver).toggleData();
	  
	  System.out.println("Current status of data is OFF");
	  
	  Thread.sleep(1000);
	  //OFF-ON
	  ((AndroidDriver)driver).toggleData();
	  
	  System.out.println("Current status of data is ON");
	  Thread.sleep(1000);
	  
	  System.out.println("Initial Status of Airplane mode is OFF");
	  //OFF-->ON
	  
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  Thread.sleep(1000);
	  System.out.println("Current status is ON");
	  //ON --> OFF
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  Thread.sleep(1000);
	  System.out.println("Current status is OFF");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
