// Esta clase mapea algunos controles en la compra del producto

package com.vivanda.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AddProductToShoppingCartPage {

public static final Target ADD_BUTTON = Target.the("Addbutton").locatedBy("//*[@id=\"7000\"]/a");
public static final Target TYPE_DELIVER = Target.the("Typedeliver").locatedBy("/html/body/div[6]/div/div[2]/div[2]/div/button[1]/img[1]");
public static final Target DISTRITO = Target.the("Distrito").locatedBy("//*[@id=\"Select_tienda_Sales\"]/select");
public static final Target CONTINUAR = Target.the("Continuar").locatedBy("/html/body/div[6]/div/div[3]/div[2]/div[4]/button");


}
