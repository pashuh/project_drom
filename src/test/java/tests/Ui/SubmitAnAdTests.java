package tests.Ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SubmitAnAdTests extends TestBase {

    @Test
    @DisplayName("A message about the absence of a number")
    @Tag("UI")
    void notMobile() {
        searchPage.openPageDrom();
        submitAnAdPage.openAnAd()
                .setVIN(dataTestPage.vin())
                .submit()
                .setMileage(dataTestPage.mileage())
                .setPrice(dataTestPage.price())
                .clickSubmit()
                .assertMessageAbsenceNumber();
    }

    @Test
    @DisplayName("A message about the absence of a price")
    @Tag("UI")
    void notPrice() {
        searchPage.openPageDrom();
        submitAnAdPage.openAnAd()
                .setVIN(dataTestPage.vin())
                .submit()
                .setMileage(dataTestPage.mileage())
                .setNumber(dataTestPage.number())
                .clickSubmit()
                .assertMessageAbsencePrice();
    }
}
