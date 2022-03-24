package ge.zoomer.StepObject;

import ge.zoomer.PageObject.LoginPage;

public class LoginPageSteps extends LoginPage {
    public LoginPageSteps fillallFields(String Email, String Password){

        goToProfilePage.click();
        fillemailfield.setValue(Email);
        fillpassfield.setValue(Password);
        clickEnter.click();
        return this;
    }
}
