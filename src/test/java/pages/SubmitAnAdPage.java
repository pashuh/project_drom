package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SubmitAnAdPage {
    @Step("Open an ad")
    public SubmitAnAdPage openAnAd() {
        $("[data-ftid='component_header_add-bull']").click();
        return this;
    }

    @Step("Set VIN")
    public SubmitAnAdPage setVIN(String vin) {
        $("[placeholder='Введите VIN/номер кузова']").setValue(vin);
        return this;
    }

    @Step("Click submit")
    public SubmitAnAdPage submit() {
        $("[type=submit]").click();
        return this;
    }

    @Step("Set mileage")
    public SubmitAnAdPage setMileage(String mileage) {
        $("[data-ftid='add_form_mileage']").setValue(mileage);
        return this;
    }

    @Step("Set price")
    public SubmitAnAdPage setPrice(Integer price) {
        $("[data-ftid='add_form_price']").setValue(String.valueOf(price));
        return this;
    }

    @Step("Click submit")
    public SubmitAnAdPage clickSubmit() {
        $("[type='submit']").click();
        return this;
    }

    @Step("Checking the message about the absence of a number")
    public SubmitAnAdPage assertMessageAbsenceNumber() {
        $("#phone1 [aria-invalid='true']").isDisplayed();
        return this;
    }

    @Step("Set number")
    public SubmitAnAdPage setNumber(String number) {
        $("#phone1").setValue(number);
        return this;
    }

    @Step("Checking the message about the absence of a price")
    public SubmitAnAdPage assertMessageAbsencePrice() {
        $("[data-ftid='error_message']").shouldHave(Condition.text("Не указана цена"));
        return this;
    }
}
