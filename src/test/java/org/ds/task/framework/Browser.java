package org.ds.task.framework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public final class Browser {
    static WebDriver browser;

//    public static void initialize() {
    public Browser() {
        Class<? extends WebDriver> driverClass = ChromeDriver.class;
        WebDriverManager.getInstance(driverClass).setup();

        try {
            browser = driverClass.newInstance();
            browser.manage().window().maximize();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void navigateTo(String URL) {
        browser.navigate().to(URL);
    }

    public static void close() {
        browser.close();
    }

    public static WebDriver get() {
        return browser;
    }
}
