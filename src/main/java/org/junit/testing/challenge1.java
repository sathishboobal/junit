package org.junit.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.annotations.VisibleForTesting;

public class challenge1 {
    @Test
	public void test1() {
		System.out.println("testing 1");
	}
    @After
    public void EndDate() {
	System.out.println("end Date");

	}
    @AfterClass
    public static void closeTheBrowser() {
	System.out.println("closeTheBrowser");	
	}
    @BeforeClass
    public static void LaunchTheBrowser() {
		System.out.println("launchtheBrowser");

	}
    
	@Test
	public void test3() {
	System.out.println("testing 3");	
    }
	
	@Before
	public void startDate() {
   System.out.println("start Date");		

	}
    @Test
    public void test2() {
    	System.out.println("test 2");
    }
	
	
}
