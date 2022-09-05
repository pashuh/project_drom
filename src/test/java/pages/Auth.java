package pages;

import com.codeborne.selenide.Condition;
import config.DataUserConfig;
import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;
import tests.DataTest;

import static com.codeborne.selenide.Selenide.*;

public class Auth {
    DataUserConfig config = ConfigFactory.create(DataUserConfig.class, System.getProperties());

    DataTest dataTest = new DataTest();

    @Step("Open base url Drom")
    public Auth openPage() {
        open("");
        return this;
    }

    @Step("Open authorization")
    public Auth openAuthorezation() {
        $(".css-16566ot.e173iafn0").click();
        return this;
    }

    @Step("Set login")
    public Auth setLogin() {
        $("#sign").setValue(config.login());
        return this;
    }
    @Step("Set password")
    public Auth setPassword() {
        $("#password").setValue(config.password());
        return this;
    }

    @Step("Click submit")
    public Auth clickSubmit() {
        $("#signbutton").submit();
        return this;
    }

    @Step("authorization verification")
    public Auth assertAuthUI() {
//        $(".css-ldiqma.e420bip0").shouldHave(Condition.visible);
        $(".site-content-container").shouldHave((Condition.text("Подтверждение входа через SMS")));
        return this;
    }
}
