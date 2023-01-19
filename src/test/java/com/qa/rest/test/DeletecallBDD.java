package com.qa.rest.test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

//Delete a record in DB
public class DeletecallBDD {
	@Test
	public void DeleteEmployeeRecord() {
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/delete/11496";
		// Validate the status code and statusline
		given().when().delete().then().statusCode(200).statusLine("HTTP/1.1 200 OK").log().all();

	}
}
