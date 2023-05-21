package conceptProgramming;

public class Swap2Number2 {

	public static void main(String[] args) {
		// swap with two variables
				int a = 10, b = 20;
				//Swapping of the values
				a=a+b;
				b=a-b;
				a=a-b;
				System.out.println("The swap of 2 number using two variable: " + a + " and " + b);
	}

}
