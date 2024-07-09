package scenario2_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RedBusDropdown {
  @Test
  public void tesdropdown()
  {
	  
	ChromeOptions options =new ChromeOptions();
	
	  options.addArguments("--disable-notifications");
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  //dropdown
	 WebElement ddele= driver.findElement(By.id("src"));
	 ddele.click();
	 ddele.sendKeys("pune");
	  
	 //list of options
	 List<WebElement> list1=driver.findElements(By.xpath("//ul[contains(@class,'sc-dnqmqq')]//li//text[@class='placeHolderMainText']"));
	  System.out.println("Total numbet of Options: "+list1.size());
	  
	  for(WebElement i:list1)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Kharadi"))
		  {
			  i.click();
			break;  
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
