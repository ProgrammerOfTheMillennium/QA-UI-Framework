package org.ds.task.framework.pages;

import org.ds.task.framework.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends Page {
    private final String logoutPageTitle = "Sign up for GitHub";

    @FindBy(css = "form > button[type='submit']")
    WebElement pageTitle;

    @FindBy(css = "summary[aria-label='View profile and more']")
    WebElement profileMenuButton;

    @FindBy(css = "button[class='dropdown-item dropdown-signout']")
    WebElement logoutButton;


    public void navigateTo(String URL) {
        browser.navigateTo(URL);
    }

    public boolean isAt() {
        Browser.turnOnWait();

        return logoutPageTitle.equals(pageTitle.getText());
    }

    public Browser getBrowser() {
        return browser;
    }

    public void unauthorize() {
        Browser.turnOnWait();

        profileMenuButton.click();
        logoutButton.click();
    }

    public boolean isUnauthorized() {
        Browser.turnOnWait();

        return logoutPageTitle.equals(pageTitle.getText());
    }
}