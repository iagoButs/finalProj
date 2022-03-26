package testZoomer;

import ge.zoomer.StepObject.PriceRangeSteps;
import ge.zoomer.StepObject.RadioBtnAndDrpDownPageSteps;
import ge.zoomer.utils.Retry;
import ge.zoomer.utils.Runner;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
@Listeners(ge.zoomer.utils.TestLister.class)
public class DropDownAndPriceTests extends Runner{
    @Test(priority = 0, retryAnalyzer = Retry.class)
    public  void dropdownMenu(){
        RadioBtnAndDrpDownPageSteps steps=new RadioBtnAndDrpDownPageSteps();
        steps.searchandcheck();
        steps.sortbyDescending();

    }
    @Test(priority = 1, retryAnalyzer = Retry.class)
    public void priceRange(){
        PriceRangeSteps steps=new PriceRangeSteps();
        steps.priceRange();


    }
}
