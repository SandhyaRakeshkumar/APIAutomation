package com.qa.rest.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

//Testing Get request
public class GetcallBDD {

	@Test(priority = 1)
	public void EmployeeMessageBody() {

		// Getting the employee details of empid 22
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employee";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/22");

		// Retrieve the body of the Response
		ResponseBody body = response.getBody();

		// By using the ResponseBody.asString() method, we can convert the body
		// into the string representation.
		System.out.println("Response Body is: " + body.asString());
	}

	// Testing if the Get call returns status code 200 and asserting the condition
	@Test(priority = 2)
	public void test_numofcirucuitsfor2017_season() {

		given().when().get("http://ergast.com/api/f1/2017/circuits.json").then().assertThat().statusCode(200).and()
				.body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).log().all();
	}
}
