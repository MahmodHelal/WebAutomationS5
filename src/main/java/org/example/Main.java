package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //JS Alert
        driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();

        Alert alert = driver.switchTo().alert();
        String alertMessage  =alert.getText();
        alert.accept();

        System.out.println("alert message is " + alertMessage);
        System.out.println("result message is "+ driver.findElement(By.id("result")).getText());


        //JS Confirm or Dismiss
        driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();

         alert = driver.switchTo().alert();
        String alert2Message  =alert.getText();
        alert.dismiss();

        System.out.println("alert message is " + alert2Message);
        System.out.println("result message is "+ driver.findElement(By.id("result")).getText());



        //JS Prompt
        driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();

         alert = driver.switchTo().alert();
        String alert3Message  =alert.getText();
        alert.sendKeys("Hello Helal From S5");
        alert.accept();

        System.out.println("alert message is " + alert3Message);
        System.out.println("result message is "+ driver.findElement(By.id("result")).getText());



        //Assignment For S5 Deadline next sunday
        /*perform test on Alerts page according to POM Design pattern
        * 1- js alert
        * 2- js confirm
        * 3- js prompt
        * With assertion
        * using wait strategy
      */







    }
}