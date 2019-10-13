package org.ds.task.framework.pages;

import org.ds.task.framework.Browser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends Page {
    private final String homeURL = "https://github.com";
    private final String homePageTitle = "Built for developers";

    @FindBy(xpath = "//main/div/div/div/div/h1") //yeap, not a nice selector :)
    WebElement pageTitle;

    @FindBy(css = "a[href='/login']")
    WebElement loginPageLink;


    public HomePage() {
        super();
    }

    public void navigateToHome() {
        browser.navigateTo(homeURL);
    }

    public boolean isAt() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return homePageTitle.equals(pageTitle.getText());
    }

    public void navigateToLoginPage() {
        loginPageLink.click();
    }

    public Browser getBrowser() {
        return browser;
    }
}
