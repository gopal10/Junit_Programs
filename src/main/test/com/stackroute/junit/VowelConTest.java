package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelConTest {

    VowelCon app;
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
        app=new VowelCon();
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
        String expectedValue="vowel";

        //Act
        String actualValue=app.checkVowel("a");
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);
        System.out.println("Test 1");
    }

    @Test
    public void test2()
    {
        //Arrange
        String expectedValue="consonent";

        //Act
        String actualValue=app.checkVowel("b");
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);
        System.out.println("Test 2");
    }

    @Test
    public void test3()
    {
        //Arrange
        String expectedValue="vowel consonent";

        //Act
        String actualValue=app.checkVowel("ab");
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);
        System.out.println("Test 2");
    }

}