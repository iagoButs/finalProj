package ge.zoomer.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    protected SelenideElement
            goToProfilePage=$(byText("პროფილი")),
            fillemailfield=$(byAttribute("id", "EmailOrPhone")),
            fillpassfield=$(byAttribute("data-val-required", "შეიყვანეთ პაროლი")),
            clickEnter =$(byText("შესვლა"));

    public SelenideElement checkLoginisSuccess=$(byText("გამარჯობა"));
}
