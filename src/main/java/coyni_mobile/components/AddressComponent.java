package coyni_mobile.components;

import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AddressComponent extends MobileFunctions {
    private By txtAddressLine1 = MobileBy.xpath("//*[@name='Address Line 1']");
    private By txtAddressLine2 = MobileBy.xpath("//*[@name='Address Line 2']");
    private By drpDwnState = MobileBy.xpath("//*[contains(@name,'State')]");
    private By txtCity = MobileBy.xpath("//*[@name='City']");
    private By txtZipcode = MobileBy.xpath("//*[contains(@name,'Postal Code')]");
    private By btnConfirmAndSave = MobileBy.xpath("//*[@name='Update']");

    private By getState(String state) {
        return By.xpath(String.format("//*[@name='%s']", state));
    }

    public void fillAddressLine1(String addressLine1){
        enterText(txtAddressLine1, addressLine1, "Address Line 1");
    }

    public void fillAddressLine2(String addressLine2){
        enterText(txtAddressLine2, addressLine2, "Address Line 2");
    }

    public void selectStateRegion(String state) {
        click(drpDwnState, "State / Province / Region");
        click(getState(state), state);
    }

    public void fillCity(String city){
        enterText(txtCity, city, "City");
    }

    public void fillZipcode(String zipCode) {
        enterText(txtZipcode, zipCode, "Zip Code");
    }

    public void clickConfirmAndSave() {
        click(btnConfirmAndSave, "Confirm & Save");
    }

}
