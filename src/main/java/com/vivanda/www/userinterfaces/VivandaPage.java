// Esta clase mapea algunos controles una vez el navegador abre la página

package com.vivanda.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class VivandaPage {
	
public static final Target SEARCH = Target.the("Search").locatedBy("//*[@id=\"sticky-wrapper\"]/div/div[1]/div/div/div[4]/form/input");
public static final Target SEARCH_BUTTON = Target.the("Search_button").locatedBy("//*[@id=\"sticky-wrapper\"]/div/div[1]/div/div/div[4]/form/button");
public static final Target ORDEN = Target.the("Busqueda").locatedBy("//*[@id=\"coleccion\"]/section[2]/div/article/div/div/div[1]/fieldset/label");




}
