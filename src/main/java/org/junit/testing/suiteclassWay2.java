package org.junit.testing;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class suiteclassWay2 {
	@Test
	public void tc() {
		Result rc = JUnitCore.runClasses(A.class,challenge2.class,B.class);
		System.out.println("total run time: " + rc.getRunTime());
		System.out.println("total run count: " + rc.getRunCount());
		System.out.println("total failure count: " + rc.getFailureCount());
		System.out.println("total ignore count: " + rc.getIgnoreCount());
		List<Failure> f = rc.getFailures();
		for (Failure fails : f) {
			System.out.println(fails);
			
		}

	}

}
