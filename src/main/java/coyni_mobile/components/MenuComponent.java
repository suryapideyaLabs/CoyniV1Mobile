package coyni_mobile.components;

import com.twilio.rest.api.v2010.account.incomingphonenumber.Mobile;
import coyni_mobile.pages.ProfilePage;
import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MenuComponent extends MobileFunctions {

    private By menuToken = MobileBy.xpath("");
    private By menuAssets = MobileBy.xpath("");
    private By menuTransactions = MobileBy.xpath("");
    private By menuIssuing = MobileBy.xpath("");
    private By menuMenu = MobileBy.xpath("");

    public void clickToken(){
        click(menuToken, "Token Menu");
    }

    public void clickAssets(){
        click(menuAssets, "Token Icon");
    }

    public SubMenuComponent clickTransactions(){
        click(menuTransactions, "Transactions Icon");
        return new SubMenuComponent();
    }

    public void clickIssuing(){
        click(menuIssuing, "Issuing Icon");
    }

    public ProfilePage clickMenu(){
        click(menuMenu, "Menu Icon");
        return new ProfilePage();
    }


}
