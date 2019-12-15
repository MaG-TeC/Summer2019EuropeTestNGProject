package com.cybertek.tests.day14_pom_tests;

import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;
public class PageSubtitleTest extends TestBase {

    /*Test case
    Open browser
    Login as a Driver
    Verify that page subtitle is Quick Launchpad
    Go to Activities -> Calendar Events
    verify that page subtitle is Calendar Events
    click create calendar events
    ..
    ..
    */

    @Test
    public void verifySubtitleTest(){
        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        loginPage.login(username,password);

        DashboardPage dashboardPage = new DashboardPage();

        //expected title
        String actualResult = dashboardPage.getPageSubTitle();
        //actual title from website
        String expectedResult = "Quick Launchpad";
        //verify titles are matching
        Assert.assertEquals(actualResult,expectedResult, "Verify subtitles");

        dashboardPage.navigateToModule("Activities", "Calendar Events");

        CreateCalendarEventsPage calendarEventsPage  = new CreateCalendarEventsPage();

       Assert.assertEquals(calendarEventsPage.getPageSubTitle(), "Calendar Events", "Verify subtitles");
    }
}
