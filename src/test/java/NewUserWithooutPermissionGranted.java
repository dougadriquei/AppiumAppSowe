import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class NewUserWithooutPermissionGranted {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "3300d94375582437");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        // desiredCapabilities.setCapability("appPackage", "io.platformbuilders.challenge.qa");
        // desiredCapabilities.setCapability("appActivity", "host.exp.exponent.MainActivity");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\dev-pessoal\\AppiumAppSowe\\src\\test\\java\\resources\\challenge-qa.apk");
        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void registerUserWithoutGeolocationPermission() {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Cadastrar");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("insira o numero de celular");
        el2.sendKeys("15991185772");
        driver.pressKeyCode(AndroidKeyCode.ENTER);
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Botao Avancar");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Insira o nome completo");
        el4.sendKeys("Douglas Adriano Queiroz");
        driver.pressKeyCode(AndroidKeyCode.ENTER);
        MobileElement el5 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Botao Avancar\"]/android.widget.TextView");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"LOCALIZAÇÃO AUTOMÁTICA\"]/android.widget.TextView");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Não\"]/android.widget.TextView");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Localização");
        assertEquals(el8.getAttribute("text"), "Localização");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
