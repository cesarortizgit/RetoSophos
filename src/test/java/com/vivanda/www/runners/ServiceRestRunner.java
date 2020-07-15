//Esta clase es el runner que ejecuta el api usando rest assured
package com.vivanda.www.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/servicerestapi.feature",
		glue = "com.vivanda.www.stepdefinitions",
		snippets = SnippetType.CAMELCASE
)
public class ServiceRestRunner {

}
