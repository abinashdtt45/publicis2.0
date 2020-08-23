package com.abinash.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadInput {

	public static void read(String csvFile) {
		try {
			File file = new File(csvFile);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			String[] tempArray;
			int i = 0;
			while ((line = br.readLine()) != null) {
				if (i == 0)
					i = i + 1;
				else {
					WriteOutput.log(line);
					tempArray = line.split(",");
					// System.out.println(Integer.parseInt(tempArr[0]));
					for (String temp : tempArray) {
						System.out.print(temp + " ");
					}
					System.out.println();
				}
			}
			br.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
