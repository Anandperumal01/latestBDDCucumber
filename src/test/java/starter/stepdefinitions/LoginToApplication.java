package starter.stepdefinitions;

import UIPages.APLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginToApplication {
    @Steps
    APLoginPage aploginpage;

    @Given("Enter the application url")
    public void enter_the_application_url() {
        aploginpage.openApplication();


    }
    @When("User enter user name as {string}")
    public void user_enter_user_name_as(String uname) {

        aploginpage.enterUsername(uname);


    }
    @When("User enter password as {string}")
    public void user_enter_password_as(String pwd) {
        aploginpage.enterPassword(pwd);

    }
    @Then("click on sigin in button")
    public void click_on_sigin_in_button() {

        aploginpage.clickOnSiginButton();

    }
    @Then("user should be able to login successfully")
    public void user_should_be_able_to_login_successfully() {
        aploginpage.verifyuserabletologin();



    }


}
