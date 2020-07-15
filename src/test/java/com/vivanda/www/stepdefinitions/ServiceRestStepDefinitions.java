package com.vivanda.www.stepdefinitions;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.*;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

public class ServiceRestStepDefinitions {
	
	String  respJson;
	
	@Given("That cesar wants to know users")
	public void thatCesarWantsToKnowUsers() {
	    given().contentType("application/json");
	}

	@When("he gets the list of users")
	public void heGetsTheListOfUsers() {
		Response resp = when().get("https://gorest.co.in/public-api/users?access-token=CuoUKcd-kXG440G_Yt5Todi8dEo6JrR01dIG");
		respJson = resp.asString();
	}

	@Then("he should see the information of every user.")
	public void heShouldSeeTheInformationOfEveryUser() {
		System.out.println(respJson);
		
	   
		
	}


}
