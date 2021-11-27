package coyni_mobile.components;

import org.openqa.selenium.By;

import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;

public class BuyTokenMenuComponent extends MobileFunctions {
    // buy token options
    private By btnCreditDebitCards = MobileBy.xpath("//*[@name='Credit / Debit Cards']");
    private By btnBankAccount = MobileBy.xpath("//*[@name='External Bank Account']");
    // buy token option actions
    public void clickCreditDebitCards() {
        click(btnCreditDebitCards, "Credit/Debit Cards");
    }

    public void clickBankAccount() {
        click(btnBankAccount, "Bank Account");
    }
}
