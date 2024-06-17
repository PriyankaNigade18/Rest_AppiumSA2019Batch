package httpMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest_OlderWay 
{
  @Test
  public void singleUserGetRequest()
  {
	  Response res=RestAssured.get("https://www.google.com/");
	  System.out.println(res.statusCode());
	  System.out.println(res.getStatusLine());
	  System.out.println(res.getTime());
	  
	  int actcode=res.getStatusCode();
	  Assert.assertEquals(actcode,200,"AssertFail: Status code is not matching!");
	  System.out.println("Assert Pass: Status code matched with 200");
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
