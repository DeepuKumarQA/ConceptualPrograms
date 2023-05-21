package conceptProgramming;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num, fact = 1;
		System.out.println("Enter the number to find the factorial: ");
		try (Scanner in = new Scanner(System.in)) {
			num = in.nextInt();
		}
		for (int c = 1; c <= num; c++) {
			fact = fact * c;
		}
		System.out.println("The fact of the num is: " + fact);
	}

}
