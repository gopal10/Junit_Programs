package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class PalidromeTest {

    Palidrome app;
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
        app=new Palidrome();
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
        long expectedValue=131;

        //Act
        long actualValue=app.isPali(131);
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);
        System.out.println("Test 1");
    }

    @Test
    public void test2()
    {
        //Arrange
        long expectedValue=123454321;

        //Act
        long actualValue=app.isPali(123454321);
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);
        System.out.println("Test2");
    }
}