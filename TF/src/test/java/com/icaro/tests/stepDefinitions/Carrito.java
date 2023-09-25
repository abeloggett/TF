package com.icaro.tests.stepDefinitions;

import AutomationPractice.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.icaro.tests.hooks.Hooks.getDriver;

public class Carrito {
    HomePage homePage = new HomePage(getDriver());
    LoginPage loginPage = new LoginPage(getDriver());
    CamaraPage camaraPage = new CamaraPage(getDriver());
    CarritoPage carritoPage = new CarritoPage(getDriver());
    MyAccountPage myaccountpage =new MyAccountPage(getDriver());

    @Dado("el usuario ingreso a su cuenta")
    public void elUsuarioIngresoAsuCuenta(){
       myaccountpage.validarLogIn();
    }
    @Cuando("agrega un producto al carrito")
    public void agregaUnProductoAlCarrito() {
        camaraPage.agregarAlCarrito();
    }

    @Entonces("producto agregado al carrito")
    public void productoAgregadoAlCarrito() {
        carritoPage.carritoEsVisible();
    }
}
