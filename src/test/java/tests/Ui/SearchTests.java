package tests.Ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SearchTests extends TestBase {

    @Test
    @DisplayName("Search for BMW brand cars by an authorized User")
    @Tag("UI")
    public void searchBMWTestUI() {
        auth.openPageDrom()
                .authUI()
                .assertAuthUI();
        searchPage.openSearchForAds()
                .setBrand("BMW")
                .clickShow()
                .assertSearchBrand("BMW");
    }
    @Test
    @DisplayName("Search by amount by Authorized User")
    @Tag("UI")
    public void searchByAmountTestUI() {
        auth.openPageDrom()
                .authUI()
                .assertAuthUI();
        searchPage.openSearchForAds()
                .setAmount("1000000")
                .clickShow()
                .assertAmount("1 000 000");
    }

    @Test
    @DisplayName("Search for cars with automatic transmission and brand")
    @Tag("UI")
    public void searchCarsWithAutomaticTransmission() {
        searchPage.openPageDrom()
                .openSearchForAds()
                .setTransmission("АКПП")
                .setBrand("AUDI")
                .clickShow()
                .assertSearchBrand("AUDI")
                .assertTransmossion("АКПП");
    }
}
