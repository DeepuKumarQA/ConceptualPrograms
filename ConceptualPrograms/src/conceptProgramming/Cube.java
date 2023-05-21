package conceptProgramming;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		int n, Cube;
		System.out.println("Enter the number to find the Cube: ");
		try (Scanner in = new Scanner(System.in)) {
			n = in.nextInt();
		}
		Cube = n * n * n;
		System.out.println("The cube of the number is : " + Cube);
	}

}
