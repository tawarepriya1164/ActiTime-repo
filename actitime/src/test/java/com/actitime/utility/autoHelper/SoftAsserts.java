package com.actitime.utility.autoHelper;

import org.testng.asserts.SoftAssert;

public class SoftAsserts {

	public void performSoftAssert(boolean actualValue, boolean expectedValue)
	{
		SoftAssert softAsserts = new SoftAssert();
		softAsserts.assertEquals(actualValue, expectedValue);
		softAsserts.assertAll();
	}
	public void performSoftAssert(String actualValue, String expectedValue)
	{
		SoftAssert softAsserts = new SoftAssert();
		softAsserts.assertEquals(actualValue, expectedValue);
		softAsserts.assertAll();
	}
}
