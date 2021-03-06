import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want? A dog, a cat, or a bunny?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 3; i++) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do you make your pet happy?",
					"Making Your Dog Happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Give Food and Water", "Take a Walk", "Clean Up Poop" }, null);
			System.out.println(task);
			if (task == 0) {
				giveFood();
			} else if (task == 1) {
				takeWalk();
			} else {
				cleanPoop();
			}
			if (happinessLevel == 15) {
				JOptionPane.showMessageDialog(null, "You love your pet!");
			}
		}
		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What do you want to do you make your pet happy?",
				"Making Your Dog Happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Give Food and Water", "Take a Walk", "Clean Up Poop" }, null);
		System.out.println(task);

		// 5. Use user input to call the appropriate method created in step 4.
		if (task == 0) {
			giveFood();
		} else if (task == 1) {
			takeWalk();
		} else {
			cleanPoop();
		}
		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
		if (happinessLevel == 15) {
			JOptionPane.showMessageDialog(null, "You love your pet!");
		}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	public static void giveFood() {

		JOptionPane.showMessageDialog(null, "Purr");

		happinessLevel += 5;

	}

	public static void takeWalk() {
		JOptionPane.showMessageDialog(null, "Bark");
		happinessLevel += 5;
	}

	public static void cleanPoop() {
		JOptionPane.showMessageDialog(null, "hop!");
		happinessLevel += 5;
	}
}