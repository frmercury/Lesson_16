package org.lesson16;

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
    @Test(groups = "prod")
    public void initialTest2(){
        System.out.println("regression test PROD");
    }
}
