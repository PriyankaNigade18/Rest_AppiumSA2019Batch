package generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class Utility 
{
	
	public static void getScreenshot(AppiumDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File temp= ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File(System.getProperty("user.dir")+"//Screenshots//APIDemos"+System.currentTimeMillis()+".png");
		 
		 try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void scrollUpToCount(AppiumDriver driver,WebElement pageArea,int count)
	{
		for(int i=1;i<=count;i++)
		{
		 driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
				  "elementId",((RemoteWebElement)pageArea).getId(),
				  "direction","down",
				  "percent",0.75
				 	  ));
		 
		 System.out.println("Iteration count is: "+i);
		}
		  
	}
	
	
	public static void scrollDown(AppiumDriver driver,WebElement pageArea)
	{
		 driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
				  "elementId",((RemoteWebElement)pageArea).getId(),
				  "direction","down",
				  "percent",0.75
				 	  ));
		  
	}
	
	public static void scrolUp(AppiumDriver driver,WebElement pageArea)
	{
		 driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
				  "elementId",((RemoteWebElement)pageArea).getId(),
				  "direction","up",
				  "percent",0.75
				 	  ));
		  
	}
	
	public static void scrolLeft(AppiumDriver driver,WebElement pageArea)
	{
		 driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
				  "elementId",((RemoteWebElement)pageArea).getId(),
				  "direction","left",
				  "percent",0.75
				 	  ));
		  
	}
	
	public static void scrolRight(AppiumDriver driver,WebElement pageArea)
	{
		 driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
				  "elementId",((RemoteWebElement)pageArea).getId(),
				  "direction","right",
				  "percent",0.75
				 	  ));
		  
	}
	
	//swipe
	
	public static void swipeLeft(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				 "elementId",((RemoteWebElement)area).getId(),
				 "direction","left",
				 "percent",0.75
				  ));
		 
	}
	
	
	public static void swipeUp(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				 "elementId",((RemoteWebElement)area).getId(),
				 "direction","up",
				 "percent",0.75
				  ));
		 
	}
	
	
	
	public static void swipeDown(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				 "elementId",((RemoteWebElement)area).getId(),
				 "direction","down",
				 "percent",0.75
				  ));
		 
	}
	
	
	public static void swipeRight(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				 "elementId",((RemoteWebElement)area).getId(),
				 "direction","right",
				 "percent",0.75
				  ));
		 
	}
	
	
	
	

}
