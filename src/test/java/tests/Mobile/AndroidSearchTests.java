package tests.Mobile;

import com.codeborne.selenide.Condition;
import config.DataUserConfig;
import io.appium.java_client.AppiumBy;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@DisplayName("Мобильные тесты")
public class AndroidSearchTests extends TestBaseMobile {
    DataUserConfig config = ConfigFactory.create(DataUserConfig.class, System.getProperties());


    @Test
    @DisplayName("Проверка авторизации")
    @Tag("mobile")
    void authTestMob() {
        step("Click login and registration", () -> {
            $(AppiumBy.id("ru.farpost.dromfilter:id/later_button")).click();
            $(AppiumBy.id("sign")).shouldHave(Condition.text("Телефон"));
        });
        step("Set login", () -> {
            $(AppiumBy.id("sign")).setValue(config.login());
        });
        step("Set password", () -> {
            $(AppiumBy.id("password")).setValue(config.password());
        });
        step("Click open", () -> {
            $(AppiumBy.id("signbutton")).click();
        });
        step("Click menu", () -> {
            $(AppiumBy.id("ru.farpost.dromfilter:id/menu_page")).click();
        });
        step("Login verification", () -> {
            $(AppiumBy.id("ru.farpost.dromfilter:id/main_text_view")).shouldHave(Condition.text("Evn627"));
        });
    }

    @DisplayName("Проверка поиска авто по выбранному бренду")
    @Test
    @Tag("mobile")
    void searchTestMob() {
        step("Skip authorization", () -> {
            $(AppiumBy.id("ru.farpost.dromfilter:id/later_button")).click();
        });
        step("Choosing a car brand", () -> {
            $(AppiumBy.id("ru.farpost.dromfilter:id/search_empty_firm")).click();
        });
        step("Choose Audi", () -> {
            $$(AppiumBy.id("ru.farpost.dromfilter:id/label")).findBy(Condition.text("Audi")).click();
        });
        step("Click show auto", () -> {
            $(AppiumBy.id("ru.farpost.dromfilter:id/show_button_root")).click();
        });
        step("We check that the found Audi car", () -> {
            $(AppiumBy.id("ru.farpost.dromfilter:id/bulletin")).shouldHave(Condition.text("Audi"));
        });
    }

    @DisplayName("Проверка возможности добавления авто в раздел 'Избранное'")
    @Test
    @Tag("mobile")
    void addAutoToFavoritesTestMob() {
        step("Skip authorization", () -> {
            $(AppiumBy.id("ru.farpost.dromfilter:id/later_button")).click();
        });
        step("Open the first car from the recommendation", () -> {
            $$(AppiumBy.id("ru.farpost.dromfilter:id/card_container")).first().click();
        });
        step("Add to Favorites", () -> {
            $(AppiumBy.id("ru.farpost.dromfilter:id/tv_add_fav")).click();
        });
        step("Checking the notification about adding to favorites", () -> {
            $(AppiumBy.id("ru.farpost.dromfilter:id/snackbar_text")).shouldHave(Condition.text("Добавлено в избранное"));
        });
    }
}
