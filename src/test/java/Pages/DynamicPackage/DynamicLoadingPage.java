package Pages.DynamicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;

    By exampleOneLocator = By.linkText("Example 1: Element on page that is hidden");
    By exampleTwoLocator = By.partialLinkText("Example 2:");


    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }


    public ExampleOnePage clickExampleOne(){
        driver.findElement(exampleOneLocator).click();
        return new ExampleOnePage(driver);
    }

    public ExampleTwoPage clickExampleTwo(){
        driver.findElement(exampleTwoLocator).click();
        return new ExampleTwoPage(driver);
    }
}
