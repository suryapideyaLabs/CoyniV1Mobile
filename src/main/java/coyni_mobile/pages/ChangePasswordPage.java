package coyni_mobile.pages;

import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ChangePasswordPage extends MobileFunctions {

    private By txtOldPassword = MobileBy.xpath("//*[@name='Old Password']");
    private By txtNewPassword = MobileBy.xpath("//*[@name='New Password']");
    private By txtConfirmPassword = MobileBy.xpath("//*[@name='Confirm Password']");
    private By btnConfirmAndSave = MobileBy.xpath("//*[@name='Confirm & Save']");

    public void fillOldPassword(String oldPassword){
        enterText(txtOldPassword, oldPassword, "Old Password");
    }

    public void fillNewPassword(String newPassword){
        enterText(txtNewPassword, newPassword, "New Password");
    }

    public void fillConfirmPassword(String confirmPassword){
        enterText(txtConfirmPassword, confirmPassword, "Confirm Password");
    }

    public void clickConfirmAndSave(){
        click(btnConfirmAndSave, "Confirm and Save");
    }



}
