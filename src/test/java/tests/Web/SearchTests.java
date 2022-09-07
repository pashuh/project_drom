package tests.Web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Поиск объявлений")
public class SearchTests extends TestBase {

    @Test
    @DisplayName("Проверка поиска авто по бренду")
    @Tag("ui")
    public void searchBMWTestUI() {
        searchPage.openPage()
                .openSearchForAds()
                .setBrand("BMW")
                .clickShow()
                .assertSearchBrand("BMW");
    }

    @Test
    @DisplayName("Проверка поиска авто по стоимости")
    @Tag("ui")
    public void searchByAmountTestUI() {
        searchPage.openPage()
                .openSearchForAds()
                .setAmount("1000000")
                .clickShow()
                .assertAmount("1 000 000");
    }

    @Test
    @DisplayName("Проверка поиска авто по параметрам: бренд, автоматическая трансмиссия")
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
