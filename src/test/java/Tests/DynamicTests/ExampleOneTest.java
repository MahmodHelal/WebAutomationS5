package Tests.DynamicTests;

import BaseTest.BaseTestClass;
import Pages.DynamicPackage.ExampleOnePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleOneTest extends BaseTestClass {
    ExampleOnePage exampleOnePage;

    @Test
    public void validateExampleOnePage()  {
        System.out.println("Run Example One");
        dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        exampleOnePage =dynamicLoadingPage.clickExampleOne();
        exampleOnePage.clickStartButton();
        Assert.assertEquals(exampleOnePage.getActualResultText(), exampleOnePage.getExpectedResultText(), "Actual Result Text is not matched with Expected Result Text From Example One ");
        System.out.println(" Finish Example One");
    }
}
