package org.ds.task.framework;

import org.ds.task.framework.pages.HomePage;
import org.openqa.selenium.support.PageFactory;


public final class Pages {
    public static HomePage HomePage() {
        HomePage home = new HomePage();
        PageFactory.initElements(home.getBrowser().get(), home);

        return home;
    }
}

