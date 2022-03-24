package ge.zoomer.utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class Runner {
    @BeforeTest
    public void openBrowser(){
        Configuration.browser="chrome";
        Configuration.browserSize="1920x1080";
        baseUrl="https://zoommer.ge/";
        open(baseUrl);

    }

}
