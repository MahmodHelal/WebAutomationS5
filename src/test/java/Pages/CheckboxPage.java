package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {
    WebDriver driver;
    By checkboxOneLocator = By.xpath("//input[@type='checkbox'][1]");
    By checkboxTwoLocator = By.xpath("//input[@type='checkbox'][2]");
    public CheckboxPage(WebDriver driver){
        this.driver = driver;
    }


    public void clickOnCheckboxOne(){
        driver.findElement(checkboxOneLocator).click();
    }

    public void clickOnCheckboxTwo(){
        driver.findElement(checkboxTwoLocator).click();
    }


    public  boolean checkboxOneIsSelected(){
        return driver.findElement(checkboxOneLocator).isSelected();
    }

    public boolean checkboxTwoIsSelected(){
        return driver.findElement(checkboxTwoLocator).isSelected();
    }

}
