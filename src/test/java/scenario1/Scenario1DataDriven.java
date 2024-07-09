package scenario1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario1DataDriven 
{
  @Test(dataProvider = "excelfile",dataProviderClass = ExcelUtility.class)
  public void testcase(String username,String password) throws InterruptedException
  {
	 WebDriver  driver = new ChromeDriver();
	  //driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	    Thread.sleep(2000);
	  	Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
		  System.out.println("Login Successfull");
		  
		//  driver.quit();

	 
  }
}
