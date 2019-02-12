package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class Prob4Test {

    Prob4 app;
    @BeforeClass
    public static void setUpOnce(){
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce(){
        System.out.println("Inside teardown once");

    }
    @Before
    public void setUp(){
        System.out.println("object created");
        app=new Prob4();
    }

    @After
    public void tearDown(){
        System.out.println("object destroyed");
        app=null;
    }

    @Test
    public void test()
    {
        //Arrange
        String expectedValue="122333";

        //Act
        String actualValue=app.dis(3);
        //Assert


        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);
        System.out.println("Test 1");
    }


}

