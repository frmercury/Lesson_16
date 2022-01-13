package org.lesson16;

import org.testng.annotations.*;

public class SmokeTest {
    @BeforeSuite
    public void beforeSuite (){
        System.out.println("before suite");
    }

    @BeforeTest
    public void beforeTest (){
        System.out.println("before Test");
    }

    @BeforeClass
    public void beforeClass (){
        System.out.println("before class");
    }

    @BeforeGroups
    public void beforeGroupsM() {
        System.out.println("before groups");
    }

    @BeforeMethod
    public void beforeMethodPrecondition(){
        System.out.println("precondition");
    }

    @Test(groups = "dev")
    public void initialTest(){
        System.out.println("smoke test DEV");
    }
    @Test(groups = "uat")
    public void initialTest1(){
        System.out.println("smoke test UAT");
    }
    @Test(groups = "prod", dataProvider = "browser", dataProviderClass = BrowserDataProvider.class)
    public void initialTest2(String data){
        System.out.println("Smoke PROD " + data);

    }

    @AfterMethod
    public void afterMethodPostCond() {
        System.out.println("afterCondition\n");
    }

    @AfterGroups
    public void afterGroupsM() {
        System.out.println("after groups");
    }

    @AfterClass
    public void afterClass (){
        System.out.println("after class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }

}

