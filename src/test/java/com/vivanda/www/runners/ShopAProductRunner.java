//esta clase es el runner que llama a la clase que tiene los pasos para ejecutar la aplicación vivanda.
package com.vivanda.www.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/shop_a_product.feature",
		glue = "com.vivanda.www.stepdefinitions",
		snippets = SnippetType.CAMELCASE
)


public class ShopAProductRunner {

}
