package org.ds.task.framework.pages;

import org.ds.task.framework.Browser;

public class LoginPage {
    Browser browser;
    public final String URL = "https://github.com";

    public void navigateTo() {
        browser = new Browser();
        browser.navigateTo(URL);
    }

    public boolean isAt() {
        return true;
    }
}

