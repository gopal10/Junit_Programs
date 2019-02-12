package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class TomJerryTest {


    TomJerry app;
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
        app=new TomJerry();
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
        String expectedValue="Tom";

        //Act
        String actualValue=app.check(21);
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);
        System.out.println("Test 1");
    }


    @Test
    public void test2()
    {
        //Arrange
        String expectedValue="Jerry";

        //Act
        String actualValue=app.check(26);
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);
        System.out.println("Test 2");
    }
}