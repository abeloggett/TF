package com.icaro.tests.stepDefinitions;

import AutomationPractice.HomePage;
import AutomationPractice.LoginPage;
import AutomationPractice.MyAccountPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class logindefinitions1 {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    @Before
    public void setUp() {
        homePage = new HomePage(com.icaro.tests.hooks.Hooks.getDriver());
        loginPage = new LoginPage(com.icaro.tests.hooks.Hooks.getDriver());
        myAccountPage = new MyAccountPage(com.icaro.tests.hooks.Hooks.getDriver());
    }

    @Dado("que el usuario accede al login de la pagina")
    public void queElUsuarioAccedeAlLoginDeLaPagina() {
        homePage.accesoLoginEsVisible();
    }

    @Cuando("ingresa credenciales validas")
    public void ingresaCredencialesValidas() {
        loginPage.login("santiago@hotmail.com", "123456");
    }

    @Entonces("el usuario ingreso a su cuenta")
    public void elUsuarioIngresoASuCuenta() {
        myAccountPage.validarLogIn();
    }
}