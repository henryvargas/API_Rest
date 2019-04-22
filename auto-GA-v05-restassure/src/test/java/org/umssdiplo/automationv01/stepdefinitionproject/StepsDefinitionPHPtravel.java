package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Adidas.AdidasHeader;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.Adidas.AdidasHeaderPage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private AdidasHeader adidas;

    @Given("^'Addidas' page is loaded$")
    public void addidasPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^En la columna  Tennis ir al link de Futbol del sub-menu$")
    public void enLaColumnaTennisIrAlLinkDeFutbolDelSubMenu() throws Throwable {
         adidas= AdidasHeaderPage.loginPage();

    }
}
