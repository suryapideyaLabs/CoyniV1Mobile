package coyni_mobile.pages;

import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class UserHomePage extends MobileFunctions {
    private By lblBalance = MobileBy.xpath("(//*[contains(@name,'CYN')])[1]");
    private By lblUserName = MobileBy.xpath("//*[contains(@name,'Welcome')]/following-sibling::*[1]");
    private By btnFilters = MobileBy.xpath("//*[@name='filter']");
    private By btnExports = MobileBy.xpath("//*[@name='export']");


}
