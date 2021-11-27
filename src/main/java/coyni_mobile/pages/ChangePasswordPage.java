package coyni_mobile.pages;

import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ChangePasswordPage extends MobileFunctions {

    private By txtOldPassword = MobileBy.xpath("");
    private By txtNewPassword = MobileBy.xpath("");
    private By txtConfirmPassword = MobileBy.xpath("");
    private By btnConfirmAndSave = MobileBy.xpath("");

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
