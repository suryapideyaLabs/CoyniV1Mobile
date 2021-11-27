package coyni_mobile.pages;

import ilabs.MobileFramework.DriverFactory;
import org.openqa.selenium.By;

import ilabs.MobileFramework.MobileFunctions;
import io.appium.java_client.MobileBy;

public class HomePage extends MobileFunctions {

    private By btnSignUp =  MobileBy.xpath("//*[@name='Sign Up']");
    private By btnSignIn = MobileBy.xpath("//*[@name='Login']");
//    private By lnkSignup = MobileBy.xpath("//*[text()='Sign up']");

    public LoginPage clickSingIn(){
        click(btnSignIn, "Sign In button");
        return new LoginPage();
    }

    public CreateAnAccountPage clickSignup(){
        click(btnSignUp, "Sing up Button");
        return new CreateAnAccountPage();
    }



}
