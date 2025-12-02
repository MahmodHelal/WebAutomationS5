package StepDifinitions;

import HooksPackage.Hooks;
import Pages.FormAuthPage;
import Pages.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Login_StepDef {

    HomePage homePage;
    FormAuthPage formAuthPage;


    @Given("User in LoginPage")
    public void User_in_LoginPage(){
         homePage = new HomePage(Hooks.driver);
        formAuthPage =homePage.clickFormLink();

    }

    @When("User entr Valid Credentials and click login button")
    public void User_entr_Valid_Credentials_and_click_login_button(){

        formAuthPage.setUsername("tomsmith");
        formAuthPage.setPassword("SuperSecretPassword!");
        formAuthPage.clickOnLoginButton();


    }

    @Then("User redirected to secure area page")
    public void userRedirectedToSecureAreaPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");


    }

    @When("User entr invalid Credentials and click login button")
    public void userEntrInvalidCredentialsAndClickLoginButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("error message wiil display")
    public void errorMessageWiilDisplay() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
