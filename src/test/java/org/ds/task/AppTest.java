package org.ds.task;

import org.ds.task.framework.Browser;
import org.ds.task.framework.Pages;
import org.ds.task.framework.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class AppTest {
    private static final Logger logger = LogManager.getLogger(AppTest.class);

    @BeforeTest
    public void setup() {
        logger.info("Entering application.");
    }

    @Test
    public static void shouldGoToTheHomePage() {
        HomePage page = Pages.HomePage();
        page.navigateTo();

        Assert.assertTrue(page.isAt());
    }

    @AfterTest
    public static void tearDown() {
        Browser.close();
    }
}













//    @Test
//    public static void shouldLogin() {
//        Assert.assertTrue(Pages.LoginPage().isAt());
//    }
//
//    @Test
//    public static void shouldLogout() {
//        Assert.assertTrue(Pages.LoginOut().isAt());
//    }
