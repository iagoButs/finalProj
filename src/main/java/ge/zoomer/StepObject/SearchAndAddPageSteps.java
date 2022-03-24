package ge.zoomer.StepObject;

import ge.zoomer.PageObject.SearchAndAddPage;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static ge.zoomer.DataObject.SearhPageObjects.searchObj;

public class SearchAndAddPageSteps extends SearchAndAddPage {

    public SearchAndAddPageSteps searchItems(){
        searchField.setValue(searchObj).pressEnter();
        return this;
    }
    // adds to busket second imtem
    public SearchAndAddPageSteps addItemToBasket(){
        busketbtn.click();
        return this;
    }


    public SearchAndAddPageSteps goToBasket(){
        goToBasket.click();
        return this;
    }
    public SearchAndAddPageSteps clearBusket(){
        clearBasket.click();
        acceptclear.click();
        return this;
    }
    public SearchAndAddPageSteps pressHomeBtn(){
        zoomerHomebtn.click();
        return this;
    }
    public SearchAndAddPageSteps addAllsearchedItems(){
        searchField.setValue(searchObj).pressEnter();
        for (int i = 0; i < busketAllBtn.size(); i++) {
            $(byClassName("basket_white"), i).click();
            sleep(1000);
        }
        return this;
    }

}
