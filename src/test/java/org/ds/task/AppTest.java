package org.ds.task;

import org.ds.task.framework.Browser;
import org.ds.task.framework.Framework;
import org.ds.task.framework.pages.HomePage;
import org.ds.task.framework.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class AppTest {
    private static final Logger logger = LogManager.getLogger(AppTest.class);

    @BeforeMethod
    public void setup() {
        logger.info("Entering QA Automation Framework.");

        Browser.initialize();
    }

    @Test
    public static void shouldGoToTheHomePage() {
        HomePage page = Framework.HomePage();
        ((HomePage)page).navigateToHome();

        Assert.assertTrue(((HomePage)page).isAt());
    }

    @Test
    public static void shouldGoToTheLoginPage() {
        HomePage home = Framework.HomePage();
        home.navigateToHome();
        home.navigateToLoginPage();

        LoginPage login = Framework.LoginPage();

        Assert.assertTrue(login.isAt());
    }

//    @Test
//    public static void shouldLoginToTheAccount() {
//        HomePage home = Framework.HomePage();
//        home.navigateToHome();
//        home.navigateToLoginPage();
//
//        LoginPage login = Framework.LoginPage();
//
//        Assert.assertTrue(login.isAt());
//    }

//    @Test
//    public static void shouldLogout() {
//        HomePage page = Framework.HomePage();
//        page.navigateToLoginPage();
//
//        Assert.assertTrue(page.LogOutPage().isAt());
//    }

    @AfterMethod
    public static void tearDown() {
        Browser.get().close();
        Browser.get().quit();
    }
}













