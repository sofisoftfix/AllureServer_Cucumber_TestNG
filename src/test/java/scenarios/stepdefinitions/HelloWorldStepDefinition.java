package scenarios.stepdefinitions;

/**
 * @user bizadmin
 */
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HelloWorldStepDefinition {

    private String helloWorld;

    @When("I say hello to the world")
    public void i_say_hello_to_the_world() {
        helloWorld = "Hello World";
    }

    @Then("I should see {string}")
    public void i_should_see(String string) {

    }

}
