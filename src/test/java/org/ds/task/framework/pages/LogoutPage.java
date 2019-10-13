package org.ds.task.framework.pages;

import org.ds.task.framework.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends Page {
    Browser browser;

    protected final String logoutURL = "https://github.com";
    private final String loginPageTitle = "Sign in to GitHub";

    @FindBy(xpath = "//main/div/form/div/h1")
    WebElement pageTitle;

    public LogoutPage() {
        browser = new Browser();
    }

    public void navigateTo(String URL) {
        browser.navigateTo(URL);
    }

    public boolean isAt() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return loginPageTitle.equals(pageTitle.getText());
    }

    public Browser getBrowser() {
        return browser;
    }
}