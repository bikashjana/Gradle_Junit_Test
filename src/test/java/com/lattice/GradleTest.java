package com.lattice;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class GradleTest extends TestCase {
    
    public GradleTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( GradleTest.class );
    }

   
    public void testApp()
    {
        assertTrue( true );
    }
}