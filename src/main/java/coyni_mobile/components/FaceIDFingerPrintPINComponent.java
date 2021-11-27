package coyni_mobile.components;

import com.twilio.rest.api.v2010.account.incomingphonenumber.Mobile;
import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FaceIDFingerPrintPINComponent extends MobileFunctions {
    private By radBtnFaceIDFingerprintPIN = MobileBy.xpath("");
    private By btnClose = MobileBy.xpath("");

    public void clickFaceIDFingerprintPIN(){
        click(radBtnFaceIDFingerprintPIN, "Face ID/ Fingerprint and PIN button");
    }

    public void clickClose(){
        click(btnClose, "Close icon");
    }
}
