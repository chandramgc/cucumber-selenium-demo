package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("LoginSteps.user_is_on_login_page");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("LoginSteps.user_enters_username_and_password");
    }
    @And("user clicks on login")
    public void user_clicks_on_login() {
        System.out.println("LoginSteps.user_clicks_on_login");
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("LoginSteps.user_is_navigated_to_the_home_page");
    }
}
