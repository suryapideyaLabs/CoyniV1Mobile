package coyni_mobile.pages;

import org.openqa.selenium.By;

import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;

public class LoginPage extends MobileFunctions {
    private By txtUserName = MobileBy.xpath("//*[@name='Email']");
    private By txtPassword = MobileBy.xpath("//*[@name='Password']");
    private By btnLogin = MobileBy.xpath("(//*[@name='Login'])[1]");
    private By lnkSignUp = MobileBy.xpath("//*[@name='']");
    private By lnkForgotPassword = MobileBy.linkText("com.coyni.android:id/tvForgot");

    public void fillUserName(String userName){
        enterText(txtUserName, userName, "username");
    }

    public void fillPassword(String password){
        enterText(txtPassword, password, "password");
    }

    public void clickLogin(){
        click(btnLogin, "login button");
    }

    public CreateAnAccountPage clickSingupLink(){
        click(lnkSignUp, "sign up link");
        return new CreateAnAccountPage();
    }

    public void clickForgotPasswordLink(){
        click(lnkForgotPassword, "forgot password link");
    }


}
