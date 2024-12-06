package test.api;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.baseURI="https://rahulshettyacademy.com";
given().queryParam("key", "qaclick123")
.header("Content-Type","application/json")
.body("{\r\n"
		+ "    \"status\": \"OK\",\r\n"
		+ "    \"place_id\": \"118963b373003b801d4eb4ac08ab9e46\",\r\n"
		+ "    \"scope\": \"APP\",\r\n"
		+ "    \"reference\": \"4ef5c2cfa87a752158701174070e3c054ef5c2cfa87a752158701174070e3c05\",\r\n"
		+ "    \"id\": \"4ef5c2cfa87a752158701174070e3c05\"\r\n"
		+ "}");
		
	}

}
