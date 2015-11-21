import javax.swing.JOptionPane;

public class FivePointOneP1 {

	private static void SQRT(){

		int a = 0;
		double sqrt = 0.0;
		double t = 0.0;
		a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		sqrt = a / 2;

		do
		{
			t = sqrt;
			sqrt = (t + (a / t)) / 2;
		}while ((t-sqrt) != 0);
		JOptionPane.showMessageDialog(null, "Square root of " + a + " is " + sqrt);
	}

	private static void POW(){
		int x = 0;
		int y = 0;
		int z = 1;
		x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Enter the exponent"));
		int q = y;
		
		for(int r = 1; y > 0; y-- ){
			z = z * x;
			
		}
			JOptionPane.showMessageDialog(null, x  + " by the power of " + q + " is " + z);
	}

	private static void ABS(){

		int x = 0;
		int y = 0;
		x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		
		if( x < 0 ){
			y =	x * -1;
			JOptionPane.showMessageDialog(null, "The absolute value of " + x + " is" + y);
		}
		
		else{
			y = x;
		JOptionPane.showMessageDialog(null, "The absolute value of " + x + " is" + y);
		}
	}


	public static void main(String[] args) {
		SQRT();
		POW();
		ABS();
	}
}
