package ge.zoomer.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RegisterPage {
    protected SelenideElement
            goToProfilePage=$(byText("პროფილი")),
            goToReregisterPage=$(byText("რეგისტრაცია")),
            fillEmailField=$(byId("Email")),
            fillPassField=$(byId("register-password")),
            fillConfirmPassField=$(byId("ConfirmPassword")),
            checkMarkRules=$(byAttribute("class", "checkmark registration_checkmark")),
            clickRegBtn=$(byId("register-button")),
            clickGamarjoba=$(byText("გამარჯობა")),
            logOut= $(byId("Group_185"), 1);

    public SelenideElement
            checkIfmarked=$(byAttribute("class", "orange_btn registration_button js-register-btn")),
            checkregisterisSuccess=$(byText("გამარჯობა"));







}
