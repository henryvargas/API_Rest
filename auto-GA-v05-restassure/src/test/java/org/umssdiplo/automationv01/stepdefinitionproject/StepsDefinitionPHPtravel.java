package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Adidas.AdidasHeader;
import org.umssdiplo.automationv01.core.utils.Adidas.AdidasHeaderPage;


public class StepsDefinitionPHPtravel {
    private AdidasHeader adidas;
    private String priceShoe;

    @Given("^'Addidas' page is loaded$")
    public void addidasPageIsLoaded() throws Throwable {
        adidas=AdidasHeaderPage.loginPage();
    }

    @And("^Ir al subMenu de Futbol de la columna Tennis$")
    public void irAlSubMenuDeFutbolDeLaColumnaTennis() throws Throwable {
        adidas.obtenerPrecioProducto();

    }

    @And("^get price for 'Calzado de Fútbol X' on 'futbol' catalog$")
    public void getPriceForCalzadoDeFútbolXOnFutbolCatalog() throws Throwable {
         priceShoe = adidas.getPriceShoe();
    }


    @When("^select size \"([^\"]*)\" on 'Calzado' page$")
    public void selectSizeOnCalzadoPage() throws Throwable {
       adidas.selectSize();
    }

    @And("^click 'añadir al carrito' button$")
    public void clickAñadirAlCarritoButton() throws Throwable {
        adidas.clickCarritoBtn();
    }

    @Then("^Verify that VIEW SHOOPING BAG is ONE \"([^\"]*)\"$")
    public void verifyThatVIEWSHOOPINGBAGIsONE(String cantEsperado) throws Throwable {
        String actual = adidas.verifyQuantity();
        Assert.assertEquals(actual, cantEsperado, "La cantidad es diferente de 1");
    }

    @When("^click 'ver carrito' link on VIEW SHOOPING BAG$")
    public void clickVerCarritoLinkOnVIEWSHOOPINGBAG() throws Throwable {
        adidas.clickVerCarrito();
    }

    @Then("^Verify \"([^\"]*)\" title is displayed on 'tu carrito' page$")
    public void verifyTitleIsDisplayedOnTuCarritoPage(String tituloEsperado) throws Throwable {
        String tituloActual = adidas.getTitle();
        Assert.assertEquals(tituloActual, tituloEsperado.toUpperCase(), "El titulo no es el esperado");

    }

    @When("^Quantity should be \"([^\"]*)\" on 'tu carrito' page$")
    public void quantityShouldBeOnTuCarritoPage(String cantEsperada) throws Throwable {
        String cantActual = adidas.getCantidad();
        Assert.assertEquals(cantActual, cantEsperada, "La cantidad es mayor a 1");

    }

    @Then("^Price should be \"([^\"]*)\"$")
    public void priceShouldBe(String priceEsperado) throws Throwable {
        String priceActual = adidas.getPriceFinal();
        Assert.assertEquals(priceActual, priceEsperado, "Los precios son diferentes");

    }

    @And("^Total should be \"([^\"]*)\"$")
    public void totalShouldBe(String totalEsperado) throws Throwable {
        String totalActual = adidas.getTotalPrice();
        Assert.assertEquals(totalActual, totalEsperado, "Los precios totales son diferentes");

    }
}
