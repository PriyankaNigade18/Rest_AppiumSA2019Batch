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
public class QueryPathParameterTest
{
	
	/*
	 * https: //reqres.in/api/          users                   ?page=2
	 * 
	 * protocol://domain/resource/path parameter   ? query parameter
	 * 
	 */
	
  @Test
  public void queryPathParameters()
  {
	  given()
	  .pathParam("path","users")
	  .queryParam("page",2)
	  
	  .when()
	  .get("https://reqres.in/api/{path}")
	  
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
