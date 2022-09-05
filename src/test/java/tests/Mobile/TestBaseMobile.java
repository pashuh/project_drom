package tests.Mobile;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import drivers.BrowserstackMobileDriver;
import drivers.LocalMobileDriver;
import drivers.RealDriver;
import helpers.AttachForMobile;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static io.qameta.allure.Allure.step;
import static helpers.AttachForMobile.sessionId;

public class TestBaseMobile {
    static String deviceHost = System.getProperty("deviceHost", "local");

    @BeforeAll
    public static void setup() {
        switch (deviceHost) {
            case "browserstack":
                Configuration.browser = BrowserstackMobileDriver.class.getName();
                break;
            case "realDevice":
                Configuration.browser = RealDriver.class.getName();
                break;
            case ("local"):
            default:
                Configuration.browser = LocalMobileDriver.class.getName();
                break;
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = sessionId();

        AttachForMobile.screenshotAs("Last screenshot");
        AttachForMobile.pageSource();
        step("Close driver", Selenide::closeWebDriver);

        if (deviceHost.equals("browserstack")) {
            AttachForMobile.video(sessionId);
        }
    }
}