package org.sofka.page;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardPage {

    public static final Target CATEGORY_BY_NAME = Target.the("Categoría por nombre")
            .locatedBy("//a[@class='list-group-item' and normalize-space()='{0}']");

    public static final Target PRODUCT_BY_ID =
            Target.the("Producto por ID")
                    .locatedBy("//a[@href='prod.html?idp_={0}']");

    public static final Target SAMSUNG_GALAXY_6 = Target.the("PRODUCTO Samsung galaxy s6")
            .locatedBy("a[href='prod.html?idp_=1']");

    public static final Target SAMSUNG_GALAXY_7 = Target.the("PRODUCTO Samsung galaxy s7")
            .locatedBy("a[href='prod.html?idp_=4']");

    public static final Target MACBOOK_AIR = Target.the("PRODUCTO MacBook air")
            .locatedBy("a[href='prod.html?idp_=11']");

    public static final Target ADD_TO_CART_BUTTON = Target.the("BOTÓN DE AÑADIR PRODUCTO AL CARRITO DE COMPRAS")
            .locatedBy("[data-test='shopping-cart-link']");

    public static final Target CART_BUTTON = Target.the("BOTÓN DEL CARRITO DE COMPRAS")
            .locatedBy("//a[@href='cart.html']");
}
