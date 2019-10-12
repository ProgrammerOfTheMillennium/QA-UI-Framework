package org.ds.task.framework.pages;

import org.ds.task.framework.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {
    Browser browser;

    private static String URL = "https://github.com";
    private static String pageTitle = "Built for developers";

    @FindBy(xpath = "//main/div/div/div/div/h1")
    WebElement homePageTitle;

    public HomePage() {
        browser = new Browser();
    }

    public void navigateTo() {
        browser.navigateTo(URL);
    }

    public boolean isAt() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return pageTitle.equals(homePageTitle.getText());
    }

    public void navigateToLoginPage() {
    }

    public Browser getBrowser() {
        return browser;
    }
}
