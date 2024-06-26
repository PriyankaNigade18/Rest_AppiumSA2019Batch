package mobileScenarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import driverSessions.DriverUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Lock_Unlock_Rotate {
	@Test
	public void testDeviceGeneralFeatures() {
		AppiumDriver driver = DriverUtility.initAndroidSession();
		/*
		 * lockDevice() unlockDevice() rotate(ScreenOrientation)
		 * 
		 */
		/*
		 * ((AndroidDriver)driver).lockDevice();
		 * 
		 * System.out.println("Device is Locked!");
		 * 
		 * ((AndroidDriver)driver).unlockDevice();
		 * 
		 * System.out.println("Device is UnLocked!");
		 * 
		 */

		// rotate
		((AndroidDriver) driver).rotate(ScreenOrientation.LANDSCAPE);

		System.out.println("Screen in Landscape mode!");

		((AndroidDriver) driver).rotate(ScreenOrientation.PORTRAIT);

		System.out.println("Screen in  mode!");

	}
}
