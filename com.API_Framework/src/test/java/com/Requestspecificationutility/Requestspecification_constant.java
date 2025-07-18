package com.Requestspecificationutility;



import io.restassured.specification.RequestSpecification;

public class Requestspecification_constant {
	
 public static final String baseUri= "https://reqres.in/";                            //"https://gorest.co.in/public/v2";
 public static final String tokankey=  "x-api-key";                                         //"Authorization";
 public static final String tokanvalue=  "reqres-free-v1";                                            //"Bearer"+" 985fcee9f137470e0485652259f5a94153eb5ffc7287929ce8cc91858f590243";
 
 //user data
 public static final String name="omi111";
 public static final String email="Aps Powers";
 public static final String gender="Male";

 
 
 //full Post url
 public static final String postUri=baseUri+"/users";
 
 //full get uri
 public static final String getAllUri=baseUri+"api/users?page=2";
 
 //full uri get single user
 static String Id="/7970573";
 public static final String getSingleUri=getAllUri+Id;
 
 
 //Full Uri Put user
 static String Id2="api/users/2";
 public static final String PutUri=baseUri+Id2;
 
 // Full Uri Delete users
 
 
 static String Id3="api/users/2";
 public static final String DeleteUri=baseUri+Id3;
 
 
 
}
