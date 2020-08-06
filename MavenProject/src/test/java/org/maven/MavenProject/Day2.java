package org.maven.MavenProject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Day2 implements IRetryAnalyzer{
	int Startcount=0;
	int endcount=4;

	public boolean retry(ITestResult result) {
		if (Startcount<endcount) {
			Startcount++;
			return true;
			
		}
		return false;
	}
	
	

}
