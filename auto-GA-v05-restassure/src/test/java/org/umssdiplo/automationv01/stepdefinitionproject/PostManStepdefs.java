package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.customrestassure.HandleRequest;

import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * @autor Marcelo Garay
 */
public class PostManStepdefs {
    private Response response;
    private Response response1;

    @Given("^GET \"([^\"]*)\" postman endpoint is configured$")
    public void getPostmanEndpointIsConfigured(String headerEndpoint) throws Throwable {
        response = HandleRequest.get(headerEndpoint);
    }

    @Then("^the status code should be (\\d+)$")
    public void theStatusCodeShouldBe(int statusCode) throws Throwable {
       assertEquals(response.getStatusCode(), statusCode);
    }

    @Given("^POST \"([^\"]*)\" postman endpoint is configured with \"([^\"]*)\"$")
    public void postPostmanEndpointIsConfiguredWith(String bodyEndPoint, String data) throws Throwable {
        response=HandleRequest.post(bodyEndPoint,data);
    }
    @Then("^the responde 'data' value is \"([^\"]*)\"$")
    public void theRespondeDataValueIs(String esperado) throws Throwable {
        boolean actual = response.getBody().print().contains(esperado);
        Assert.assertTrue(actual, "diplomado testing existe en body  de la respuesta");
    }

    @And("^the status code post should be (\\d+)$")
    public void theStatusCodePostShouldBe(int statusCode1) {

        assertEquals(response.getStatusCode(), statusCode1);
    }

}
