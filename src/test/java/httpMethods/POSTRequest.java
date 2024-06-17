package httpMethods;

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

Post
===========
create resource on server
1.HashMap
2.POJO - plain old java object class[encapsulation:data + function]
*/
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class POSTRequest {
  @Test
  public void postWithHashMap()
  {
	  
	  //Request Payload
	  HashMap<String,Object> data=new HashMap<String,Object>();
	  data.put("name","Priyanka");
	  data.put("job","SDET");
	  
	  
	  given()
	  	.contentType("application/json")
	  	.body(data)
	  .when()
	  	.post("https://reqres.in/api/users")
	  .then()
	  .statusCode(201)
	  .body("name",equalTo("Priyanka"))
	  .log().body();
	  
	  
  }
}
