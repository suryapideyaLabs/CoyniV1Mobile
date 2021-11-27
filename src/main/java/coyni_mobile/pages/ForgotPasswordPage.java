package coyni_mobile.pages;

import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends MobileFunctions {

    private By txtEmailAddress = MobileBy.xpath("");
    private By btnSendInstructions = MobileBy.xpath("");

    public void fillEmailAddress(String email){
        enterText(txtEmailAddress, email, "Enter Email Address");
    }

    public void clickSendInstructions(){
        click(btnSendInstructions, "Send Instructions");
    }


}
