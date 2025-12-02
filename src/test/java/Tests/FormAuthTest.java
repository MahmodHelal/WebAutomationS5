package Tests;

import BaseTest.BaseTestClass;
import Pages.FormAuthPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FormAuthTest extends BaseTestClass {

    @DataProvider(name = "loginData")
    public Object[][] provideData(){
        return new Object[][]{
                {"tomsmith","SuperSecretPassword!","valid"},
                {"tomsmith","Invalid","invalid"},
                {"Invalid","SuperSecretPassword!","invalid"},
                {"Invalid","Invalid","invalid"}
        };

    }


    @Test(dataProvider = "loginData")
    public void verifyLoginFuncWithValidCredentials(String username, String password,String verification){
        formAuthPage = homePage.clickFormLink(); // new FormAuthPage(driver);
        formAuthPage.setUsername(username);
        formAuthPage.setPassword(password);
        formAuthPage.clickOnLoginButton();

        if (verification.equals("valid")){
            System.out.println("logged in");
        }else {
            Assert.assertTrue(formAuthPage.getActualErrorMsg().contains("invalid!"));
        }



    }
}
