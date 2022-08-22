package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AuthPage;
import pages.SearchPage;

public class SearchTests extends TestBase {
    AuthPage auth = new AuthPage();
    SearchPage search = new SearchPage();

    @Test
    @DisplayName("Search for BMW brand cars by an authorized user")
    @Tag("UI")
    void SearchBMWTestUI() {
        auth.openPage()
                .authUI()
                .assertAuthUI();
        search.openSearchForAds()
                .setBrand("BMW")
                .clickShow()
                .assertSearchBrand("BMW");
    }
}
