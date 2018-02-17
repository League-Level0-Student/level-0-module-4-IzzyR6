
import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		for(int i = 0; i < 20; i++) {
		String answerNumber1 = JOptionPane.showInputDialog("Enter a number");
		int number1 = Integer.parseInt(answerNumber1);
		String answerNumber2 = JOptionPane.showInputDialog("Enter another number");
		int number2 = Integer.parseInt(answerNumber2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What do you want to do with these numbers?", "Operations",
				0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Divide", "Multiply", "Subtract", "Add" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate
		// operation.
if(operation == 3) {
	addition(number1, number2);
}
if(operation == 2) {
	subtraction(number1, number2);
}
if(operation == 1) {
	multiplication(number1, number2);
}
if(operation == 0) {
	division(number1, number2);
}
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	public static void addition(int number1, int number2) {
		JOptionPane.showMessageDialog(null, number1 + number2);
	}

	// 4. Create similar methods for subtraction, multiplication and division.
	public static void subtraction(int number1, int number2) {
		JOptionPane.showMessageDialog(null, number1 - number2);
	}

	public static void multiplication(int number1, int number2) {
		JOptionPane.showMessageDialog(null, number1 * number2);
	}

	public static void division(int number1, int number2) {
		JOptionPane.showMessageDialog(null, number1 / number2);
	}
}