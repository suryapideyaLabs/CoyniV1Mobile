package coyni_mobile.components;

import org.openqa.selenium.By;

import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;

public class WithdrawMenuComponent extends MobileFunctions {

    // withdraw options
    private By btnInstantPay = MobileBy.xpath("//*[@name='Instant Pay']");
    private By btnGiftCard = MobileBy.xpath("//*[@name='Gift Card']");
    private By btnBankAccountWithDraw = MobileBy.xpath("//*[@name='Signet Account']");
    private By btnSignetAccount = MobileBy.xpath("//*[@name='Bank Account']");

    // withdraw options actions
    public void clickInstantPay(){
        click(btnInstantPay, "Instant Pay");
    }

    public void clickGiftCard(){
        click(btnGiftCard, "Gift Card");
    }

    public void clickWithdrawBankAccount(){
        click(btnBankAccountWithDraw, "Bank Account");
    }

    public void clickSignetAccount(){
        click(btnSignetAccount, "Signet Account");
    }
}
