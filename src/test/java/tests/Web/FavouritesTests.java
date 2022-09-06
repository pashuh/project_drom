package tests.Web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Раздел 'Избранное'")
public class FavouritesTests extends TestBase {


    @Test
    @DisplayName("Проверка возможности добавления объявления в избранное")
    @Tag("ui")
    void addInFavorites() {
        searchPage.openPage()
                .openSearchForAds()
                .setBrand("AUDI")
                .clickShow()
                .openFirstAd();
        favouritesPage.addFavorites()
                .assertAddingToFavorites();
    }

    @Test
    @DisplayName("Проверка возможности удаления объявления из избранного")
    @Tag("ui")
    void deletingAdFromFavorites() {
        searchPage.openPage()
                .openSearchForAds()
                .setBrand("AUDI")
                .clickShow()
                .openFirstAd();
        favouritesPage.addFavorites()
                .openFavorites()
                .deleteAnAd();
    }
}
