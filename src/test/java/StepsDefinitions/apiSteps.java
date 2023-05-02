package StepsDefinitions;



import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class apiSteps {
	
	
	@Given("User hits endpoint {string}")
	public void user_hits_endpoint(String endpoint) {
	   
		
		RestAssured.baseURI = endpoint;
		Response response = RestAssured.given().get();
				
		JsonPath path = JsonPath.from(response.asString());
		System.out.println("State Province name is: " + path.getList("findAll{it.name == 'University of Witwatersrand'}.state-province"));
		
		
	}
	

}
