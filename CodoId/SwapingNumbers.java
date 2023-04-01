package CodoId;

public class SwapingNumbers {

	public static void main(String[] args) {

		//swap two numbers without using temporary variable
		int num1 = 10, num2 = 15;
		
		System.out.println("Numbers Before Swapping :");
		System.out.print("num1 = " + num1 + " ");
		System.out.println("num2 = " + num2);

        num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Numbers After Swapping :");
		System.out.print("num1 = " + num1 + " ");
		System.out.println("num2 = " + num2);
	}

}
