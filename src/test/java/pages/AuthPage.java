package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthPage {
    DataTestPage data = new DataTestPage();

    @Step("Open base url Drom")
    public AuthPage openPageDrom() {
        open("https://www.drom.ru/");
        return this;
    }

    @Step("User authorization")
    public AuthPage authUI() {
        $(".css-16566ot.e173iafn0").click();
        $("#sign").setValue(data.login());
        $("#password").setValue(data.password());
        $("#signbutton").submit();
//        sleep(5000);
        return this;
    }
    @Step("authorization verification")
    public AuthPage assertAuthUI() {
        $(".css-ldiqma.e420bip0").shouldHave(Condition.visible);
        return this;
    }


}
