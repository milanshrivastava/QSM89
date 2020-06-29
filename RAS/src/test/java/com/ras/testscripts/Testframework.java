package com.ras.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testframework {
	@Test
	public void tc_01()
	{
		Reporter.log("firsttestcase", true);
	}

}
