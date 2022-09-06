package tests.Web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Раздел 'Каталог'")
public class CatalogTests extends TestBase {


    @Test
    @DisplayName("Проверка наличия выбранной модели в определенном каталоге")
    @Tag("ui")
    void checkQ8InCatalog() {
        catalogPage.openCatalog()
                .openAutoTheCatalog(dataTest.brand)
                .assertAvailabilityModel(dataTest.model);
    }

    @Test
    @DisplayName("Проверка наличия отзывов для выбранной марки и модели авто в каталоге")
    @Tag("ui")
    void checkReviewsForKiaK5() {
        catalogPage.openCatalog()
                .openTheCatalogBrandAuto("Kia")
                .openKiaK5()
                .assertReviewsForKiaK5();
    }
}
