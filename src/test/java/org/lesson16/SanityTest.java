package org.lesson16;

import org.testng.annotations.Test;

public class SanityTest {
    @Test(groups = "dev")
    public void initialTest(){
        System.out.println("sanity test DEV");
    }
    @Test(groups = "uat")
    public void initialTest1(){
        System.out.println("sanity test UAT");
    }
    @Test(groups = "prod")
    public void initialTest2(){
        System.out.println("sanity test PROD");
    }
}
