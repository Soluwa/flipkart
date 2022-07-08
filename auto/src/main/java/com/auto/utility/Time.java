package com.auto.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

	public static String getDateTime() {
		LocalDateTime timeNow =  LocalDateTime.now();
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy_HH-mm-ssa");
		return timeNow.format(formatter);
	}
}
