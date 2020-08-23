package com.abinash.date_time_calculator;

import java.util.Scanner;

import com.abinash.date_time_calculator.calculations.BasicCalculations;
import com.abinash.date_time_calculator.calculatorUI.StartCalculatorScreen;
import com.abinash.date_time_calculator.calculator_input.Input;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
		StartCalculatorScreen.printScreen();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Enter id: ");
			int n = scanner.nextInt();
			if (n == 1) {
				// Subtract between two dates and express the output in days, dates, weeks,
				// months
				System.out.println("Enter First date(Less)");
				Input date1 = new Input(scanner.next());
				System.out.println("Enter Second date(More)");
				Input date2 = new Input(scanner.next());
				System.out.println("Answer: ");
				int days = BasicCalculations.subtractDates(date1, date2);
				BasicCalculations.convertDaystoUnits(days);
			} else if (n == 2) {
				// Add, Subtract 'n' Days, Months, Weeks to the given date and derive the final
				// date
				boolean flag = true;
				System.out.println("Enter add/sub? 0 for add 1 for subtract");
				if (scanner.next().equalsIgnoreCase("add"))
					flag = true;
				else
					flag = false;
				System.out.println("Enter First date");
				Input date1 = new Input(scanner.next());
				System.out.println("Enter type: \n  0: days, 1: weeks, 2: months");
				int type = scanner.nextInt();
				System.out.println("Enter total units");
				int units = scanner.nextInt();
				if (flag == true)
					BasicCalculations.addNunits(date1, units, type);
				else
					BasicCalculations.subtractNunits(date1, units, type);
			} else if (n == 3) {
				// Determine the Day of the Week for a given date
				System.out.println("Enter date");
				Input date1 = new Input(scanner.next());
				BasicCalculations.whichDay(date1);
			} else if (n == 4) {
				// Determine the Week number for a given a date
				System.out.println("Enter date");
				Input date1 = new Input(scanner.next());
				BasicCalculations.findWeekNumber(date1);

			} else if (n == 5) {
				System.out.println("BYE");
				scanner.close();
				System.exit(0);
			}
		}
    }
}
