package com.API_Framework;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


import com.Requestspecificationutility.Reqspec;
import static com.Requestspecificationutility.Requestspecification_constant.*;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

public class Gorest     {

	Reqspec req = new Reqspec();
	
	@Ignore	
	
	                                         //Post 
	@Test
	public void verify_Gorest_Create_User_With_ValidData() {
	RequestSpecification post	=req.build_Post(baseUri,name, email, gender);
	 given()
	.spec(post)
	.when()
	.post(postUri)
	.then()
	.statusCode(201)
	.log()
	.all();
	
	
	}
	@Ignore	
	
	                                         //Get All
@Test
	public void Verify_GetAll_User_WithValiduri() {
	RequestSpecification get=req.getmethod();
		given()
		.spec(get)
		.when()
		.get(getAllUri)
		.then()
		.statusCode(200)
		.log()
		.all();
	}

	
@Ignore

                                            // Get Id 
@Test
public void Verify_GetBySingal_User_WithValidUri() {
	RequestSpecification get=req.getmethod();
		given()
		.spec(get)
		.when()
		.get(getSingleUri)
		.then()
		.statusCode(200)
		.log()
		.all();
	}
@Ignore
	                                           //Put 
@Test
	public void Verify_Update_User_With_Validdata() {
		
		RequestSpecification put=	req.putMethod(baseUri, name, email);
		given()
		.spec(put)
		.when()
		.put(PutUri)
		.then()
		.statusCode(200)
		.log()
		.all();
		
	}



	//@Ignore

                                               // Delete

	@Test
public void Verify_Delete_Users_With_Validdata() {	
		RequestSpecification Delete=	req.delete(baseUri);
		given()
		.spec(Delete)
		.when()
		.delete(DeleteUri)
		.then()
		.statusCode(204)
		.assertThat()
		.log()
		.all();
		
	}
	
	
	
	

}
