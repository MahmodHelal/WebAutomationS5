package BaseTest;

import Pages.*;
import Pages.DynamicPackage.DynamicLoadingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTestClass {
    WebDriver driver;
    protected HomePage homePage;
    protected FormAuthPage formAuthPage;
    protected CheckboxPage checkboxPage;
    protected DropdownPage dropdownPage;
    protected DynamicLoadingPage dynamicLoadingPage;
    protected AlertsPage alertsPage;


    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        checkboxPage = new CheckboxPage(driver);
    }

    @BeforeMethod
    public void goToHomePage(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
