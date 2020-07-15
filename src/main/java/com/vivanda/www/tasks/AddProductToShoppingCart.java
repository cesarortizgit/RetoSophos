package com.vivanda.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.vivanda.www.userinterfaces.AddProductToShoppingCartPage;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class AddProductToShoppingCart implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		actor.attemptsTo(Click.on(AddProductToShoppingCartPage.ADD_BUTTON));
		
		actor.attemptsTo(Click.on(AddProductToShoppingCartPage.TYPE_DELIVER),
				Click.on(AddProductToShoppingCartPage.DISTRITO),
				Click.on(AddProductToShoppingCartPage.CONTINUAR));
		
	}
	
	public static SearchProduct theApp() {
		return instrumented(SearchProduct.class);
	}

}
