package coyni_mobile.pages;

import com.twilio.rest.api.v2010.account.incomingphonenumber.Mobile;
import coyni_mobile.components.AddressComponent;
import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AddSignetAccountPage extends MobileFunctions {

    private By txtNameOnSignetAccount = MobileBy.xpath("//*[@name='Name on Signet Account']");
    private By txtSignetWalletId = MobileBy.xpath("//*[@name='Signet Wallet ID']");
    private By btnConfirmAndSave = MobileBy.xpath("//*[@name='Confirm & Save']");

    public AddressComponent addressComponent(){
        return new AddressComponent();
    }

    public void fillNameOnSignetAccount(String name){
        enterText(txtNameOnSignetAccount, name, "Name on Signet account");
    }

    public void fillSignetWalletId(String walletId){
        enterText(txtSignetWalletId, walletId, "Wallet ID");
    }

    public void clickConfirmAndSave(){
        click(btnConfirmAndSave, "Confirm & Save");
    }
}
