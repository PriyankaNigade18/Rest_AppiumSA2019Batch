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
public class Update_DeleteUser {
  @Test
  public void putRequest() 
  {
	  
	  //payload
	  PojoData data=new PojoData();
	  data.setName("Jay");
	  data.setJob("Automation Engg");
	  
	  given()
	  .contentType("application/json")
	  .body(data)
	  
	  .when().put("https://reqres.in/api/users/2")
	  
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	   
  }
  
  
  @Test
  public void deleteRequest()
  {
	  given()
	  .when().delete("https://reqres.in/api/users/2")
	  .then()
	  .statusCode(204)
	  .log().all();
	  
  }
  
  
  
  
  
  
  
}
