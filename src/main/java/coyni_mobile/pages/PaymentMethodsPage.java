package coyni_mobile.pages;

import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class PaymentMethodsPage extends MobileFunctions {
    private By btnExternalBankAccount = MobileBy.xpath("");
    private By btnDebitCreditCard = MobileBy.xpath("");
    private By btnSignetAccount = MobileBy.xpath("");

    public void clickExternalBankAccount(){
        click(btnExternalBankAccount, "External Bank Account");
    }

    public void clickDebitCreditCard(){
        click(btnDebitCreditCard, "Debit / Credit Card");
    }

    public void clickSignetAccount(){
        click(btnSignetAccount, "Signet Account");
    }
}
