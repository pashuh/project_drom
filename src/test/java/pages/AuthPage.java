package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import org.apiguardian.api.API;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.Selenide.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthPage {
    DataTestPage data = new DataTestPage();

    @Step("Open base url Drom")
    public AuthPage openPage() {
        open("https://www.drom.ru/");
        return null;
    }

    @Step("User authorization")
    public AuthPage authUI() {
        $(".css-16566ot.e173iafn0").click();
        $("#sign").setValue(data.login());
        $("#password").setValue(data.password());
        $("#signbutton").submit();
//        sleep(5000);
        return null;
    }
    @Step("authorization verification")
    public AuthPage assertAuthUI() {
        $(".css-ldiqma.e420bip0").shouldHave(Condition.visible);
        return this;
    }


}
