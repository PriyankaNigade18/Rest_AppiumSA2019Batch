package apiTest;

import org.testng.annotations.Test;
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

public class AuthenticationTypes
{
  @Test(priority=1)
  public void BasicAuth() 
  {
	  //Base64 algorithm
	  given()
	  		.auth().basic("postman", "password")
	  .when().get("https://postman-echo.com/basic-auth")	
	  
	  .then()
	  .statusCode(200)
	  .body("authenticated", equalTo(true))
	  .log().body();
	  
	  System.out.println("Basic Authentication is completed!");
	  
	  
  }
  
  
  @Test(priority=2)
  public void DigestAuth() 
  {
	  //MD5 algorithm
	  given()
	  .auth().digest("postman","password")
	  	
	  .when().get("https://postman-echo.com/digest-auth")	
	  
	  .then()
	  .statusCode(200)
	  .body("authenticated", equalTo(true))
	  .log().body();
	  
	  System.out.println("Digest Authentication is completed!");
	  
	  
  }
  
  @Test(priority=2)
  public void BearerAuth() 
  {
	 
	  given()
	  	.header("Authorization","Bearer 12345")
	 
	  	.when().get("https://postman-echo.com")	
	  
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	  System.out.println("Bearer Authentication is completed!");
	  
	  
  }
  @Test(priority=2)
  public void Oauth2Auth() 
  { 
	  given()
	  .auth().oauth2("12345")
	 
	  	.when().get("https://postman-echo.com")	
	  
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	  System.out.println("OAuth2  Authentication is completed!");
	  
	  
  }
  
  
  
  
  
  
}
