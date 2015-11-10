import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class TwoPointThree {

	public static void main(String[] args) {

		double input = 0;
		input = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in centimeters: "));


		if(input != 0){
			double convertion = input * 0.39;
			JOptionPane.showMessageDialog(null, "Your height in inches: " + convertion);
		}
	}
}
