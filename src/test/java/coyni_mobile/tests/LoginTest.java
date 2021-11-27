package coyni_mobile.tests;

import coyni_mobile.pages.HomePage;
import coyni_mobile.pages.LoginPage;
import ilabs.MobileFramework.DriverFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;

public class LoginTest {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeTest
    public void init(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void testLogin(){
        try {
            homePage.clickSingIn();
            loginPage.clickLogin();
            String text = DriverFactory.getDriver().switchTo().alert().getText();
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
