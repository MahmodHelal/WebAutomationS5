package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage {
    WebDriver driver;

    By addButtonLocator = By.xpath("//button[@onclick=\"addElement()\"]");
    public AddRemovePage(WebDriver driver){
        this.driver = driver;
    }
}

//+ addelement
// clickadd(5)
// click delet(6)
//exception error