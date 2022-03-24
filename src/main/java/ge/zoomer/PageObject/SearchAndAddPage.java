package ge.zoomer.PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchAndAddPage {
    protected SelenideElement searchField=$(byAttribute("id", "small-searchterms"));
    protected SelenideElement goToBasket= $(byClassName("h_basket_price"), 0);
    //protected SelenideElement kalatashiGadasvla=$(byText("კალათაში გადასვლა"));
       public SelenideElement checkBasketIsEmpty=$(byText("თქვენი კალათა ცარიელია"));
    protected SelenideElement clearBasket=$(byText("კალათის გასუფთავება"));
    protected SelenideElement acceptclear=$(byAttribute("class", "blue_button confirm_button"));
    protected SelenideElement busketbtn= $(byClassName("basket_white"), 1);
    protected SelenideElement zoomerHomebtn=$(byAttribute("class", "svg replaced-svg"));

    protected ElementsCollection
        busketAllBtn=$$(byAttribute("class", "basket_white"));

}
