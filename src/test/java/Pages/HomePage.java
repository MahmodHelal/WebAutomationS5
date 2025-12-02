package Pages;

import Pages.DynamicPackage.DynamicLoadingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class HomePage {
    WebDriver driver;
//    WebElement formLink = driver.findElement(By.linkText("Form Authentication"));

    By formLinkLocator = By.linkText("Form Authentication");

    By checkboxLocator = By.linkText("Checkboxes");

    By dropdownLocator = By.linkText("Dropdown");

    By addRemoveLocator =By.linkText("Add/Remove Elements");

    By dynamicLoadingLocator = By.linkText("Dynamic Loading");

    By alertsLocator = By.linkText("JavaScript Alerts");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public FormAuthPage clickFormLink(){
        driver.findElement(formLinkLocator).click();
        return  new FormAuthPage(driver);
    }

    public CheckboxPage clickCheckboxLink(){
        driver.findElement(checkboxLocator).click();
        return  new CheckboxPage(driver);
    }

    public DropdownPage clickDropdownLink(){
        driver.findElement(dropdownLocator).click();
        return  new DropdownPage(driver);
    }

    public AddRemovePage clickAddRemoveLink(){
        driver.findElement(addRemoveLocator).click();
        return  new AddRemovePage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        driver.findElement(dynamicLoadingLocator).click();
        return  new DynamicLoadingPage(driver);
    }


    public AlertsPage clickOnAlertsLink(){
        driver.findElement(alertsLocator).click();
        return  new AlertsPage(driver);
    }



}


// Write Valid Test Case For Form Authentication by POM Design Pattern
// 1-Create HomePage Class
// 2-Create FormAuthPage Class
// 3-Create BaseTestClass
// 4-Create FormAuthTest Class
// 5-Write Valid Test Case
// 6-Run the Test Case
// 7-Verify the Test Case




// FormAuthPage formAuthPage = new FormAuthPage();