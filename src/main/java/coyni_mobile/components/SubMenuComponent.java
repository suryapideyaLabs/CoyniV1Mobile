package coyni_mobile.components;

import org.openqa.selenium.By;

import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;

public class SubMenuComponent extends MobileFunctions {
    //    private By btnSend = MobileBy.id("com.ideyalabs.quickcard:id/layoutTSend");
//    private By btnReceive = MobileBy.id("com.ideyalabs.quickcard:id/layoutTReceive");

    private By btnScanQR = MobileBy.xpath("//*[@name='Scan QR']");
    private By btnPayOrRequest = MobileBy.xpath("//*[@name='Pay / Request']");
    private By btnBuyToken = MobileBy.xpath("//*[@name='Buy Tokens']");
    private By btnWithdraw = MobileBy.xpath("//*[@name='Withdraw']");

    // sub menu actions
    public BuyTokenMenuComponent clickBuyToken() {
        click(btnBuyToken, "Buy Token");
        return new BuyTokenMenuComponent();
    }

    public void clickScanQR() {
        click(btnScanQR, "Scan QR");
    }

    public void clickPayOrRequest() {
        click(btnPayOrRequest, "Pay / Request");
    }

    public WithdrawMenuComponent clickWithdraw() {
        click(btnWithdraw, "Withdraw");
        return new WithdrawMenuComponent();
    }


}
