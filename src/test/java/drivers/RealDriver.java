package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.RealConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class RealDriver implements WebDriverProvider {

    @Override
    public WebDriver createDriver(Capabilities capabilities) {

        RealConfig config = ConfigFactory.create(RealConfig.class, System.getProperties());
        String platformName = config.platformName();
        String deviceName = config.deviceName();
        String osVersion = config.osVersion();

        File app = getApp();
        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setPlatformName(platformName);
        options.setDeviceName(deviceName);
        options.setPlatformVersion(osVersion);
        options.setApp(app.getAbsolutePath());
        options.setAppPackage("org.wikipedia.alpha");
        options.setAppActivity("org.wikipedia.main.MainActivity");

        return new AndroidDriver(getAppiumServerUrl(), options);
    }

    public static URL getAppiumServerUrl() {
        try {
            return new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private File getApp() {
//        String appUrl = "https://github.com/wikimedia/apps-android-wikipedia/" +
//                "releases/download/latest/app-alpha-universal-release.apk";
        String appPath = "src/test/resources/apps/app-alpha-universal-release.apk";

        File app = new File(appPath);
//        if (!app.exists()) {
//            try (InputStream in = new URL(appUrl).openStream()) {
//                copyInputStreamToFile(in, app);
//            } catch (IOException e) {
//                throw new AssertionError("Failed to download application", e);
//            }
//        }
        return app;
    }
}