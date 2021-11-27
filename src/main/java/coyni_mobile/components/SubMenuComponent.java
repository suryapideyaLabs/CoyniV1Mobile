package coyni_mobile.components;

import coyni_mobile.pages.AddRecipientPage;
import coyni_mobile.pages.ScanQRCodePage;
import ilabs.mobile.reporting.ExtentTestManager;
import org.openqa.selenium.By;

import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.NoAlertPresentException;

public class SubMenuComponent extends MobileFunctions {
    private By btnScanQR = MobileBy.id("com.coyni.android:id/layoutTScan");
    private By btnPayOrRequest = MobileBy.id("com.coyni.android:id/layoutTPay");
    private By btnBuyToken = MobileBy.id("com.coyni.android:id/layoutTBuy");
    private By btnWithdraw = MobileBy.id("com.coyni.android:id/layoutTWihdraw");

    private void handlePopupIfExists() {
        try {
            String alert = getAlertText();
            ExtentTestManager.setInfoMessageInReport("Alert displayed as "+alert);
        } catch (NoAlertPresentException e){

        }
    }

    // sub menu actions
    public BuyTokenMenuComponent clickBuyToken() {
        click(btnBuyToken, "Buy Token");
        return new BuyTokenMenuComponent();
    }

    public ScanQRCodePage clickScanQR() {
        click(btnScanQR, "Scan QR");
        handlePopupIfExists();
        return new ScanQRCodePage();
    }

    public AddRecipientPage clickPayOrRequest() {
        click(btnPayOrRequest, "Pay / Request");
        handlePopupIfExists();
        return new AddRecipientPage();
    }

    public WithdrawMenuComponent clickWithdraw() {
        click(btnWithdraw, "Withdraw");
        return new WithdrawMenuComponent();
    }


}
