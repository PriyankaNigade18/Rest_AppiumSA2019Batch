package apiTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


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

public class HeadersTest {
  @Test
  public void getAllHeader() 
  {
	  given()
	  .when().get("https://www.google.com")
	  .then()
	  .log().headers();
	  
  }
  
  
  
  @Test
  public void validateSingleHeader() 
  {
	  // text/html; charset=ISO-8859-1
	  Response res=given()
			  					.when().get("https://www.google.com");
	 
	  String header=res.getHeader("Content-Type");
	  System.out.println(header);
	  
	  //validation
	  
	  Assert.assertEquals(header, "text/html; charset=ISO-8859-1","Test Fail: Headers not matched!");
	  System.out.println("Test Pass: Headers matched!");
  }
  
  
  @Test
  public void testHeaders() 
  {
	  // text/html; charset=ISO-8859-1
	  Response res=given()
			  					.when().get("https://www.google.com");
	  
	  Headers hd=res.getHeaders();
	  System.out.println(hd);
	  
	  
	  
	  
	 
  }
  
}
