package org.lesson16;

import org.testng.annotations.DataProvider;

public class BrowserDataProvider {
    @DataProvider(name = "browser")
    public static Object[][] dataProvider() {
        return new Object[][] { { "chrome" }, { "firefox" } };
    }
}

