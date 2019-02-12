package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class Probl6Test {

    Probl6 app;
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
        app=new Probl6();
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
        String expectedValue="capital letter";

        //Act
        String actualValue=app.check('A');
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);
        System.out.println("Test1");
    }



}

