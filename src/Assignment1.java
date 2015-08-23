import java.util.Scanner;

public class Assignment1 {
	//define constant value.
	private final static int MAXVALUE = 2;
	
	public static void main(String[] args) {
		//define get input value.
		int getInputValue = 0;
		//Validate input value and return value.
		getInputValue = validateNumberInput();
		//Calculate and show value.
		calcuateTotal(getInputValue);
	}
	/**
	 * Validate input value and return value.
	 * @return abcd.
	 */
	private static int validateNumberInput()
	{
		int inputValue = 0;
		System.out.print("Ïnput number: ");
		Scanner sc = new Scanner(System.in);
		while (true) {
			inputValue = sc.nextInt();
			if (inputValue < MAXVALUE) {
				System.out.print("Please input number >100: ");
			} else {
				sc.close();
				break;
			}
		};
		return inputValue;
	}
	/**
	 * Calculate and show value.
	 * @param inputNumber
	 */
	private static void calcuateTotal(int inputNumber)
	{
		int totalEvenNum = 0;
		int totalEvenOdd = 0;
		while (inputNumber > 0) {
			if (inputNumber % 2 == 0) {
				totalEvenNum += inputNumber;
			} else {
				totalEvenOdd += inputNumber;
			}
			inputNumber--;
		};
		//syso + ctrl space: la hien la System.out.print
		System.out.println("Total of even numbers: "+totalEvenNum);
		System.out.println("Total of odd numbers : "+totalEvenOdd);
	}
}

