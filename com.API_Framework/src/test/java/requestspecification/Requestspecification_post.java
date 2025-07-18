package requestspecification;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Requestspecification_post {
	
	
	static String tokan="Bearer 985fcee9f137470e0485652259f5a94153eb5ffc7287929ce8cc91858f590243";

public static RequestSpecification postReqSpecification(String name ,String gender) {
RequestSpecBuilder builder=new RequestSpecBuilder();
String uniqueEmail = name + System.currentTimeMillis() + "@gmail.com";
builder.setBody("{\n"
        + "    \"name\": \""+ name + "\",\n"
        + "    \"email\": \"" + uniqueEmail + "\",\n"
        + "    \"gender\": \""+gender+"\",\n"
        + "    \"status\": \"active\"\n"
        + "}");
builder.setContentType(ContentType.JSON);
builder.addHeader("Authorization", tokan);
builder.setBaseUri("https://gorest.co.in/public/v2/users");

RequestSpecification spec=builder.build();
return spec;
}
}