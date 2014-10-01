/*******************************************************************************
 * Copyright (c) 2012 Secure Software Engineering Group at EC SPRIDE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors: Christian Fritz, Steven Arzt, Siegfried Rasthofer, Eric
 * Bodden, and others.
 ******************************************************************************/
package soot.jimple.infoflow.android.test.droidBench;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.xmlpull.v1.XmlPullParserException;

import soot.jimple.infoflow.InfoflowResults;

public class ThreadingTests extends JUnitTests {
	
	@Test(timeout=300000)
	public void runTestAsyncTask1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Threading_AsyncTask1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestExecutor1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Threading_Executor1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestJavaThread1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Threading_JavaThread1.apk");
		Assert.assertEquals(1, res.size());
	}
	
}