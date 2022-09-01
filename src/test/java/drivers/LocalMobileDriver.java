package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.LocalConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static org.apache.commons.io.FileUtils.copyInputStreamToFile;

public class LocalMobileDriver implements WebDriverProvider {

    public static URL getAppiumSeverUrl() {
        try {
            return new URL("http://localhost:4723/wd/hub/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        LocalConfig config = ConfigFactory.create(LocalConfig.class, System.getProperties());
        String platformName = config.platformNameEm();
        String deviceName = config.deviceNameEm();
        String osVersion = config.osVersionEm();

        File app = getApp();
        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setPlatformName(platformName);
        options.setDeviceName(deviceName);
        options.setPlatformVersion(osVersion);
        options.setApp(app.getAbsolutePath());
        options.setAppPackage("ru.farpost.dromfilter");
        options.setAppActivity("ru.farpost.dromfilter.app.ui.main.MainActivity");

        return new AndroidDriver(getAppiumSeverUrl(), options);
    }
    private File getApp() {
        String appUrl = "https://trashbox.ru/files30/1678704/ru.farpost.dromfilter_5.16.0_781.apk/";
        String appPath = "src/test/resources/apps/ru.farpost.dromfilter_5.16.0_781.apk";
        File app = new File(appPath);
        if (!app.exists()) {
            try (InputStream in = new URL(appUrl).openStream()) {
                copyInputStreamToFile(in, app);
            } catch (IOException e) {
                throw new AssertionError("Failed to download a", e);
            }
        }
        return app;
    }
}


