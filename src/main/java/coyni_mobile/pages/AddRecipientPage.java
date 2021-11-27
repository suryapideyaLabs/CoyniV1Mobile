package coyni_mobile.pages;

import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddRecipientPage extends MobileFunctions {
    private By txtSearchByName = MobileBy.xpath("");

    public By getContactFromRecentPeople(String contactName) {
        return MobileBy.xpath(String.format("//XCUIElementTypeCollectionView//*[@name='%s']", contactName));
    }

    public By getContactAllFriends(String contactName) {
        return MobileBy.xpath(String.format("//XCUIElementTypeTable//*[@name='%s']", contactName));
    }

    public void fillSearchByName(String name) {
        enterText(txtSearchByName, name, "Search By Name or Wallet Address");
    }

    public void clickContactFromRecentPeople(String contactName) {
        click(getContactFromRecentPeople(contactName), contactName);
    }

    public void clickContactFromAllFriends(String contactName){
        click(getContactAllFriends(contactName), contactName);
    }
}
