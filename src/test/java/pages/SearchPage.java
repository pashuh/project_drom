package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage {
    @Step("Open base url Drom")
    public SearchPage openPage() {
        open("");
        return this;
    }

    @Step("Open Ad Search")
    public SearchPage openSearchForAds() {
        $("[href='https://auto.drom.ru/']").click();
        return this;
    }

    @Step("Set the car brand")
    public SearchPage setBrand(String brand) {
        $$(".css-185i573.e1207tlp0").first().click();
        $$(".css-1r0zrug.e1uu17r80").findBy(Condition.text(brand)).click();
        return this;
    }

    @Step("Click show")
    public SearchPage clickShow() {
        $(".css-2842jw.e3cb8x01").click();
        return this;
    }

    @Step("We check that the found BMW cars")
    public SearchPage assertSearchBrand(String brand) {
        $$(".css-17lk78h.e3f4v4l2").contains(CollectionCondition.texts(brand));
        return this;
    }

    @Step("Set amount")
    public SearchPage setAmount(String amount) {
        $("[data-ftid='sales__filter_price-from']").setValue(amount);
        $("[data-ftid='sales__filter_price-to']").setValue(amount);
        return this;
    }

    @Step("Assert amount")
    public SearchPage assertAmount(String amount) {
        $$("[data-ftid='bull_price']").contains(amount);
        return this;
    }

    @Step("Set transmission")
    public SearchPage setTransmission(String transmission) {
        $$("[data-ftid='component_select_button']").findBy(Condition.text("КПП"))
                .click();
        $$("[data-ftid='component_select_dropdown']").findBy(Condition.text(transmission)).click();
        return this;
    }

    @Step("Assert transmission")
    public SearchPage assertTransmossion(String transmission) {
        $$("[data-ftid='component_inline-bull-description']").contains(transmission);
        return this;
    }

    @Step("Open the first ad")
    public SearchPage openFirstAd() {
        $$(".css-17lk78h.e3f4v4l2").first().click();
        return this;
    }
}
