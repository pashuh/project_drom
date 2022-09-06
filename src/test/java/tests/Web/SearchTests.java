package tests.Web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Search tests")
public class SearchTests extends TestBase {

    @Test
    @DisplayName("Search for BMW brand cars")
    @Tag("ui")
    public void searchBMWTestUI() {
        searchPage.openPage()
                .openSearchForAds()
                .setBrand("BMW")
                .clickShow()
                .assertSearchBrand("BMW");
    }

    @Test
    @DisplayName("Search by amount")
    @Tag("ui")
    public void searchByAmountTestUI() {
        searchPage.openPage()
                .openSearchForAds()
                .setAmount("1000000")
                .clickShow()
                .assertAmount("1 000 000");
    }

    @Test
    @DisplayName("Search for cars with automatic transmission and brand")
    @Tag("ui")
    public void searchCarsWithAutomaticTransmission() {
        searchPage.openPage()
                .openSearchForAds()
                .setTransmission("АКПП")
                .setBrand("AUDI")
                .clickShow()
                .assertSearchBrand("AUDI")
                .assertTransmossion("АКПП");
    }
}
