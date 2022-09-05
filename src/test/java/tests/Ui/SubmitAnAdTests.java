package tests.Ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Submit an ad tests")
public class SubmitAnAdTests extends TestBase {

    @Test
    @DisplayName("A message about the absence of a number")
    @Tag("ui")
    void notMobile() {
        searchPage.openPage();
        submitAnAdPage.openAnAd()
                .setVIN(dataTest.vin)
                .submit()
                .setMileage(dataTest.mileage)
                .setPrice(dataTest.price)
                .clickSubmit()
                .assertMessageAbsenceNumber();
    }

    @Test
    @DisplayName("A message about the absence of a price")
    @Tag("ui")
    void notPrice() {
        searchPage.openPage();
        submitAnAdPage.openAnAd()
                .setVIN(dataTest.vin)
                .submit()
                .setMileage(dataTest.mileage)
                .setNumber(dataTest.number)
                .clickSubmit()
                .assertMessageAbsencePrice();
    }
}
