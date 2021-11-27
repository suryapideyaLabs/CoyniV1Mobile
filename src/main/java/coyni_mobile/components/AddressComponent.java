package coyni_mobile.components;

import ilabs.MobileFramework.MobileFunctions;
import org.openqa.selenium.By;

public class AddressComponent extends MobileFunctions {
    private By txtAddressLine1 = By.xpath("");
    private By txtAddressLine2 = By.xpath("");
    private By drpDwnState = By.xpath("");
    private By txtCity = By.xpath("");
    private By txtZipcode = By.xpath("");
    private By btnConfirmAndSave = By.xpath("");

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
