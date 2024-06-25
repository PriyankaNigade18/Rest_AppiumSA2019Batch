package mobileScenarios;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import driverSessions.DriverUtility;
import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AlertHandling {
  @Test
  public void alertTest()
  {
	  /*
	   * Alert is interface in selenium WebDriver 
	   * Alert alr= driver.switchTo().alert();
	   * getText()
	   * accept()
	   * dismiss()
	   * sendKeys()
	   *  
	   */
	  
	  AppiumDriver driver=DriverUtility.initAndroidSession();
	  
	  //App
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  //alerts
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  //alert ele
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
	  
	  //alert window will open
	  Utility.getScreenshot(driver);
	  	Alert alt=driver.switchTo().alert();
	  	System.out.println("Text of the alert is: "+alt.getText());

	  	alt.accept();
	  	
	  	
	  
	  
	  
	  
	  
	  
  }
}
