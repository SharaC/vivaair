package step_definitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.LowCost;
import tasks.AbrirVivaAirPage;
import tasks.SeleccionarCaracteristicas;
import tasks.SeleccionarPorPrecio;
import userinterfaces.VivaAirHome;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SeleccionarVueloStepDefinitions {

    Actor actorShara = Actor.named("actorShara");
    private VivaAirHome mainPage;

    @Managed(driver = "chrome")
    public WebDriver driver;
    @Before
    public void SheCanDriver(){actorShara.can(BrowseTheWeb.with(driver));}

    @Given("^abro la pagina de viva air$")
    public void abroLaPaginaDeVivaAir() {

        actorShara.wasAbleTo(AbrirVivaAirPage.on(mainPage));
    }
    @When("^hago una seleccion de vuelos con los parametros$")
    public void hagoUnaSeleccionDeVuelosConLosParametros() {

        actorShara.attemptsTo(SeleccionarCaracteristicas.at("med", "bog"));

    }
    @Then("^verifico que se ha seleccionado el vuelo$")
    public void verificoQueSeHaSeleccionadoElVuelo() {
            actorShara.should(seeThat(LowCost.on()));
    }


}
