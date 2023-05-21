package conceptProgramming;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter the year to check is this leap year or not: ");
		try (Scanner in = new Scanner(System.in)) {
			year = in.nextInt();
		}
		if ((year % 400 == 0) || (year % 100 == 0) && (year % 4 == 0)) {
			System.out.println("Entered year is leap year");
		} else {
			System.out.println("Entered year is not leap year");
		}

	}

}
