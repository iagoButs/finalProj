package testZoomer;

import ge.zoomer.PageObject.SearchAndAddPage;
import ge.zoomer.StepObject.SearchAndAddPageSteps;
import ge.zoomer.utils.Runner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class AddBasketTest extends Runner {

    @Test(priority = 0)
    public void checkBasketIsempty() {
        SearchAndAddPageSteps steps=new SearchAndAddPageSteps();
        SearchAndAddPage asserts = new SearchAndAddPage();
        //go and checks if basket is empty
        steps.goToBasket();
        Assert.assertTrue(asserts.checkBasketIsEmpty.isDisplayed());
        steps.pressHomeBtn();

        sleep(3000);

    }

    @Test(priority = 1)
    public  void searchAndAdd(){
        SearchAndAddPageSteps steps=new SearchAndAddPageSteps();
        SearchAndAddPage asserts = new SearchAndAddPage();
        // search add and go to basket
        steps
                .searchItems()
                .addItemToBasket();
        sleep(2000);
        steps.goToBasket();
        //check basket is not empty
        sleep(3000);
        Assert.assertFalse(asserts.checkBasketIsEmpty.isDisplayed());
        //empty basket
        steps.clearBusket();
        sleep(3000);
        //check if busket is clear
        Assert.assertTrue(asserts.checkBasketIsEmpty.isDisplayed());
        //go to homepage
        steps.pressHomeBtn();

        sleep(3000);

    }

    @Test (priority = 2)
    public void searchAndAddAllItems(){
        SearchAndAddPageSteps steps=new SearchAndAddPageSteps();
        SearchAndAddPage asserts = new SearchAndAddPage();

        steps
                .pressHomeBtn()
                .addAllsearchedItems()
                .goToBasket();
        //check basket is not empty
        Assert.assertFalse(asserts.checkBasketIsEmpty.isDisplayed());


        steps.clearBusket();
        sleep(2000);
        //check if busket is clear
        Assert.assertTrue(asserts.checkBasketIsEmpty.isDisplayed());
        //go to homepage
        steps.pressHomeBtn();
    }
}
