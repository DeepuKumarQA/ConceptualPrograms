package conceptProgramming;

import java.util.Scanner;

public class TempeartureConversion {

	public static void main(String[] args) {
		float temp;
		System.out.println("Enter the temperature for conversion: ");
		try (Scanner in = new Scanner(System.in)) {
			temp = in.nextFloat();
		}
		temp = ((temp - 32) * 5) / 9;
		System.out.println("The converted Temperature is: " + temp);
	}

}
