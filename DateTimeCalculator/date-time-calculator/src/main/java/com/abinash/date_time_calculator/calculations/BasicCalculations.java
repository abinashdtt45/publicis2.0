package com.abinash.date_time_calculator.calculations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.abinash.date_time_calculator.calculator_input.Input;

public class BasicCalculations {

	public static int subtractDates(Input first, Input second) {
		int days = 0;
		SimpleDateFormat finalFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date firstDate = finalFormat.parse(first.getDate());
			Date secondDate = finalFormat.parse(second.getDate());
			long timeDifference = secondDate.getTime() - firstDate.getTime();
			days = (int) (timeDifference / (1000 * 60 * 60 * 24));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return days;
	}

	public static void convertDaystoUnits(int d) {
		System.out.println("Weeks: ");
		System.out.println(d / 7.0);
		System.out.println("Months: ");
		System.out.println((d / 7.0) / 4.0);
		System.out.println("years: ");
		System.out.println(d / 365.0);

	}

	public static void addNunits(Input date, int units, int type) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date givenDate = format.parse(date.getDate());
			Calendar c = Calendar.getInstance();
			c.setTime(givenDate);
			if (type == 0) {
				// days
				c.add(Calendar.DAY_OF_MONTH, units);
			} else if (type == 1) {
				// weeks
				c.add(Calendar.DAY_OF_MONTH, units * 7);
			} else {
				// months
				c.add(Calendar.DAY_OF_MONTH, units * 30);
			}

			System.out.println(format.format(c.getTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void subtractNunits(Input date, int units, int type) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date givenDate = format.parse(date.getDate());
			Calendar c = Calendar.getInstance();
			c.setTime(givenDate);
			if (type == 0) {
				// days
				c.add(Calendar.DAY_OF_MONTH, units * (-1));
			} else if (type == 1) {
				// weeks
				c.add(Calendar.DAY_OF_MONTH, units * 7 * (-1));
			} else {
				// months
				c.add(Calendar.DAY_OF_MONTH, units * 30 * (-1));
			}

			System.out.println(format.format(c.getTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void findWeekNumber(Input input) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();
		try {
			calendar.setTime(format.parse(input.getDate()));
			System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void whichDay(Input firsInput) {
		SimpleDateFormat format = new SimpleDateFormat("EEEE");
		SimpleDateFormat dateConverter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.println(format.format(dateConverter.parse(firsInput.getDate())));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
