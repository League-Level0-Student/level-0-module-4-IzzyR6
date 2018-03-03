import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String testScore= JOptionPane.showInputDialog("What is your test score?");
	double TestScore= Integer.parseInt(testScore);
	double percentage = TestScore/100;
	if(percentage >=0.9) {
		JOptionPane.showMessageDialog(null, "Wow! Great job! You're smart!");
	}
	else {
		JOptionPane.showMessageDialog(null, "You're dumb!");
	}
			
}
}
