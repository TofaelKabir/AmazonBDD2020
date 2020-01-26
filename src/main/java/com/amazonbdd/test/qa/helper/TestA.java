package com.amazonbdd.test.qa.helper;

import com.amazonbdd.test.qa.enums.OS;

public class TestA {
	public static void main (String[]args) {
		System.out.println(System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase()));
	}

}
