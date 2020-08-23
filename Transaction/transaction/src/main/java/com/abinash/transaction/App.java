package com.abinash.transaction;

import java.io.IOException;

import com.abinash.IO.ReadInput;
import com.abinash.IO.WriteOutput;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
		String fileString = "/Users/abinash/publicis2.0/Transaction/transaction/log.csv";
		ReadInput.read(fileString);
		try {
			WriteOutput.printLog();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
