package httpMethods;

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

public class GetRequest_Latest 
{
  @Test(priority=1)
  public void singleUserRequest()
  {
	  
	  //https://reqres.in/api/users/2
	   
	  given()
	  
	  .when()
	  				.get("https://reqres.in/api/users/2")
	  .then()
	  .statusCode(200)
	  .body("data.first_name",equalTo("Janet"))
	  .body("data.email",equalTo("janet.weaver@reqres.in"))
	  .log().all();
	  
	  System.out.println("Single User Validation is done!");
  }
  
  @Test(priority=2)
  public void listOfUsers()
  {
	  
	  given()
	  
	  .when().get("https://reqres.in/api/users?page=2")
	  
	  .then()
	  .statusCode(200)
	  .body("page",equalTo(2))
	  .body("data.id[2]",equalTo(9))
	  //hasItems() -> Check all elements are in a collection
	  //all ids from json body
	  .body("data.id",hasItems(7,8,9,10,11,12))
	  //changing the order
	  .body("data.id",hasItems(10,7,12,8,9,11))
	  //patial ids
	  .body("data.id",hasItems(9,11,12))
	 // contains() -> Check all elements are in a collection and in a strict order
	  .body("data.id",contains(7,8,9,10,11,12))
	  //partial id
	 // .body("data.id",contains(7,10,12))//fail
	  //order
	  .body("data.id",contains(10,9,7,11,12,8))
	  .log().body();
	  
	  
	  
	  
	  
	  
  }
  
  
}
