package coyni_mobile.pages;

import ilabs.MobileFramework.MobileFunctions;
import ilabs.mobile.actions.WaitForElement;
import ilabs.mobile.reporting.ExtentTestManager;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class PayOrRequestPage extends MobileFunctions {
   
    private By lblDailyLimit = MobileBy.xpath("//*[contains(@name,'Your daily limit ')]");
    private By lblBalance = MobileBy.xpath("//*[@name='coyniLogo']/following-sibling::*[2]");
    private By txtAmount = MobileBy.xpath("//*[@name='max']/preceding-sibling::*[1]");
    private By txtMessageToRecipient = MobileBy.xpath("//*[contains(@name,'/160')]/preceding-sibling::*[1]");
    private By btnPay = MobileBy.xpath("//*[@name='Pay']");
    private By btnRequest = MobileBy.xpath("//*[@name='Request']");
    private By imgClock = MobileBy.xpath("//*[@name='clock']");
    private By btnSuccessImage = MobileBy.xpath("//*[@name='debitSucces']");
    private By lblRequestedAmountMsg = MobileBy.xpath("//*[@name='Done']/preceding-sibling::*[1]");
    private By btnDone = MobileBy.xpath("//*[@name='Done']");

    public void getDailyLimitText(){
        String text = getText(lblDailyLimit);
        ExtentTestManager.setInfoMessageInReport("Displayed message "+text);
    }

    public String getBalance(){
        String text = getText(lblBalance);
        ExtentTestManager.setInfoMessageInReport("Balance is "+text);
        return text;
    }

    public void fillAmount(String amount) {
        enterText(txtAmount, amount, "Amount");
    }

    public void fillTextMessageToRecipient(String message) {
        enterText(txtMessageToRecipient, message, "Message To Recipient");
    }

    public void clickPay(){
        click(btnPay, "Pay Button");
    }

    public void clickRequest() {
        click(btnRequest, "Request Button");
    }

    public void waitTillClockInvisible(){
        if(getElementList(imgClock, "Processing Clock Image").size() > 0){
            ExtentTestManager.setInfoMessageInReport("Processing Image Displayed");
            waitForElement(imgClock, waittime, WaitForElement.invisiblity);
        }
    }

    public void verifySuccessImageDisplayed(){
        waitForElement(btnSuccessImage, waittime, WaitForElement.presence);
    }

    // request amount
    public void verifyRequestedAmountMessage(String amount) {
        String reqAmountMsg = getText(lblRequestedAmountMsg);
        if(reqAmountMsg.contains(amount)){
            ExtentTestManager.setPassMessageInReport("Request message contains requested amount "+amount);
        } else {
            ExtentTestManager.setFailMessageInReport("Requested message does not contains amount requested. Actual message is "+reqAmountMsg+" and exp amount is "+amount);
        }
    }

    public void clickDone() {
        click(btnDone, "Done");
    }
}
