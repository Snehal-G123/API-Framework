package com.Requestspecificationutility;

import org.apache.http.client.methods.RequestBuilder;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RedirectSpecification;
import io.restassured.specification.RequestSpecification;
import requestspecification.Requestspecification_post;

public class Reqspec {
	 //static RequestSpecBuilder builder;
	 
	
	 
	 
	 public  RequestSpecification build_Post
	 (String baseUri, String name, String email, String gender) 
	 {
	        String body = "{\n" +
	                "    \"name\": \"" + name + "\",\n" +
	                "    \"email\": \"" + email + "\",\n" +
	                "    \"gender\": \"" + gender + "\",\n" +
	                "    \"status\": \"active\"\n" +
	                "}";

	        RequestSpecBuilder builder = new RequestSpecBuilder();
	        builder.setBaseUri(baseUri);
	        builder.setContentType(ContentType.JSON);
	        builder.addHeader(Requestspecification_constant.tokankey, Requestspecification_constant.tokanvalue);
	        builder.setBody(body);
	        return builder.build();
	    }
	
	public RequestSpecification getmethod() {
		 RequestSpecBuilder builder = new RequestSpecBuilder();
		 builder.setBaseUri(Requestspecification_constant.baseUri);
		 builder.setContentType(ContentType.JSON);
		 
		return builder.build();
		
	}
	
	//Put  Method 
	
	public RequestSpecification putMethod(String baseUri,String name, String email) {
		String body = "{\n" +
                "    \"name\": \"" + name + "\",\n" +
                "    \"email\": \"" + email + "\",\n" +
                "    \"status\": \"active\"\n" +
                "}";
		 RequestSpecBuilder builder = new RequestSpecBuilder();
		 builder.setBaseUri(baseUri);
		 builder.setContentType(ContentType.JSON);
		 builder.addHeader(Requestspecification_constant.tokankey, Requestspecification_constant.tokanvalue);
		 builder.setBody(body);
		return builder.build();
		}
	
	
	public RequestSpecification patchtMethod(String baseUri,String name) {
		String body="{\r\n"
				+ "  \"name\": \""+name+"\",\r\n"
				+ "}";
		 RequestSpecBuilder builder = new RequestSpecBuilder();
		 builder.setBaseUri(baseUri);
		 builder.setContentType(ContentType.JSON);
		 builder.addHeader(Requestspecification_constant.tokankey, Requestspecification_constant.tokanvalue);
		 builder.setBody(body);
		return builder.build();
		}

	// Delete
	public RequestSpecification delete (String baseUri) {
		 RequestSpecBuilder builder = new RequestSpecBuilder();
		 builder.setBaseUri(baseUri);
		 builder.addHeader(Requestspecification_constant.tokankey, Requestspecification_constant.tokanvalue);
		 return builder.build();
		
	}
	
}
	
	

