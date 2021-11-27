package coyni_mobile.pages;

import coyni_mobile.utilities.CommonFunctions;
import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MyProfilePage extends MobileFunctions {

    private By lblUserName = MobileBy.xpath("//*[@name='User Name']/following-sibling::*[2]");
    private By lblEmail = MobileBy.xpath("//*[@name='Email']/following-sibling::*[2]");
    private By lblPhoneNumber = MobileBy.xpath("//*[@name='Phone Number']/following-sibling::*[2]");
    private By lblLocalCurrency = MobileBy.xpath("//*[@name='Local Currency']/following-sibling::*[2]");
    private By btnEditAddressIcon = MobileBy.xpath("//*[@name='EditAppColor']");
    private By lblCurrentAddresss = MobileBy.xpath("//*[@name='Address']/following-sibling::*[1]");
    private By lblStatus =MobileBy.xpath("//*[@name='Active']");

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
