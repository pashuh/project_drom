package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.*;

public class CatalogPage {
    @Step("Open catalog")
    public CatalogPage openCatalog() {
        open("https://www.drom.ru/catalog/");
        return this;
    }
    @Step("Open the catalog auto")
    public CatalogPage openAutoTheCatalog(String brand) {
        $$(".css-1q66we5.e4ojbx43").findBy(Condition.text(brand))
                .click();
        return this;
    }

    @Step("Checking the availability of the Q8 model")
    public CatalogPage assertAvailabilityModel(String model) {
        $$("[data-ftid='component_cars-list']").findBy(Condition.text(model))
                .isDisplayed();
        return this;
    }

    @Step("Open the catalog Kia")
    public CatalogPage openKiaTheCatalog() {
        $$(".css-1q66we5.e4ojbx43").findBy(Condition.text("Kia"))
                .click();
        return this;
    }

    @Step("Open the catalog Kia K5")
    public CatalogPage openKiaK5() {
        $("[href='https://www.drom.ru/catalog/kia/k5/']").click();
        return this;
    }

    @Step("Checking for reviews for KIA K5")
    public CatalogPage assertReviewsForKiaK5() {
        $$("[data-ftid='component_review_image']").shouldHave(CollectionCondition.size(4));
        return this;
    }
}
