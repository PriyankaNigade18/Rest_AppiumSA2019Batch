package httpMethods;

import org.testng.annotations.Test;

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
public class SameUserCreate_Update_Delete
{
	String id;
  @Test(priority=1)
  public void createNewUser() 
  {
	  PojoData data=new PojoData();
	  data.setName("Neelam");
	  data.setJob("QA");
	  
	  //json --->id
	  		id=given()
		  		.contentType("application/json")
		  			.body(data)

		  			.when()
		  			.post("https://reqres.in/api/users")
		  			.jsonPath().get("id");
	  
	  System.out.println("User created with id: "+id);
	  //full response
	  //Response is interface
//	  Response res=given()
//			  		.contentType("application/json")
//			  			.body(data)
//	  
//			  			.when()
//			  			.post("https://reqres.in/api/users");
	  
	 // System.out.println(res.asString());
	  
  }
  
  
  @Test(priority=2,dependsOnMethods = "createNewUser")
  public  void updateSameUser()
  {
	  PojoData data=new PojoData();
	  data.setName("Prachi");
	  data.setJob("SDET");
	  

	  	given()
		  		.contentType("application/json")
		  			.body(data)

		  			.when()
		  			.put("https://reqres.in/api/users/"+id)
		  			
		  			.then()
		  			.statusCode(200)
		  			.log().body();
	  	
	  	System.out.println("User updated with id: "+id);
	  
  }
  
  
  @Test(priority=3,dependsOnMethods ="updateSameUser" )
  public void deleteSameUser()
  {
	given()
	.when().delete("https://reqres.in/api/users/"+id)
	
	.then()
	.statusCode(204);
	System.out.println("User deleted with id: "+id);
	
	
  }
  
  
  
  
  
}
