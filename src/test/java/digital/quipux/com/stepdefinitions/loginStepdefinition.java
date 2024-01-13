package com.stepdefinitions;

import digital.quipux.com.userinterfaces.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class loginStepdefinition {

    LoginPage loginPage;
    @Managed(uniqueSession = true)
    public WebDriver driver;
    private final Actor user = Actor.named("Mariana");

    @Before
    public void prepareStage() throws IOException {
        OnStage.setTheStage(new OnlineCast());
        user.can(BrowseTheWeb.with(driver));
        //driver.manage().window().maximize();
    }


    @Given("el usuario ingresa al portal de movilidad")
    public void elUsuarioIngresaAlPortalDeMovilidad() {
      user.wasAbleTo(Open.browserOn().the(loginPage));
        throw new io.cucumber.java.PendingException();
    }

    @Given("selecciona registrarse")
    public void seleccionaRegistrarse() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("visualiza el formulario de registro")
    public void visualizaElFormularioDeRegistro() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("ingresa los datos necesarios")
    public void ingresaLosDatosNecesarios() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("el registro es exitoso")
    public void elRegistroEsExitoso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("ingresa los datos de un usuario existente")
    public void ingresaLosDatosDeUnUsuarioExistente() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("el ingreso es exitoso")
    public void elIngresoEsExitoso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
