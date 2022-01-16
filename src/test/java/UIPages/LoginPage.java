package UIPages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

//@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {

    public void enterUname(String Uname){
       // $("#email").sendKeys("Automationjan2022@gmail.com");
        $("#email").sendKeys(Uname);
    }

    public void enterPassword(String pwd){
        $("#passwd").sendKeys(pwd);

    }

    public void clickSiginbutton(){
        $("#SubmitLogin").click();

    }

    public String accountPageIsVisible()  {

        return $("div#center_column h1").getText();

    }

    public void goToContactsUsPage(){
        $(By.linkText("Contact us")).click();
    }


}
