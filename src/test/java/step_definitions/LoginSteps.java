package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.Driver;

public class LoginSteps {


    @Given("user on the login page")
    public void user_on_the_login_page() {

        Driver.getDriver().get("https://facebook.com");
        LoginPage loginPage = new LoginPage();

        loginPage.createNewAccount.click();


    }
    @Given("user signs in")
    public void user_signs_in() {
    }
    @Then("user validates")
    public void user_validates() {

    }
}
