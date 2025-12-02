package HooksPackage;

import Pages.CheckboxPage;
import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setup(){
        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
    }




    @After
    public void tearDown(){
        driver.quit();
    }
}
