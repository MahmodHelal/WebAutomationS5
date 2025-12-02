package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthPage {
    WebDriver driver;

    public FormAuthPage(WebDriver driver){
        this.driver = driver;
    }

//     WebElement usernameTextbox = driver.findElement(By.id("username"));
    By usernameTextboxLocator = By.id("username");
//     WebElement passwordTextbox = driver.findElement(By.id("password"));
     By passwordTextboxLocator = By.id("password");
//     WebElement loginButton = driver.findElement(By.className("radius"));
     By loginButtonLocator = By.className("radius");
     String expectedUsernameFailedMsg = "Your username is invalid!";
     String expectedPasswordFailedMsg = "Your password is invalid!";
//     String actualErrorMsg = driver.findElement(By.id("flash")).getText();
     By actualErrorMsgLocator = By.id("flash");

     public void setUsername(String username){
         driver.findElement(usernameTextboxLocator).sendKeys(username);
     }
     public void setPassword(String password){
         driver.findElement(passwordTextboxLocator).sendKeys(password);
     }
     public void  clickOnLoginButton(){
         driver.findElement(loginButtonLocator).click();
     }


     public  String getExpectedUsernameFailedMsg(){
         return expectedUsernameFailedMsg;
     }

     public String getExpectedPasswordFailedMsg(){
         return expectedPasswordFailedMsg;
     }

     public String getActualErrorMsg(){
         return driver.findElement(actualErrorMsgLocator).getText();
     }


}
