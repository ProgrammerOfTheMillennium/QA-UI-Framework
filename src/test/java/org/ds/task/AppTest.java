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

//        Browser.

    }

    @Test
    public static void shouldGoToTheHomePage() {
        HomePage page = Framework.HomePage();
        page.navigateToHome();

        Assert.assertTrue(page.isAt());
    }

    @Test
    public static void shouldGoToTheLoginPage() {
        LoginPage page = Framework.LoginPage();
        page.navigateTo("https://github.com/login");

        Assert.assertTrue(page.isAt());
    }

//    @Test
//    public static void shouldLogout() {
//        HomePage page = Framework.HomePage();
//        page.navigateToLoginPage();
//
//        Assert.assertTrue(page.LogOutPage().isAt());
//    }

    @AfterMethod
    public static void tearDown() {
        Browser.close();
    }
}













