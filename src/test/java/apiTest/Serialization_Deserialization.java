package apiTest;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import httpMethods.PojoData;

public class Serialization_Deserialization
{
	/*
	 * Serialization- Conversion of java object into JSON
	 * 
	 * De-Serialization - Conversion of JSON to java object
	 */
  @Test
  public void serializationTest() throws JsonProcessingException
  {
	  PojoData data=new PojoData();
	  data.setName("Jay");
	  data.setJob("QA");
	  
	  //Mapper class for conversion
	  
	  ObjectMapper mapper=new ObjectMapper();
	 String json= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
	 
	 System.out.println(json);
	  
	  
  }
  
  
  @Test
  public void deserialization() throws JsonMappingException, JsonProcessingException
  {
	  
	String jsondata="{\n"
			+ "  \"name\" : \"Jay\",\n"
			+ "  \"job\" : \"QA\"\n"
			+ "}";  
	  
	//Object mapper class
	ObjectMapper mapper=new ObjectMapper();
	
	PojoData data=mapper.readValue(jsondata,PojoData.class);
	
	System.out.println(data.getName());
	System.out.println(data.getJob());
	
	
	
	
	  
  }
}
