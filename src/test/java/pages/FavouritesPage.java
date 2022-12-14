package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FavouritesPage {
    @Step("Add car in favourites")
    public FavouritesPage addFavorites() {
        $$(".css-19crd92.e162wx9x0").findBy(Condition.text("Добавить в избранное")).click();
        return this;
    }

    @Step("Checking adding to favorites")
    public FavouritesPage assertAddingToFavorites() {
        $("[data-ftid='component_notification_type_success']").shouldHave(Condition.text("Объявление добавлено в избранное"));
        return this;
    }

    @Step("Open favorites")
    public FavouritesPage openFavorites() {
        $("[data-ftid='component_notification_type_success']").$("[title='Перейти в раздел «Мое избранное»']").click();
        return this;
    }

    @Step("Delete an ad")
    public FavouritesPage deleteAnAd() {
        $(".removeBookmark").click();
        return this;
    }
}
