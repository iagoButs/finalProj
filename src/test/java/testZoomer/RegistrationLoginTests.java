package testZoomer;

import ge.zoomer.PageObject.LoginPage;
import ge.zoomer.PageObject.RegisterPage;
import ge.zoomer.StepObject.LoginPageSteps;
import ge.zoomer.StepObject.RegisterPageSteps;
import ge.zoomer.utils.Runner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static ge.zoomer.DataObject.RegisterPageData.email;
import static ge.zoomer.DataObject.RegisterPageData.password;

public class RegistrationLoginTests extends Runner {
    @Test(priority = 0)
    @Severity(SeverityLevel.CRITICAL)
    @Description("testing zoomer registration page")
    public void registerZoomerPage() {
        RegisterPageSteps steps = new RegisterPageSteps();
        RegisterPage asserts = new RegisterPage();
        steps
                .clickProfilePage()
                .clickRegisterBtn()
                .fillAllFields(email, password)
                .checkmarkRules();
        Assert.assertTrue(asserts.checkIfmarked.isDisplayed());
                steps.registration();
        sleep(2000);
        Assert.assertTrue(asserts.checkregisterisSuccess.isDisplayed());
                steps.logOut();




    }



    @Test(priority = 1 )
    public void loginZoomerPage() {
        LoginPageSteps steps = new LoginPageSteps();
        LoginPage asserts=new LoginPage();
        steps.fillallFields(email, password);
        sleep(2000);
        Assert.assertTrue(asserts.checkLoginisSuccess.isDisplayed());


    }
}

