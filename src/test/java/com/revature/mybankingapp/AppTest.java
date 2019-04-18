package com.revature.mybankingapp;

import com.revaure.mybankingapp.dao.UserDAO;
import com.revaure.mybankingapp.dao.UserDAOImpl;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    
    public void testUserDAOlogin()
    {
    	User loggedinuser = new User();
    	User test = new User();
		UserDAO userdao = new UserDAOImpl();
		
		loggedinuser = userdao.login("username1", "password1");
		
		Class aClass = loggedinuser.getClass();
    	
        assertTrue(aClass.isInstance(test));
    }
}
