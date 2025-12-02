package Tests;

import BaseTest.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertsTest extends BaseTestClass {


    @Test
    public void verifyJsAlert() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        alertsPage=homePage.clickOnAlertsLink();
        alertsPage.clickJsAlert();

        String actualAlertText =alertsPage.getActualTextOfAlert();

        softAssert.assertEquals(actualAlertText,alertsPage.getExpectedAlertText());
//        Assert.assertEquals(actualAlertText,alertsPage.getExpectedAlertText());
        alertsPage.acceptAlert();

        String actualResulText = alertsPage.getActualResultText();
        Assert.assertEquals(actualResulText,alertsPage.getExpectedAlertResult());
        System.out.println("Run all");

        softAssert.assertAll();
    }

    @Test
    public void verifyJsConfirm() throws InterruptedException {
        alertsPage = homePage.clickOnAlertsLink();
        alertsPage.clickJsConfirm();
        Thread.sleep(2000);
        String actualAlertText =alertsPage.getActualTextOfAlert();
        Assert.assertEquals(actualAlertText,alertsPage.getExpectedConfirmText());
        alertsPage.dismissAlert();
        Thread.sleep(2000);
        String actualResulText = alertsPage.getActualResultText();
        Assert.assertEquals(actualResulText,alertsPage.getExpectedCancelResult());
    }
    @Test
    public void verifyJsPrompt() throws InterruptedException {
        alertsPage = homePage.clickOnAlertsLink();
        alertsPage.clickJsPrompt();
        Thread.sleep(2000);
        Assert.assertEquals(alertsPage.getActualTextOfAlert(),alertsPage.getExpectedPromptText());
        alertsPage.sendKeysToAlert("Hello Helal");
        alertsPage.acceptAlert();
        Assert.assertTrue(alertsPage.getActualResultText().contains("Hello Helal"));

    }
}
