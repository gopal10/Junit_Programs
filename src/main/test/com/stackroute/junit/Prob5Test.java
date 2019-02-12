package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class Prob5Test {
    Prob5 app;
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
        app=new Prob5();
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
            long expectedValue=41;

            //Act
            long actualValue=app.check("12 23 2 4");
            //Assert
            assertEquals(expectedValue, actualValue);

            assertNotNull(actualValue);
            System.out.println("Test2");
        }



}