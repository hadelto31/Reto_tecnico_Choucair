package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterface.EnterRegister;
import userinterface.HomePageUtest;

public class reto_tecnicoStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver  navegador;
    private Actor actor = Actor.named("Harold");
    private HomePageUtest homePageUtest = new HomePageUtest();

    @Given("^than Harold wants to register in utest$")
    public void thanHaroldWantsToRegisterInUtest() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePageUtest));
       // actor.attemptsTo(Click.on(EnterRegister.JOIN_TODAY));

    }


    @When("^he performs the steps to register on the utest page$")
    public void hePerformsTheStepsToRegisterOnTheUtestPage() {

    }

    @Then("^he has access to the utest platform$")
    public void heHasAccessToTheUtestPlatform() {

    }

}
