package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    By jsAlertLocator = By.cssSelector("button[onclick='jsAlert()']");
    By jsConfirmLocator = By.xpath("//button[@onclick='jsConfirm()']");
    By jsPromptLocator = By.xpath("//button[text()='Click for JS Prompt']");
    By resultLocator = By.cssSelector("#result");
    String expectedAlertText = "I am a Helal Alert";
    String expectedConfirmText = "I am a JS Confirm";
    String expectedPromptText = "I am a JS prompt";
    String expectedAlertResult = "You successfully clicked an alert";
    String expectedCancelResult = "You clicked: Cancel";



    public AlertsPage(WebDriver driver){
        this.driver = driver;

    }
    public void clickJsAlert(){
        driver.findElement(jsAlertLocator).click();
    }

    public void clickJsConfirm(){
        driver.findElement(jsConfirmLocator).click();
    }

    public void clickJsPrompt(){
        driver.findElement(jsPromptLocator).click();
    }

    public String getActualResultText(){
        return driver.findElement(resultLocator).getText();
    }
    public String getActualTextOfAlert(){
        return switchToAlert().getText();
    }


    private Alert switchToAlert(){
        return driver.switchTo().alert();
    }


    public void acceptAlert(){
        switchToAlert().accept();
    }

    public void dismissAlert(){
        switchToAlert().dismiss();
    }

    public void sendKeysToAlert(String text){
        switchToAlert().sendKeys(text);
    }



    public String getExpectedCancelResult() {
        return expectedCancelResult;
    }

    public String getExpectedAlertResult() {
        return expectedAlertResult;
    }

    public String getExpectedPromptText() {
        return expectedPromptText;
    }

    public String getExpectedConfirmText() {
        return expectedConfirmText;
    }

    public String getExpectedAlertText() {
        return expectedAlertText;
    }



}
