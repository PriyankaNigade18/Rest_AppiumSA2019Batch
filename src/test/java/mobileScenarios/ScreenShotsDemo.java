package mobileScenarios;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import driverSessions.DriverUtility;
import io.appium.java_client.AppiumDriver;

public class ScreenShotsDemo {
  @Test
  public void takeScreenshot() throws IOException 
  {
	  AppiumDriver driver=DriverUtility.initAndroidSession();
	  
	  TakesScreenshot ts=(TakesScreenshot)driver;
	 File temp= ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File(System.getProperty("user.dir")+"//Screenshots//APIDemos"+System.currentTimeMillis()+".png");
	 
	 FileHandler.copy(temp, dest);
	 
	 
	 
	 
	 
	 
	  
	  
	  
  }
}
