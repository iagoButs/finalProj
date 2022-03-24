package ge.zoomer.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class PriceRangePage {
        protected SelenideElement
                    //goToLaptops=$(byAttribute("data-show-id", "51")),
                    minPriceField=$(byId("min_price")),
                    maxPriceField=$(byId("max_price")),
                    priceRangeSearchOkbtn=$(byAttribute("class", "js-filter-price act"));


}
