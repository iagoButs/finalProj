package testZoomer;

import ge.zoomer.StepObject.PriceRangeSteps;
import ge.zoomer.StepObject.RadioBtnAndDrpDownPageSteps;
import ge.zoomer.utils.Runner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class DropDownAndPriceTests extends Runner{
    @Test(priority = 0)
    public  void dropdownMenu(){
        RadioBtnAndDrpDownPageSteps steps=new RadioBtnAndDrpDownPageSteps();
        steps.searchandcheck();
        steps.sortbyDescending();
        sleep(10000);
    }
    @Test(priority = 1)
    public void priceRange(){
        PriceRangeSteps steps=new PriceRangeSteps();
        steps.priceRange();

        sleep(2000);
    }
}
