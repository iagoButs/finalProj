package ge.zoomer.StepObject;

import ge.zoomer.PageObject.PriceRangePage;

import static com.codeborne.selenide.Selenide.open;

public class PriceRangeSteps extends PriceRangePage {


    public PriceRangeSteps priceRange(){

        minPriceField.setValue("100");
        maxPriceField.setValue("700");
        priceRangeSearchOkbtn.click();
        return this;
    }


}
