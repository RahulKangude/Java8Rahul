package com.interview;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class NextOccurringDay {

	public static void main(String[] args) {

		// next occurring date of dates "FRIDAY"
		LocalDate today = LocalDate.now();
		LocalDate nextDate = today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println(nextDate);
		
	}

}
