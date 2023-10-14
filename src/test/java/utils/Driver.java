package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {

    private static UiAutomator2Options options;
    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {

        if (driver == null) {
            switch (ConfigReader.getProperty("platformName")) {
                case "Android":
                    options = new UiAutomator2Options();
                    options.setAppPackage("com.pozitron.hepsiburada");
                    options.setAppActivity("com.hepsiburada.ui.startup.SplashActivity");
                    options.setUdid("emulator-5554");
                    options.setNoReset(false);
                    options.setNewCommandTimeout(Duration.ofMinutes(19));
                    break;

                case "ios":
                    break;
                default:
                    throw new RuntimeException("Desteklenmeyen platform: " + ConfigReader.getProperty("platformName"));
            }

            try {
                driver = new AppiumDriver(new URL("http://127.0.0.1:4723"), options);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        }
        return driver;

//
//        public static void quitAppiumDriver () {
//            if (appiumDriver != null) {
//                appiumDriver.quit();
//                appiumDriver = null;
//            }
//        }
    }
}

