package UIPages;

import net.thucydides.core.annotations.Step;

public class APContacutUsPage {

    ContactUsPage contactuspage;
    LoginPage loginPage;

    @Step
    public void clickoncontactuslink(){

        loginPage.goToContactsUsPage();

    }
    @Step
    public void fillcontactuspagedetails(){

        contactuspage.fillContactsUsPage();

    }
}
