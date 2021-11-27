package coyni_mobile.components;

import coyni_mobile.utilities.CommonFunctions;
import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class PreferencesComponent extends MobileFunctions {

    private By drpDwnTimeZone = MobileBy.xpath("");
    private By drpDwnOptions = MobileBy.xpath("");
    private By txtLocalCurrency = MobileBy.xpath("");
    private By btnUpdate = MobileBy.xpath("");
    private By btnClose = MobileBy.xpath("");


    public void selectTimeZone(String timeZone){
        selectDropdownOption(drpDwnTimeZone, drpDwnOptions, timeZone, "Time Zone");
    }

    public void verifyLocalCurrency(String expCurrency){
        new CommonFunctions().verifyLabelText("Local Currency", expCurrency, getText(txtLocalCurrency));
    }

    public void clickUpdate() {
        click(btnUpdate, "Update button");
    }

    public void clickClose(){
        click(btnClose, "Close button");
    }



}