package coyni_mobile.pages;

import coyni_mobile.utilities.CommonFunctions;
import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MyProfilePage extends MobileFunctions {

    private By lblUserName = MobileBy.xpath("");
    private By lblEmail = MobileBy.xpath("");
    private By lblPhoneNumber = MobileBy.xpath("");
    private By lblLocalCurrency = MobileBy.xpath("");
    private By btnEditAddressIcon = MobileBy.xpath("");
    private By lblCurrentAddresss = MobileBy.xpath("");

    public void verifyUserName(String expUserName){
        String actUserName = getText(lblUserName);
        new CommonFunctions().verifyLabelText("User Name", expUserName, actUserName);
    }

    public void verifyEmail(String expEmail){
        String actEmail = getText(lblEmail);
        new CommonFunctions().verifyLabelText("Email", expEmail, actEmail);
    }

    public void verifyPhoneNumber(String expPhoneNumber) {
        String actPhoneNumber = getText(lblPhoneNumber);
        new CommonFunctions().verifyLabelText("Phone Number", expPhoneNumber, actPhoneNumber);
    }

    public void verifyLocalCurrency(String expLocalCurrency){
        String actLocalCurreny = getText(lblLocalCurrency);
        new CommonFunctions().verifyLabelText("Local Currency", expLocalCurrency, actLocalCurreny);
    }

    public void verifyCurrentAddress(String expCurrentAddress){
        String actCurrentAddress = getText(lblCurrentAddresss);
        new CommonFunctions().verifyLabelText("Current Address", expCurrentAddress, actCurrentAddress);
    }

    public void clickEditAddress() {
        click(btnEditAddressIcon, "Edit address icon");
    }
}
