package org.maven.MavenProject;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IListenersAnnotation;
import org.testng.annotations.ITestAnnotation;

public class Listener implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation) {
		annotation.setRetryAnalyzer(Day2.class);
		
	}

}
