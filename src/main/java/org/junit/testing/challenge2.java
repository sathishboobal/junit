package org.junit.testing;
import java.util.Date;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class challenge2 extends baseclass{
	@Test
	public void Tc1() {
		System.out.println("test case 1");
		launchUrl("https://en-gb.facebook.com/");
		String pagetitle = pagetitle();
		String pageUrl = pageUrl();
		fbloginpom f= new fbloginpom();
		passText("sathish@gmail.com", f.getEmail());
		Assert.assertTrue("check the page", pagetitle.contains("FaceBook"));
		passText("sathish", f.getPassword());
	}
	@Test
	public void Tc2() {
	System.out.println("test case 2");	
   launchUrl("https://accounts.google.com/");
	}
	@Test
	public void Tc3() {
		System.out.println("test case 3");
    launchUrl("https://inmakes.com/");
	}
	
	@Test
	public void Tc4() {
		System.out.println("test case 4");
    launchUrl("https://www.youtube.com/");
	}
	@AfterClass
	public static void closethebrowser() {
		closeEntireBrowser();
	}
	@BeforeClass
	public static void launchthebrowser() {
		launchBrowser();
		windowMaximize();
	}
    @Before
    public void Date() {
		Date d=new Date();
		System.out.println(d);
	}
  @After
     public void date() {
	  Date d=new Date();
		System.out.println(d);	
    }



}
