package org.ds.task.framework.pages;

import org.ds.task.framework.Browser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {
    private final String loginPageTitle = "Sign in to GitHub";
    private final String logedPageTitle = "Explore repositories";

    @FindBy(xpath = "//main/div/form/div/h1")
    WebElement pageTitle;

    @FindBy(css = "input[name='login']")
    WebElement login;

    @FindBy(css = "input[name='password']")
    WebElement password;

    @FindBy(css = "input[type='submit']")
    WebElement button;

    @FindBy(css = "h2[class='f5 text-bold mb-1']")
    WebElement logedTitle;

    public LoginPage() {
        super();
    }


    public void navigateTo(String URL) {
        browser.navigateTo(URL);
    }



    public void authorize() {
        login.sendKeys("");
        password.sendKeys("");

        button.click();
    }

    public Browser getBrowser() {
        return browser;
    }

    public boolean isAuthorized() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return logedPageTitle.equals(logedTitle.getText());
    }

    public boolean isAt() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return loginPageTitle.equals(pageTitle.getText());
    }
}
