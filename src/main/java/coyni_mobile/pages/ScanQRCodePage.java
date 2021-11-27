package coyni_mobile.pages;

import ilabs.MobileFramework.MobileFunctions;
import ilabs.mobile.reporting.ExtentTestManager;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ScanQRCodePage extends MobileFunctions {
    private By tabScanCode = MobileBy.xpath("");
    private By tabMyQRCode = MobileBy.xpath("");
    private By btnShare = MobileBy.xpath("");
    private By btnCopy = MobileBy.xpath("");
    private By popupShare = MobileBy.xpath("//*[@name='ActivityListView']");
    private By btnClosePopup = MobileBy.xpath("//*[@name='Close']");

    public void clickScanCode(){
        click(tabScanCode, "Scan Code");
    }

    public void clickMyQRCode(){
        click(tabMyQRCode, "My QR Code");
    }

    public void clickShare() {
        click(btnShare, "Share Button");
    }

    public void clickCopy(){
        click(btnCopy, "Copy Button");
    }

    public void verifySharePopupDisplayed() {
        if(getElementList(popupShare, "popup share").size() > 1) {
            ExtentTestManager.setPassMessageInReport("Share popup displayed");
        }else {
            ExtentTestManager.setFailMessageInReport("Share popup not displayed");
        }
    }

    public void clickClosePopup() {
        click(btnClosePopup, "Close Pop Up");
    }




}
