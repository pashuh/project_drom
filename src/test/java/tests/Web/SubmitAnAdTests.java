package tests.Web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Публикация объявления")
public class SubmitAnAdTests extends TestBase {

    @Test
    @DisplayName("Проверка сообщения об отсутствии номера при заполнении объявления")
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
    @DisplayName("Проверка сообщения об отсутствии стоимости при заполнении объявления")
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
