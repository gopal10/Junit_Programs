package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseTest {


    Reverse app;
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
        app=new Reverse();
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
        String expectedValue="nodnol";

        //Act
        String actualValue=app.check("london");
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);
        System.out.println("Test1");
    }



}