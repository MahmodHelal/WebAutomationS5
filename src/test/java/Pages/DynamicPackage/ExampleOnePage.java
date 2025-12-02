package Pages.DynamicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleOnePage {
    WebDriver driver;

    By startButtonLocator = By.cssSelector("#start button");
    By resultTextLocator = By.cssSelector("#finish h4");
    String expectedResultText = "Hello World!";
    WebDriverWait wait;

    public ExampleOnePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void clickStartButton(){

        wait.until(ExpectedConditions.elementToBeClickable(startButtonLocator)).click();

    }


    public String getActualResultText(){

        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(resultTextLocator))).getText();


//        return wait.until(ExpectedConditions.presenceOfElementLocated(resultTextLocator)).getText();

    }

    public String getExpectedResultText(){
        return expectedResultText;
    }
}
