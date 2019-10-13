package org.ds.task.framework.pages;

import org.ds.task.framework.Browser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {
    Browser browser;
    private static String homeURL = "https://github.com";
    private static String homePageTitle = "Built for developers";

    @FindBy(xpath = "//main/div/div/div/div/h1")
    WebElement pageTitle;

//    @FindBy(xpath = "a[href=\"/login\"]")
    @FindBy(xpath = "(//header/div/div/div/a)[1]")
    WebElement loginPageLink;

    public HomePage() {
        browser = new Browser();
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
//        browser.get().navigate().to(loginPageLink.toString());
        loginPageLink.click();
    }

    public Browser getBrowser() {
        return browser;
    }
}
