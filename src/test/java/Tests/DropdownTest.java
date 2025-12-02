package Tests;

import BaseTest.BaseTestClass;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTestClass {
    @Test
    public void verifyDropdownOption1(){
        dropdownPage = homePage.clickDropdownLink();
        dropdownPage.clickOnOption1();
    }

    @Test
    public void verifyDropdownOption2(){
        dropdownPage = homePage.clickDropdownLink();

        dropdownPage.clickOnOption2();

    }

    // assignment for dropdown s5 deadline next sunday
    /*
    * 1- try with value
    * 2- try with index
    * 3- after select ensure that selected option is selected "bonus"
    * */
}
