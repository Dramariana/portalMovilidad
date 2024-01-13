package com.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class multasStepdefinition {

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver hisBrowser;
    private final Actor user = Actor.named("Mariana");
    @Before
    public void prepareStage() {
        user.can(BrowseTheWeb.with(hisBrowser));
        //hisBrowser.manage().window().maximize();
    }
    @Given("Ingresa al portal de movilidad con un usuario existente")
    public void ingresaAlPortalDeMovilidadConUnUsuarioExistente() {
    }
    @When("ingresa al portal")
    public void ingresaAlPortal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("consulta el numero de {}")
    public void consultaElNumeroDe(String arg0) {
    }
    @Then("se muestra el resultado de la consulta")
    public void seMuestraElResultadoDeLaConsulta() {

    }



}
