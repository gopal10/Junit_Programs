package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class Prob8Test {


    Prob8 app;
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
        app=new Prob8();
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
        String expectedValue="Congo...Guess is Correct";

        //Act
        String actualValue=app.check(20,50,10);
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);
        System.out.println("Test1");
    }



}

