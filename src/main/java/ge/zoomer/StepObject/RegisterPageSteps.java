package ge.zoomer.StepObject;

import ge.zoomer.PageObject.RegisterPage;

public class RegisterPageSteps extends RegisterPage {
    public RegisterPageSteps clickProfilePage(){
        goToProfilePage.click();
        return this;
    }
    public RegisterPageSteps clickRegisterBtn(){
        goToReregisterPage.click();
        return this;
    }
    public RegisterPageSteps fillAllFields(String Email, String pass){
        fillEmailField.setValue(Email);
        fillPassField.setValue(pass);
        fillConfirmPassField.setValue(pass);
        return this;
    }
    public RegisterPageSteps checkmarkRules(){
        checkMarkRules.click();
        return this;
    }
    public RegisterPageSteps registration(){
        clickRegBtn.click();
        return this;
    }
    public RegisterPageSteps logOut(){
        clickGamarjoba.click();
        logOut.click();
        return this;
    }

}