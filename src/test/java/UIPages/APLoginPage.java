package UIPages;

import net.thucydides.core.annotations.Step;

public class APLoginPage {

    LoginPage loginPage;
    @Step
    public void openApplication(){

        loginPage.open();

    }
    @Step
    public void enterUsername(String uname){

        loginPage.enterUname(uname);


    }
    @Step
    public void enterPassword(String pwd){
        loginPage.enterPassword(pwd);

    }
    @Step
    public void clickOnSiginButton(){
        loginPage.clickSiginbutton();

    }
    @Step
    public void verifyuserabletologin(){
        loginPage.accountPageIsVisible();
    }


}
