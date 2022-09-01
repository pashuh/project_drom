package tests.Ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CatalogTests extends TestBase {


    @Test
    @DisplayName("Availability of the Q8 model in the AUDI catalog")
    @Tag("UI")
    void checkQ8InCatalog() {
        catalogPage.openCatalog()
                .openAutoTheCatalog(dataTestPage.brand())
                .assertAvailabilityModel(dataTestPage.model());
    }

    @Test
    @DisplayName("Availability of reviews for KIA K5")
    @Tag("UI")
    void checkReviewsForKiaK5() {
        catalogPage.openCatalog()
                .openKiaTheCatalog()
                .openKiaK5()
                .assertReviewsForKiaK5();
    }
}
