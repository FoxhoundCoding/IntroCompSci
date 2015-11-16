import javax.swing.JOptionPane;

public class TwoPointFive {

	public static void main(String[] args) {

		int input = Integer.parseInt(JOptionPane.showInputDialog("Please enter dollar bills in 1, 5, or 10: "));

		if(input == 1){
			JOptionPane.showMessageDialog(null, "1 Dollar is..." + "\n" + "-4 quarters" + "\n" + "-10 dimes" + "\n" + "-20 nickels" + "\n" + "-100 pennies");
		}
		
		else if(input == 5){
			JOptionPane.showMessageDialog(null, "5 Dollars is..." + "\n" + "-20 quarters" + "\n" + "-50 dimes" + "\n" + "-100 nickels" + "\n" + "-500 pennies");
		}
		else{
			JOptionPane.showMessageDialog(null, "10 Dollars is..." + "\n" + "-40 quarters" + "\n" + "-100 dimes" + "\n" + "-200 nickels" + "\n" + "-1000 pennies");
		}
	}

}
