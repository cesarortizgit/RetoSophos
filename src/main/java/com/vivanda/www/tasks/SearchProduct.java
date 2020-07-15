package com.vivanda.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.vivanda.www.userinterfaces.AddProductToShoppingCartPage;
import com.vivanda.www.userinterfaces.VivandaPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SearchProduct implements Task{

	
	  
	 
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("beer").into(VivandaPage.SEARCH),
				Click.on(VivandaPage.SEARCH_BUTTON));
		
		
		

	}

	public static SearchProduct theApp() {
		return instrumented(SearchProduct.class);
	}
}