package coyni_mobile.pages;

import org.openqa.selenium.By;

import ilabs.MobileFramework.MobileFunctions;
import ilabs.mobile.reporting.ExtentTestManager;
import io.appium.java_client.MobileBy;

public class CreateAnAccountPage extends MobileFunctions {

    private By txtFirstName = MobileBy.xpath("//*[@name='First Name']");
    private By txtLastName = MobileBy.xpath("//*[@name='Last Name']");
    private By txtPhoneNum = MobileBy.xpath("//*[@name='Phone Number']");
    private By txtEmail = MobileBy.xpath("//*[@name='Email']");
    private By lnkPrivacyPolicy = MobileBy.xpath("//*[@name='Privacy Policy']");
    private By lnkTermsOfService = MobileBy.xpath("//*[@name='Terms of Services']");
    private By btnNext = MobileBy.xpath("//*[@name='Next']");

    public void verifyCreateAnAccountPage(){
        if(isElementPresent(txtFirstName)){
            ExtentTestManager.setPassMessageInReport("User is in Create an account Page");
        } else {
            ExtentTestManager.setFailMessageInReport("User is not in Create an account Page");
        }
    }

    public void fillFirstName(String firstName) {
        enterText(txtFirstName, firstName, "First Name");
    }

    public void fillLastName(String lastName){
        enterText(txtLastName,lastName, "Last Name");
    }

    public void fillPhoneNumber(String phNum) {
        enterText(txtPhoneNum, phNum, "Phone Num");
    }

    public void fillEmail(String email) {
        enterText(txtEmail, email, "Email");
    }

    public void clickPrivacyPolicy(){
        click(lnkPrivacyPolicy, "Privacy Policy Link");
    }

    public void clickTermsOfService(){
        click(lnkTermsOfService, "Terms of Service Link");
    }
    public void clickNext(){
        click(btnNext, "Next");
    }

}
