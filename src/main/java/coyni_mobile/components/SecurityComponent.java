package coyni_mobile.components;

import com.twilio.rest.api.v2010.account.incomingphonenumber.Mobile;
import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SecurityComponent extends MobileFunctions {

    private By radBtnUseScreenLock = MobileBy.xpath("");
    private By btnClose = MobileBy.xpath("");

    public void clickUseScreenLock(){
        click(radBtnUseScreenLock, "Use Screen Lock Button");
    }
}
