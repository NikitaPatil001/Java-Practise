package com.easy;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Java_Date_Time {

		    public static void main(String[] args) {
		        try (Scanner scanner = new Scanner(System.in)) {
					int month = scanner.nextInt();
					int day = scanner.nextInt();
					int year = scanner.nextInt();

					Calendar calendar = Calendar.getInstance();
					calendar.set(Calendar.DATE, day);
					calendar.set(Calendar.MONTH, month - 1);
					calendar.set(Calendar.YEAR, year);

					System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK,
							Calendar.LONG, new Locale("en", "US")).toUpperCase());
				}
		    }

	}


