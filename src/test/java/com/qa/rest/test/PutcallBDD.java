package com.qa.rest.test;

import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PutcallBDD {

	public static HashMap map = new HashMap();

	String empName = Restutils.empName();
	String empSalary = Restutils.empSal();
	int emp_id = 11259;

	//updating the existing data by random data from Restutils file
	@BeforeClass
	public void putData() {
		map.put("name", empName);
		map.put("salary", empSalary);

		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/";
		RestAssured.basePath = "/update/" + emp_id;
	}

	@Test
	public void testPUT() {
		given().relaxedHTTPSValidation().body(map).with().contentType("application/json").when().put().then()
				.statusCode(200).log().all();
//check if the status code is 200
	}
}
