package com.abinash.IO;

import java.io.FileWriter;
import java.io.IOException;

import com.abinash.utilities.IncomeCalculations;

public class WriteOutput {
	int cId;
	String tType;
	String tDate;
	boolean flag;
	int fee;
	public static String out = "";
	public static String india = "";
	public static String uk = "";
	public static String hk = "";
	public static String sg = "";


	public static void log(String line) {
		System.out.println(line);
		String[] arr = line.split(",");
		if (arr[1].equals("UK")) {
			Double inc = IncomeCalculations.calculate(Integer.parseInt(arr[4]), arr[3]);
			uk = uk + arr[1] + "," + arr[2] + "," + inc + "\n";
		} else if (arr[1].equals("India")) {
			Double inc = IncomeCalculations.calculate(Integer.parseInt(arr[4]), arr[3]);
			india = india + arr[1] + "," + arr[2] + "," + inc + "\n";
		} else if (arr[1].equals("Singapore")) {
			Double inc = IncomeCalculations.calculate(Integer.parseInt(arr[4]), arr[3]);
			sg = sg + arr[1] + "," + arr[2] + "," + inc + "\n";
		} else if (arr[1].equals("HongKong")) {
			Double inc = IncomeCalculations.calculate(Integer.parseInt(arr[4]), arr[3]);
			hk = hk + arr[1] + "," + arr[2] + "," + inc + "\n";
		} else
			return;
	}

	public static void answerLog() throws IOException {

		uk = IncomeCalculations.sortIncome(uk);
		india = IncomeCalculations.sortIncome(india);
		hk = IncomeCalculations.sortIncome(hk);
		sg = IncomeCalculations.sortIncome(sg);
		String out = hk + india + sg + uk;
		System.out.println(out);
		try {
			FileWriter fw = new FileWriter("/Users/abinash/publicis2.0/Income/income/Sample_Output.csv");
			fw.write(out);
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Success...");
	}

}
