import java.util.Scanner;

import javax.swing.JOptionPane;

public class TwoPointTwo {  
	public static void main(String[] args) {

		byte Byte = 0;
		short Short= 0;
		int  Int = 0;
		long Long = 0;
		float  Float = 3.6f; 
		String CharString = "";
		double Double = 0.0;
		boolean Boolean = true;

	
		System.out.println("Enter a Boolean: ");
		Scanner keyboardBool = new Scanner(System.in);
		Boolean = keyboardBool.nextBoolean();
		JOptionPane.showMessageDialog(null, "Boolean: " + Boolean);
		
		System.out.println("Enter a Byte: ");
		Scanner keyboard = new Scanner(System.in);
		Byte = keyboard.nextByte();
		JOptionPane.showMessageDialog(null, "Byte: " + Byte);
		
		System.out.println("Enter a Short: ");
		Scanner keyboardOne = new Scanner(System.in);
		Short = keyboardOne.nextShort();
		JOptionPane.showMessageDialog(null, "Short: " + Short);
		
		System.out.println("Enter a Int: ");
		Scanner keyboardTwo = new Scanner(System.in);
		Int = keyboardTwo.nextInt();
		JOptionPane.showMessageDialog(null, "Int: " + Int);
		
		System.out.println("Enter a Long: ");
		Scanner keyboardThree = new Scanner(System.in);
		Long = keyboardThree.nextLong();
		JOptionPane.showMessageDialog(null, "Long: " + Long);
		
		System.out.println("Enter a Float: ");
		Scanner keyboardFour = new Scanner(System.in);
		Float = keyboardFour.nextFloat();
		JOptionPane.showMessageDialog(null, "Float: " + Float);
		
		System.out.println("Enter a Double: ");
		Scanner keyboardFive = new Scanner(System.in);
		Double = keyboardFive.nextDouble();
		JOptionPane.showMessageDialog(null, "Double: " + Double);
		
		System.out.println("Enter a Char: ");
		Scanner keyboardSix = new Scanner(System.in);
		CharString = keyboardSix.next();
		char Char = CharString.charAt(0);
		JOptionPane.showMessageDialog(null, "Char: " + Char);
		
		System.out.println("Enter a Double: ");
		Scanner keyboardSeven = new Scanner(System.in);
		Double = keyboardSeven.nextDouble();
		JOptionPane.showMessageDialog(null, "Double: " + Double);
		
		
	}
}
