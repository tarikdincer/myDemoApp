package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testEqual() {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("computer", "shoes", "hair", "comb"));
        ArrayList<String> array2 = new ArrayList<>(Arrays.asList("counter", "jack", "man", "rose"));
        assertTrue(new App().isEqualLength(array,array2,2,3));
        }

    public void testNotEqual() {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("computer", "shoes", "hair", "comb"));
        ArrayList<String> array2 = new ArrayList<>(Arrays.asList("counter", "jack", "man", "rose"));
        assertFalse(new App().isEqualLength(array,array2,1,1));
        }

    public void testEmptyArrayList() {
        ArrayList<String> array = new ArrayList<>(Arrays.asList());
        ArrayList<String> array2 = new ArrayList<>(Arrays.asList("counter", "jack", "man", "rose"));
        assertFalse(new App().isEqualLength(array,array2,2,3));
        }

    public void testOutOfSize() {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("computer", "shoes", "hair", "comb"));
        ArrayList<String> array2 = new ArrayList<>(Arrays.asList("counter", "jack", "man", "rose"));
        assertFalse(new App().isEqualLength(array,array2,2,5));
        }
}
