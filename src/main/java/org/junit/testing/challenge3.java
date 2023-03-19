package org.junit.testing;

import org.junit.Assert;
import org.junit.Test;

public class challenge3 extends baseclass{
	@Test
	public void Tc1() {
		System.out.println("test case 1");
		launchBrowser();
		windowMaximize();
		launchUrl("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ifkv=AWnogHeQgiY2d0DP258q7f5xp0Jcz0u8UX55KIj-UYsPnVghFg63gjTxIY2kYXRAq0fhXT6WwLsQKw&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		String pagetitle = pagetitle();
		String pageUrl = pageUrl();
		gmailloginpom g=new gmailloginpom();
		passText("sathboobal@gamil.com", g.getMailid());
		Assert.assertEquals("check the url", pageUrl,pageUrl.contains("gmail") );
		clickBtn(g.getClick());
	}

}
