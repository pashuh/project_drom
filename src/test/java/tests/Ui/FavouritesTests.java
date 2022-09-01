package tests.Ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class FavouritesTests extends TestBase {


    @Test
    @DisplayName("Adding cars to favorites")
    @Tag("UI")
    void addInFavorites() {
        searchPage.openPageDrom()
                .openSearchForAds()
                .setBrand("AUDI")
                .clickShow()
                .openFirstAd();
        favouritesPage.addFavorites()
                .assertAddingToFavorites();
    }

    @Test
    @DisplayName("Deleting an ad from favorites")
    @Tag("UI")
    void deletingAdFromFavorites() {
        searchPage.openPageDrom()
                .openSearchForAds()
                .setBrand("AUDI")
                .clickShow()
                .openFirstAd();
        favouritesPage.addFavorites()
                .openFavorites()
                .deleteAnAd();
    }
}
