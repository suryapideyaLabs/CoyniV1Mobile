package coyni_mobile.components;

import coyni_mobile.utilities.CommonFunctions;
import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import java.util.TimeZone;

public class PreferencesComponent extends MobileFunctions {

    private By drpDwnTimeZone = MobileBy.xpath("//*[@name='down-arrow']");
    private By drpDwnOptions = MobileBy.xpath("");
    private By txtLocalCurrency = MobileBy.xpath("//*[@name='Local Currency']");
    private By btnUpdate = MobileBy.xpath("(//*[@name='Update'])[1]");
    private By btnClose = MobileBy.xpath("//*[@name='cancel']");


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