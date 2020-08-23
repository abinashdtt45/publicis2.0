package com.abinash.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteOutput {
	int cId;
	String tType;
	String tDate;
	boolean flag;
	int fee;
	public static String out = "";

	public WriteOutput(int cId, String tType, String tDate, boolean flag, int fee) {
		this.cId = cId;
		this.tDate = tDate;
		this.tType = tType;
		this.flag = flag;
		this.fee = fee;
	}

	public static void log(String line) {
		String[] arr = line.split(",");
		if (arr[2].equals("")) {
			out = out + arr[1] + "," + arr[3] + "," + arr[4] + "," + arr[6];
			if (arr[6].equals("N"))
				out = out + "," + "500";
			else {
				if (arr[3].equals("sell") || arr[3].equals("withdraw"))
					out = out + "," + "100";
				else
					out = out + "," + "50";
			}
			out = out + "\n";
		} else {
			out = out + arr[1] + "," + arr[3] + "," + arr[4] + "," + "N" + "," + "10" + "\n";
		}
	}

	public static void printLog() throws IOException {

		try {
			FileWriter fw = new FileWriter("/Users/abinash/publicis2.0/Transaction/transaction/final_output.csv");
			fw.write(out);
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("SUCCESS");
	}

}
