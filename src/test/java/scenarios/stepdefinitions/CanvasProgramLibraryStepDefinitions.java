package scenarios.stepdefinitions;

/**
 * @user bizadmin
 */

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.testng.Assert.*;


import org.testng.annotations.Test;

public class CanvasProgramLibraryStepDefinitions {

    @Given("^I am on the Program Library page$")
    public void i_am_on_the_Program_Library_page() {

        System.out.println("1. i_am_on_the_Program_Library_page");
     }

    @Then("^I see program library page is launched$")
    public void i_see_program_library_page_is_launched() {
        System.out.println("2. i_see_program_library_page_is_launched");
    }

    @When("I tap on {string} listed in program library page")
    public void i_tap_on_listed_in_program_library_page(String string) {
        System.out.println("3. i_tap_on_listed_in_program_library_page");
    }

    @Then("I see canvas program and build section of the {string} program")
    public void i_see_canvas_program_and_build_section_of_the_program(String string) {
        System.out.println("4. i_see_canvas_program_and_build_section_of_the_program");
    }
}

