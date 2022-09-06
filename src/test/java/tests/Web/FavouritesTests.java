package tests.Web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Favourites tests")
public class FavouritesTests extends TestBase {


    @Test
    @DisplayName("Adding cars to favorites")
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
    @DisplayName("Deleting an ad from favorites")
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
