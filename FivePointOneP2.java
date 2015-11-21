import javax.swing.JOptionPane;

public class FivePointOneP2 {

	public static void main(String[] args) {

		double x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to square: "));
		x = Math.sqrt(x);
		System.out.println(x);

		double y = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to raise: "));
		double z = Integer.parseInt(JOptionPane.showInputDialog("Enter the exponent: "));
		double power = Math.pow(y, z);
		System.out.println(y + " raised by the " + z + " power is " + power);

		double abs = Integer.parseInt(JOptionPane.showInputDialog("Find the absolute value of a number: "));
		if(abs < 0){
			abs = abs * -1;
			System.out.println(abs);
		}
		else{
			abs = abs;
			System.out.println(abs);
		}

	}

}
