package co.com.utest.stepdefinitions;

import co.com.utest.model.UserData;
import co.com.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import static co.com.utest.questions.Answer.*;
import static co.com.utest.tasks.OpenUp.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CertificationStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^Luis will register on the Utest page$")
    public void luisWillRegisterOnTheUtestPage() {
        theActorCalled("Luis").attemptsTo(thePage());

    }
    @When("^He completes the form on the page$")
    public void heCompletesTheFormOnThePage(List<UserData> userData) {
        theActorInTheSpotlight().attemptsTo(
                RegisterUserPage.withData(userData.get(0)),
                RegisterAddress.withData(userData.get(0)),
                RegisterDevice.withData(userData.get(0)),
                CreatePassword.withData(userData.get(0))
        );
    }
    @Then("^He verifies the record with the message (.*)$")
    public void HeVerifiesTheRecordWithTheMessage(String message) {
        theActorInTheSpotlight().should(seeThat(toThe(message)));
    }
}
