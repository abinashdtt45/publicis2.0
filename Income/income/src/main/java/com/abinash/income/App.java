package com.abinash.income;

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
		String filePathString = "/Users/abinash/publicis2.0/Income/income/Sample_Input.csv";
		ReadInput.read(filePathString);
		try {
			WriteOutput.answerLog();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}
