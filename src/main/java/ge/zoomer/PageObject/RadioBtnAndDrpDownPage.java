package ge.zoomer.PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RadioBtnAndDrpDownPage {
    protected SelenideElement
            goToLaptops=$(byAttribute("data-show-id", "51")),
            searchStorageType=$(byText("მყარი დისკის ტიპი")),
            chooseSSDCheckbox=$(byText("SSD")),
            searchGPUtype=$(byText("ვიდეობარათის ტიპი")),
            chooseType=$(byText("Integrated")),
            dropdowMenu=$(byText("პოპულარული"), 0),
            chooseDescending=$(byText("ფასი: კლებადობით")),
            goToTopofPage=$(byText("ონლაინ განვადება"));


}
