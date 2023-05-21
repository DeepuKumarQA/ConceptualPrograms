package conceptProgramming;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 12345, reverse = 0;
		//suppose if we want to take the value from system then we will use scanner class 
		while (n != 0) {
			reverse = (reverse * 10) + n % 10;
			n = n / 10;
		}
		System.out.println("Entered number is reversed: " + reverse);
	}

}
