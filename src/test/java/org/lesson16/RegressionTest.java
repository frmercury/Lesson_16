package org.lesson16;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegressionTest {


    @Test(groups = "dev")
    public void initialTest(){
        System.out.println("regression test DEV");
    }
    @Test(groups = "uat")
    public void initialTest1(){
        System.out.println("regression test UAT");
    }
    @Test(groups = "prod", dataProvider = "browser", dataProviderClass = BrowserDataProvider.class)
    public void initialTest2(String data){
        System.out.println("Regression PROD " + data);
    }
}
