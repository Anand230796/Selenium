package org.maven.MavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day1 {
	@Test()
	public void test1() {
		System.out.println("Test1");

	}
	@Test(retryAnalyzer=Day2.class)
	public void test2() {
		System.out.println("Test2");
		//Assert.assertTrue(false);

	}

}
