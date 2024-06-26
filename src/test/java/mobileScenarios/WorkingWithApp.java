package mobileScenarios;

import java.time.Duration;

import org.testng.annotations.Test;

import driverSessions.DriverUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WorkingWithApp {
  @Test
  public void testApp() throws InterruptedException
  {
	  
	  AppiumDriver driver=DriverUtility.initAndroidSession();	  
	    
	  //Current status
	  System.out.println("Application Status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  //terminate app
	  ((AndroidDriver)driver).terminateApp("io.appium.android.apis");
	  System.out.println("After Terminate Application Status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  Thread.sleep(2000);
	  
	  //activate app
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  System.out.println("After Activate Application Status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  
	  //uninstall -remove app
	  ((AndroidDriver)driver).removeApp("io.appium.android.apis");
	  System.out.println("Uninstall Application Status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	//install  
	  ((AndroidDriver)driver).installApp(path);
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  System.out.println("Install Application Status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  //Background
	  
	  ((AndroidDriver)driver).runAppInBackground(Duration.ofSeconds(5));
	  
	  System.out.println("After Background execution Application Status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
