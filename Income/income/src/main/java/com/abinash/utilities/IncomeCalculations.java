package com.abinash.utilities;

import java.util.Arrays;
import java.util.Comparator;

public class IncomeCalculations implements Comparator<String> {

	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		String arr[] = s1.split(",");
		String arr1[] = s2.split(",");
		return (int) Double.parseDouble(arr[2]) - (int) Double.parseDouble(arr1[2]);
	}


	public static String sortIncome(String str) {

		String[] arr = str.split("\n");
		Arrays.sort(arr, new IncomeCalculations());
		str = "";
		for (int i = 0; i < arr.length; i++) {
			str = str + arr[i] + "\n";
		}
		return str;
	}

	public static Double calculate(int n, String curr) {
		if (curr.equals("GBP"))
			return n / 0.67;
		else if (curr.equals("INR"))
			return (n / 66.0);
		else if (curr.equals("SGD"))
			return (n / 1.5);
		else if (curr.equals("HKD"))
			return (n / 8.0);
		else
			return null;

	}

	public static String  averageIncome(String s) {
		String[] averageStrings = s.split("\n");
		int maleCount=0,femaleCount=0;
		double maleSum = 0,femaleSum=0;
		String countryString = "";
		countryString = averageStrings[0].split(",")[0];

		for(String lineString : averageStrings) {
			if (lineString.split(",")[1].equalsIgnoreCase("M")) {
				maleCount++;
				maleSum += Double.parseDouble(lineString.split(",")[2]);
			}else {
				femaleCount++;
				femaleSum += Double.parseDouble(lineString.split(",")[2]);
			}
		}
		double maleAverage = maleSum / maleCount;
		double femaleAverage = femaleSum / femaleCount;
		String anString = countryString + "," + "M" + "," + Double.toString(maleAverage) + "\n" + countryString + ","
				+ "F" + "," + Double.toString(femaleAverage) + "\n";

		return anString;

	}

}
