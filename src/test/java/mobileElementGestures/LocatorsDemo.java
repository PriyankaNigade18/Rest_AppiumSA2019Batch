package mobileElementGestures;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driverSessions.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorsDemo {
  @Test
  public void elementLocators() throws InterruptedException
  {
	  AppiumDriver driver=DriverUtility.initAndroidSession();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //accessibility id(primary one)
	  
	 WebElement ele1= driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	 System.out.println("Text of mobileElement 1 is: "+ele1.getText());
	 ele1.click();
	 
	 Thread.sleep(1000);
	 //back
	 driver.navigate().back();
	 
	 //xpath
	 WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
	 System.out.println("Text of Element 2 is: "+ele2.getText());
	 ele2.click();
	 Thread.sleep(1000);
	 //back()
	 driver.navigate().back();
	 
	 //clasName
	WebElement ele3= driver.findElements(AppiumBy.className("android.widget.TextView")).get(3);
	 System.out.println("Text of Element 3: "+ele3.getText());
	 ele3.click();
	 Thread.sleep(1000);
	 //back()
	 driver.navigate().back();
	 
	 //id=resourceid
	 WebElement ele4=driver.findElements(AppiumBy.id("android:id/text1")).get(3);
	 System.out.println("Text of Element 4: "+ele4.getText());
	 ele4.click();
	 
	 Thread.sleep(1000);
	 //back()
	 driver.navigate().back();
	 
	 
	 //uiAutomator2 locator= androidUIAutomator
	WebElement ele5= driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Content\")"));
	 System.out.println("Text of Element 5: "+ele5.getText());
	 ele5.click();
	 
	 Thread.sleep(1000);
	 //back()
	 driver.navigate().back();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
  }
}
