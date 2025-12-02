package Tests.DynamicTests;

import BaseTest.BaseTestClass;
import Pages.DynamicPackage.ExampleOnePage;
import Pages.DynamicPackage.ExampleTwoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTwoTest extends BaseTestClass {
    ExampleTwoPage exampleTwoPage;

    @Test
    public void validateExampleTwoPage() {
        System.out.println("Run Example Two");
        dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        exampleTwoPage =dynamicLoadingPage.clickExampleTwo();
        exampleTwoPage.clickStartButton();
        Assert.assertEquals(exampleTwoPage.getActualResultText(), exampleTwoPage.getExpectedResultText(), "Actual Result Text is not matched with Expected Result Text From Example Two ");
        System.out.println("Finish Example wo");
    }
}
