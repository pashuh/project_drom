package pages;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;
import tests.SearchTests;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {

    @Step("Open Ad Search")
    public SearchPage openSearchForAds() {
        $("[href='https://auto.drom.ru/']").click();
        return this;
    }
    @Step("Set the car brand")
    public SearchPage setBrand(String brand) {
        $("placeholder=['Марка']").setValue(brand).pressEnter();
        return this;
    }
    @Step("Click show")
    public SearchPage clickShow(){
        $(".css-2842jw.e3cb8x01").click();
        return this;
    }
    @Step("Assert")
    public SearchPage assertSearchBrand(String brand) {
        $$(".css-17lk78he3f4v4l2").shouldHave(CollectionCondition.texts(brand));
        return this;
    }
}
