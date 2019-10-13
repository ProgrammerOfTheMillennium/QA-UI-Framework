package org.ds.task.framework;

import org.ds.task.framework.pages.HomePage;
import org.ds.task.framework.pages.LoginPage;
import org.ds.task.framework.pages.LogoutPage;
import org.openqa.selenium.support.PageFactory;


public final class Framework {
    public static HomePage HomePage() {
        HomePage home = new HomePage();
        PageFactory.initElements(home.getBrowser().get(), home);

        return home;
    }

    public static LoginPage LoginPage() {
        LoginPage login = new LoginPage();
        PageFactory.initElements(login.getBrowser().get(), login);

        return login;
    }

    public static LogoutPage LogoutPage() {
        LogoutPage logout = new LogoutPage();
        PageFactory.initElements(logout.getBrowser().get(), logout);

        return logout;
    }
}

