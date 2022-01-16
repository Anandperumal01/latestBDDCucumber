package starter.stepdefinitions;

import UIPages.APContacutUsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class Contactus {
    @Steps
    APContacutUsPage apcontactuspage;

    @Then("click on Contactus link")
    public void click_on_Contactus_Link() {
        apcontactuspage.clickoncontactuslink();


    }

    @Then("fill ContactsUs Page details")
    public void fill_Contact_Page_details() {
        apcontactuspage.fillcontactuspagedetails();


    }
}
