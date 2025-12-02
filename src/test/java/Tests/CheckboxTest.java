package Tests;

import BaseTest.BaseTestClass;
import Pages.CheckboxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTestClass {

    @Test
    public void verifyCheckboxOneIsSelected(){

        checkboxPage=homePage.clickCheckboxLink();
        checkboxPage.clickOnCheckboxOne();
        Assert.assertTrue(checkboxPage.checkboxOneIsSelected());

    }

    @Test
    public void verifyCheckboxTwoIsSelectedByDefault(){
        checkboxPage = homePage.clickCheckboxLink();
        Assert.assertTrue(checkboxPage.checkboxTwoIsSelected());

    }


    @Test
    public void ensureCheckboxPageFunctionality(){
        checkboxPage = homePage.clickCheckboxLink();
        Assert.assertFalse(checkboxPage.checkboxOneIsSelected());
        checkboxPage.clickOnCheckboxOne();
        Assert.assertTrue(checkboxPage.checkboxOneIsSelected());


        Assert.assertTrue(checkboxPage.checkboxTwoIsSelected());
        checkboxPage.clickOnCheckboxTwo();
        Assert.assertFalse(checkboxPage.checkboxTwoIsSelected());
    }

}
