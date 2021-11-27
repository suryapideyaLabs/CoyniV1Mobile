package coyni_mobile.pages;

import com.twilio.rest.api.v2010.account.incomingphonenumber.Mobile;
import coyni_mobile.components.AddressComponent;
import coyni_mobile.utilities.CommonFunctions;
import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class EnterCardDetailsPage extends MobileFunctions {

    private By txtCardHolderName = MobileBy.xpath("");
    private By txtCardNumber = MobileBy.xpath("");
    private By txtExpiryDate = MobileBy.xpath("");
    private By txtCVV = MobileBy.xpath("");
    private By btnProceed = MobileBy.xpath("");
    private By txtPreAuthAmount = MobileBy.xpath("");
    private By btnVerifyCard = MobileBy.xpath("");
    private By lblPreAuthFailedMsg = MobileBy.xpath("");
    private By lblPreAuthErrorMsg = MobileBy.xpath("");
    private By btnOK = MobileBy.xpath("");
    // have to add elements and method related successful card

    public AddressComponent addressComponent(){
        return new AddressComponent();
    }

    public void fillCardHolderName(String cardHolderName) {
        enterText(txtCardHolderName, cardHolderName, "Card Holder Name");
    }

    public void fillCardNumber(String cardNumber) {
        enterText(txtCardNumber, cardNumber, "Card Number");
    }

    public void fillExpiryDate(String expiryDate){
        enterText(txtExpiryDate, expiryDate, "Expiry Date");
    }

    public void fillCVV(String cvv){
        enterText(txtCVV, cvv, "CVV / CVC");
    }

    public void clickProceedButton(){
        click(btnProceed, "Proceed Button");
    }

    public void fillPreAuthAmount(String preAuthAmt) {
        enterText(txtPreAuthAmount, preAuthAmt, "Pre Auth Amount");
    }

    public void clickVerifyCard() {
        click(btnVerifyCard, "Verify Card");
    }

    public void verifyPreAuthFailedMesg(String failedMsg){
        String text = getText(lblPreAuthFailedMsg);
        new CommonFunctions().verifyLabelText("Pre Auth Failed Message", failedMsg, text);
    }

    public void verifyPreAuthErrorMsg(String errorMsg) {
        String actError = getText(lblPreAuthErrorMsg);
        new CommonFunctions().verifyLabelText("Pre Auth Error Message", errorMsg, actError);
    }

    public void clickOk() {
        click(btnOK, "OK button");
    }

}
