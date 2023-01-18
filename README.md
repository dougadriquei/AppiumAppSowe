<h1><p align="center">AppiumAppSowe 🌱🧩</p></h1>
<p align="center"><code><img height="20" src="https://www.svgrepo.com/show/353413/appium.svg"></code>
<code><img height="20" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg"></code>
<code><img height="20" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/android/android-original.svg"></code>
</p>

This is a simple project using Appium, Android, Java and JUNIT, automating interfaces of a weather forecast application.

## Features 💻

-   Android APK
-   Java (JDK 19.0.1)
-   Appium Server (1.7.2)
-   Appium Inspector (into appium server)
-   Appium (java client 4.1.2)
-   Junit (junit 4.12)
-   Maven (19)
-   IntelliJ Community


## Requirements only PLUG USB 📚

1. Install Appium server 1.7.2
2. Install Java (JDK 19.0.1)


The project is Java Maven Project and take a look at the pom.xml file, all dependencies are in their versions

## To Run 📚

1. Open Appium Server

2. Plug the usb into an android device

3. Change apk absolute path in "desiredCapabilities.setCapability(MobileCapabilityType.APP, "absolute-path\\src\\test\\java\\resources\\challenge-qa.apk")"
Ex: desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\dev-pessoal\\AppiumAppSowe\\src\\test\\java\\resources\\challenge-qa.apk");

4. Right-click on one of the tests in the "src\test\java" folder

5. Click on the "Run" option in IntelliJ

## Next Steps 📚

🔋 run on adb emulator

```
@Before
    public void setUp() throws MalformedURLException {
       desiredCapabilities.setCapability("appPackage", "io.platformbuilders.challenge.qa");
       desiredCapabilities.setCapability("appActivity", "host.exp.exponent.MainActivity");
       //desiredCapabilities.setCapability(MobileCapabilityType.APP, "absolut-path.apk");
   }
```


🪫 fix problem of build and connection on device
🪫 fix problem of build and connection on emulator
🪫 implement page objects and components
🪫 git actions
🪫 docker
🪫 sonar
🪫 upgrade libs
