package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    WebDriver driver;
    By dropdownLocator = By.id("dropdown");
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnOption1(){
        WebElement dropdownElement = driver.findElement(dropdownLocator);
        Select select = new Select(dropdownElement);
        select.selectByVisibleText("Option 1");

    }

    public void clickOnOption2(){
        WebElement dropdownElement = driver.findElement(dropdownLocator);
        Select select = new Select(dropdownElement);
        select.selectByVisibleText("Option 2");

    }

}
