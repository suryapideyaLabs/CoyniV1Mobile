package coyni_mobile.pages;

import coyni_mobile.components.FaceIDFingerPrintPINComponent;
import coyni_mobile.components.PreferencesComponent;
import coyni_mobile.components.SecurityComponent;
import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ProfilePage extends MobileFunctions {

    private By btnLogout = MobileBy.xpath("");
    private By btnMyProfile = MobileBy.xpath("");
    private By btnNotifications = MobileBy.xpath("");
    private By btnRequests = MobileBy.xpath("");
    private By btnPaymentMethods = MobileBy.xpath("");
    private By btnPreferences = MobileBy.xpath("");
    private By btnAccountLimits = MobileBy.xpath("");
    private By btnChangePassword = MobileBy.xpath("");
    private By btnSecurity = MobileBy.xpath("");
    private By btnFaceIDOrFingerPrint = MobileBy.xpath("");
    private By btnAgreements = MobileBy.xpath("");

    public MyProfilePage clickMyProfile(){
        click(btnMyProfile, "My Profile");
        return new MyProfilePage();
    }

    public void clickRequests(){
        click(btnRequests, "Requests");
    }

    public void clickNotifications(){
        click(btnNotifications, "Notifications");
    }

    public void clickPaymentMethods(){
        click(btnPaymentMethods, "Payment Methods");
    }

    public PreferencesComponent clickPreferences(){
        click(btnPreferences, "Preferences");
        return new PreferencesComponent();
    }

    public void clickAccountLimits(){
        click(btnAccountLimits, "Account Limits");
    }
    public ChangePasswordPage clickChangePassword(){
        click(btnChangePassword, "Change Password");
        return new ChangePasswordPage();
    }

    public SecurityComponent clickSecurity(){
        click(btnSecurity, "Security");
        return new SecurityComponent();
    }

    public FaceIDFingerPrintPINComponent clickFaceIdFingerPrint(){
        click(btnFaceIDOrFingerPrint, "Face ID/ Fingerprint and PIN");
        return new FaceIDFingerPrintPINComponent();
    }

    public void clickAgreements(){
        click(btnAgreements, "Agreements");
    }

    public void clickLogout(){
        click(btnLogout, "Logout");
    }

}
