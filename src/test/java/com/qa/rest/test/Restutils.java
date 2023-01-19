package com.qa.rest.test;

import org.apache.commons.lang3.RandomStringUtils;

public class Restutils {

	public static String empName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("Sandhya" + generatedString);
	}
	public static String empSal() {
		String generatedString = RandomStringUtils.randomNumeric(5);
		return (generatedString);
	}
	
}
