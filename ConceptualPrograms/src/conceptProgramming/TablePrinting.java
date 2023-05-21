package conceptProgramming;

import java.util.Scanner;

public class TablePrinting {

	public static void main(String[] args) {
		int n, count = 10;
		System.out.println("Enter the number to print the table: ");
		try (Scanner in = new Scanner(System.in)) {
			n = in.nextInt();
			System.out.println("The Table is: ");
		}
		for (int i = 1; i <= count; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}
	}
}
