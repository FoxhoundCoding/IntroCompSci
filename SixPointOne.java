import javax.swing.JOptionPane;

public class SixPointOne{

	
	static int intArray[] = { 1, 2, 3, 4, 5 };
	static double calcAvg = 0.0;
	
	public static int sum(){	
		int index = 0;
		int calcSum = 0;
		while (index < 5){
		calcSum = calcSum + intArray[index];
		index++;
		}
		return calcSum;
	}
	public static double average(){
		
		calcAvg = sum() / 5;
		return calcAvg;
	}
	public static int product(){
		
		int calcPro = 1;
		int index = 0;
		
		while (index < 5){
			
			calcPro = calcPro * intArray[index];
			index++;
		}
		return calcPro;
	}
	public static int factorial(){
		
		int calcFac = 0;
		int factorial = 1;
		calcFac = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
		
		while (calcFac > 0){
			factorial = factorial * calcFac;
			calcFac--;
		}
		return factorial;
	}
	}
