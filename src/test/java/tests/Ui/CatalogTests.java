package tests.Ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Catalog tests")
public class CatalogTests extends TestBase {


    @Test
    @DisplayName("Availability of the Q8 model in the AUDI catalog")
    @Tag("ui")
    void checkQ8InCatalog() {
        catalogPage.openCatalog()
                .openAutoTheCatalog(dataTest.brand)
                .assertAvailabilityModel(dataTest.model);
    }

    @Test
    @DisplayName("Availability of reviews for KIA K5")
    @Tag("ui")
    void checkReviewsForKiaK5() {
        catalogPage.openCatalog()
                .openTheCatalogBrandAuto("Kia")
                .openKiaK5()
                .assertReviewsForKiaK5();
    }
}
