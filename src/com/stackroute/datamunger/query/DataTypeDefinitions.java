package com.stackroute.datamunger.query;

import java.text.ParseException;
public class DataTypeDefinitions {
	// method stub
	public static Object getDataType(String input) throws ParseException{
		if (input.matches("^\\d+$")) {
			return new Integer(input).getClass().getName();
		} else if (input.matches("^\\d*\\.\\d*$")) {
			return new Float(input).getClass().getName();
		} else if (input.matches("^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$")
				|| input.matches("^\\d{1,2}\\-\\[A-Za-z]{3}\\-\\d{2}$")
				|| input.matches("^\\d{1,2}\\-\\[A-Za-z]{3}\\-\\d{4}$")
				|| input.matches("^\\d{1,2}\\-\\[A-Za-z]{5}\\-\\d{2}$")
				|| input.matches("^\\d{1,2}\\-\\[A-Za-z]{5}\\-\\d{4}$")
				|| input.matches("^\\d{4}\\-\\d{1,2}\\-\\d{1,2}$")) {
			return new java.util.Date().getClass().getName();
		} else if (input.matches("^\\w[a-zA-Z_0-9]*.*$")) {
			return new String().getClass().getName();
		} else {
			return new Object();
		}
	}
	// this class contains methods to find the column data types
}