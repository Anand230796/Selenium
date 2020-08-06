package org.maven.MavenProject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	@DataProvider(name = "SampleData")
	public Object[][] data() {
		return new Object[][] { { "venkat", 12345 }, { "anand", 23456 } };

	}

	@Test(dataProvider = "SampleData")
	public void test1(String user, int Pass) {
		System.out.println(user);
		System.out.println(Pass);

	}

	 @Parameters({ "username", "Password" })
	 @Test
	 public void test2(String user, String pass) {
	 System.out.println(user);
	 System.out.println(pass);
	 }

	 @Parameters({ "password" })
	 @Test()
	public void test3(String password) {
	 System.out.println(password);

	 }

	 @Test()
	 public void test4() {
	 System.out.println("Test4");
	 }

	 @Test(timeOut = 3000)
	 public void test5() {
	 System.out.println("Test5");
	 }
}