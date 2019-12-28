package com.automation.appium.Screen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;

import static com.automation.appium.Utils.DriverUtils.getDriver;
//Alt enter to import the methods
public class RegistrationScreen {
   public RegistrationScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);

    }

    @AndroidFindBy (id="passwordSignUp")
    private AndroidElement passwordField;

    @AndroidFindBy (id="confirmPasswords")
    private AndroidElement confirmPasswordField;

    @AndroidFindBy (id = "firstNameText")
    private AndroidElement firstNamefield;

    @AndroidFindBy (id = "lastNameText")
    private AndroidElement lastNameField;

    @AndroidFindBy (id = "signUpCheckbox")
    private AndroidElement checkbox;

    @AndroidFindBy (id = "signUpButton")
    private AndroidElement signUpBtn;

    public void fillRegistrationInfo() {
        passwordField.sendKeys(RandomStringUtils.randomAlphanumeric(8));
        confirmPasswordField.sendKeys(RandomStringUtils.randomAlphanumeric(8));
        firstNamefield.sendKeys(RandomStringUtils.randomAlphabetic(6));
        lastNameField.sendKeys(RandomStringUtils.randomAlphabetic(6));
        checkbox.click();
        signUpBtn.click();
    }


}