package apiTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;


/*
 * given()-prerequisite
 * ------------------------------
 * headers/cookies/path/query param /request payload(resource)/authentication
 * 
 * when()-Send request
 * ---------------------------------
 * GET/POST/PUT/PATCH/DELETE
 * 
 * then()-validate response
 * --------------------------------
 * status code/response payload/status msg/
 * 
 * Methods
 * ==========
  equalTo()-test equality for data
hasItems() -> Check all elements are in a collection
contains() -> Check all elements are in a collection and in a strict order

 */
public class CookiesTest {
  @Test
  public void getAllCookies()
  {
	  given()
	  .when().get("https://www.google.com")
	  .then()
	  .log().cookies();
	  
  }
  
  
  
  
  
  @Test
  public void getSingleCookies()
  {
	  Response res=given()
			  	.when().get("https://www.google.com");
	   
	  String actValue=res.getCookie("AEC");
	  System.out.println(actValue);
	  String exp="AQTF6Hw0JuPGKcqPkzyBwdV5RVZDpth7nU9";
	  //validation As cookies are dynamic the contents should not be same
	  Assert.assertFalse(actValue.contains(exp),"Test Fail: as value for cookies are same");
	  System.out.println("Test Pass: As cookies values are different");
	    
	 
	  
  }
  
  @Test
  public void getSetOfCookies()
  {
	  Response res=given()
	  .when().get("https://www.google.com");
	  
	  Map<String,String> map=res.getCookies();
	  
	  System.out.println(map);
	  //iteration
	  
	  for(Map.Entry<String,String> i:map.entrySet())
	  {
		  System.out.println(i.getKey()+" : "+i.getValue());
	  }
	  
	  
  }
}
