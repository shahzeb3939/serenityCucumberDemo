package net.serenity.demo.steps.dvsum;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenity.dvsum.steps.EditView;
import net.serenity.dvsum.steps.Login;
import net.serenity.dvsum.steps.Start;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditViewSteps {

    Actor checo = new Actor("Checo");

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void checoCanBrowserTheWeb(){
        checo.can(BrowseTheWeb.with(hisBrowser));
        checo.wasAbleTo(Login.withValidCredentials());
    }

    @Given("User is on Column Dictionary Page on DvSum App")
    public void givenMethodForEditViewStep(){
        givenThat(checo).wasAbleTo(Start.onColumnDictionaryPage());
    }

    @When("User edits a view")
    public void whenMethodForEditViewStep(){
//        when(checo).attemptsTo(EditView.named("testView"));
    }

    @Then("View should be updated with edited details")
    public void thenMethodForEditViewStep(){
    }

}
