// Esta clase contine los pasos de ejecución del proyecto

package com.vivanda.www.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.vivanda.www.tasks.AddProductToShoppingCart;
import com.vivanda.www.tasks.OpenTheBrowser;
import com.vivanda.www.tasks.SearchProduct;
import com.vivanda.www.userinterfaces.VivandaHomePage;
import com.vivanda.www.userinterfaces.VivandaPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ShopAProductStepDefinitions {
	
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser; 
	
	private Actor cesar = Actor.named("Cesar");
	
	private VivandaHomePage vivandaHomePage;
	
	private VivandaPage vivandaPage;

	
	@Before
	public void setUp() {
		cesar.can(BrowseTheWeb.with(hisBrowser)); 
	}
	
	@Given("^That cesar wants to shop a product$")
	public void thatCesarWantsToShopAProduct() throws Exception {
		
		cesar.wasAbleTo(OpenTheBrowser.on(vivandaHomePage));
	    
	   
	}


	@When("^he adds the beer to shop car$")
	public void heAddsTheBeerToShopCar() throws Exception {
		
		cesar.wasAbleTo(SearchProduct.theApp(),
				AddProductToShoppingCart.theApp());

	    
	}

	@Then("^he should see the purchased product in the screen\\.$")
	public void heShouldSeeThePurchasedProductInTheScreen() throws Exception {

}

	
}
