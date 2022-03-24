package ge.zoomer.StepObject;

import ge.zoomer.PageObject.RadioBtnAndDrpDownPage;

public class RadioBtnAndDrpDownPageSteps extends RadioBtnAndDrpDownPage {
    public  RadioBtnAndDrpDownPageSteps searchandcheck(){
        goToLaptops.click();
        searchStorageType.click();
        chooseSSDCheckbox.click();
        searchGPUtype.click();
        chooseType.click();
        return this;

    }
    public RadioBtnAndDrpDownPageSteps sortbyDescending(){
        goToTopofPage.scrollIntoView(true);
        dropdowMenu.click();
        chooseDescending.click();
        return this;
    }
}
