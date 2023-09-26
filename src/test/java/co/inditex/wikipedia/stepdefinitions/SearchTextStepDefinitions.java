package java.co.inditex.wikipedia.stepdefinitions;

import java.co.inditex.wikipedia.exceptions.UpdateInfoError;
import java.co.inditex.wikipedia.questions.Counted;
import java.co.inditex.wikipedia.tasks.EnterText;
import java.co.inditex.wikipedia.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static java.co.inditex.wikipedia.utils.Constants.COUNTED_ERROR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class WriteTextStepDefinitions {

    @Given("I log in the page")
    public void iLogInThePage() {
        theActorInTheSpotlight().wasAbleTo(
                Open.url(Constants.URL)
        );
    }
    @Then("^I see the (.*)$")
    public void ISeeTheMessage(String message) {
        theActorInTheSpotlight().should(seeThat(Counted.error(),equalTo(message))
                .orComplainWith(UpdateInfoError.class,COUNTED_ERROR));
    }

    @When("^he enters the text (.*)$")
    public void heEntersTheTextQaAutomation(String text) {
        theActorInTheSpotlight().attemptsTo(EnterText.information(text));
    }
}
