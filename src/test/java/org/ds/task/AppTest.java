package org.ds.task;

/**
 * Created by Bulat Latypov.
 *
 * At LoginPage.java add your GitHub credentials - at line 39 and 40
 *
 * 39        login.sendKeys("");
 * 40        password.sendKeys("");
 *
 */

import org.ds.task.framework.Browser;
import org.ds.task.framework.Framework;
import org.ds.task.framework.pages.HomePage;
import org.ds.task.framework.pages.LoginPage;

import org.ds.task.framework.pages.LogoutPage;
import org.testng.Assert;
import org.testng.annotations.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class AppTest {
    private static final Logger logger = LogManager.getLogger(AppTest.class);

    @BeforeMethod
    public void setup() {
        logger.info("Entering QA Automation Framework.");
        logger.info("Tests are implemented with DSL paradigme (Domain Specific Language).");
        logger.info("The framework will test basic smoke test on GitHub web page.");

        Browser.initialize();
    }

    @Test
    public static void shouldGoToTheHomePage() {
        HomePage page = Framework.HomePage();
        page.navigateToHome();

        Assert.assertTrue(page.isAt());
    }

    @Test
    public static void shouldGoToTheLoginPage() {
        HomePage home = Framework.HomePage();
        home.navigateToHome();
        home.navigateToLoginPage();

        LoginPage login = Framework.LoginPage();

        Assert.assertTrue(login.isAt());
    }

    @Test
    public static void shouldLoginToTheAccount() {
        HomePage home = Framework.HomePage();
        home.navigateToHome();
        home.navigateToLoginPage();

        LoginPage login = Framework.LoginPage();
        login.authorize();

        Assert.assertTrue(login.isAuthorized());
    }

    @Test
    public static void shouldLogout() {
        HomePage home = Framework.HomePage();
        home.navigateToHome();
        home.navigateToLoginPage();

        LoginPage login = Framework.LoginPage();
        login.authorize();

        LogoutPage logout = Framework.LogoutPage();
        logout.unauthorize();

        Assert.assertTrue(logout.isUnauthorized());
    }

    @AfterMethod
    public static void tearDown() {
        Browser.get().close();
        Browser.get().quit();
    }
}













