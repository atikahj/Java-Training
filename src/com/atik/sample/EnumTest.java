package com.atik.sample;

import static com.atik.sample.Day.*;

public class EnumTest {
	
	Day day;
	
	public EnumTest(Day day) {
		this.day = day; 
		
	}
	
	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}
	
	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(MONDAY);
		firstDay.tellItLikeItIs();
		EnumTest secondDay = new EnumTest(Day.TUESDAY);
		secondDay.tellItLikeItIs();
		EnumTest thirdDay = new EnumTest(WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumTest forthDay = new EnumTest(THURSDAY);
		forthDay.tellItLikeItIs();
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
	}
}
