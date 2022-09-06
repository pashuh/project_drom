package tests.Web;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;

import config.CredentialsConfig;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;
import tests.DataTest;


public class TestBase {
    static String host = System.getProperty("host", "remote");
    static CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);
    Auth auth = new Auth();
    CatalogPage catalogPage = new CatalogPage();
    DataTest dataTest = new DataTest();
    SearchPage searchPage = new SearchPage();
    FavouritesPage favouritesPage = new FavouritesPage();
    SubmitAnAdPage submitAnAdPage = new SubmitAnAdPage();



    @BeforeAll
    static void beForAll() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        Configuration.browserCapabilities = capabilities;
        Configuration.baseUrl = config.baseUrl();
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "100");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        if (host.equals("remote")) {
            String remoteDriverUrl = System.getProperty("remoteDriverUrl", config.remoteUrl());
            Configuration.remote = String.format(remoteDriverUrl);
        }

    }
    @BeforeEach
    public void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void afterEach() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWebDriver();
    }
}