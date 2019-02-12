package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class Prob7Test {


    Prob7 app;
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
        app=new Prob7();
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
        String expectedValue="12345";
        int a[]={5,4,3,2,1};
        //Act
        String actualValue=app.checkRes(a);
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);
        System.out.println("Test1");
    }

}

