package com.blogpost.helloworldmaven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gary A. Stafford
 */
public class HelloWorldResourceTest {

    HelloWorldResource helloWorldResource = new HelloWorldResource();

    public HelloWorldResourceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getXml method, of class HelloWorldResource.
     */
    @Test
    public void testGetXml() throws Exception {
        System.out.println("getXml");
        String result = helloWorldResource.getXml();
        assertNotNull(result);
    }

    /**
     * Test of putXml method, of class HelloWorldResource.
     */
    @Test
    public void testPutXml() throws Exception {
        System.out.println("putXml");
        String expResult = "<html><body><h1>Hello Test Value!</h1></body></html>";
        helloWorldResource.putXml("Test Value");
        String result = helloWorldResource.getXml();
        assertEquals(expResult, result);
    }
}