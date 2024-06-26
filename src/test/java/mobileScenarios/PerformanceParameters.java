package mobileScenarios;

import java.util.List;

import org.testng.annotations.Test;

import driverSessions.DriverUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class PerformanceParameters {
  @Test
  public void testParameters() 
  {
	  
	  AppiumDriver driver=DriverUtility.initAndroidSession();
	  
	  //all data types
	  List<String> allDatatypes=((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  System.out.println(allDatatypes);
	  //[cpuinfo, memoryinfo, batteryinfo, networkinfo]
	  
	  System.out.println("*************Test BatteryInfo**************");
	  
	 List<List<Object>> batteryChar= ((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","batteryinfo",5);
	  System.out.println(batteryChar);
	  
	  System.out.println("****************MemoryInfo ***********");
	  
	  List<List<Object>> memoryChar= ((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","memoryinfo",5);
	  System.out.println(memoryChar);
	  
System.out.println("****************NetworkInfo ***********");
	  
	  List<List<Object>> networkChar= ((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","networkinfo",5);
	  System.out.println(networkChar);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
