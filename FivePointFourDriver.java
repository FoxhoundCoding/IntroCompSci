import java.util.Scanner;

import javax.swing.JOptionPane;

public class Driver {
	/**
	 * Driver for FivePointThree
	 * @author colin_000
	 * @param args
	 */
	static int carCounter = 0;
	
	public static void main(String[] args){
		
		int count = 0;

		//Vehicle One
		FivePointFour vehicleOne = new FivePointFour();
		System.out.println("VEHICLE ONE");
		String color = JOptionPane.showInputDialog("Enter Color: ");
		vehicleOne.getColor(color);


		int horsepower = Integer.parseInt(JOptionPane.showInputDialog("Enter Horsepower: "));
		vehicleOne.getHorsepower(horsepower);

	
		String make = JOptionPane.showInputDialog("Enter Make: ");
		vehicleOne.getMake(make);

		String model = JOptionPane.showInputDialog("Enter Model: ");
		vehicleOne.getModel(model);


		double engineSize = Double.parseDouble(JOptionPane.showInputDialog("Enter Engine Size: "));
		vehicleOne.getEngineSize(engineSize);
		carCounter ++;
		System.out.println(carCounter);
		vehicleOne.toString(color, horsepower, make, model, engineSize);
		
		//Vehicle Two
		FivePointFour vehicleTwo = new FivePointFour();
	
		System.out.println("VEHICLE TWO");
	
		color = JOptionPane.showInputDialog("Enter Color: ");
		vehicleTwo.getColor(color);

	
		horsepower = Integer.parseInt(JOptionPane.showInputDialog("Enter Horsepower: "));
		vehicleTwo.getHorsepower(horsepower);

	
		make = JOptionPane.showInputDialog("Enter Make: ");
		vehicleTwo.getMake(make);

	
		model = JOptionPane.showInputDialog("Enter Model: ");
		vehicleTwo.getModel(model);

	
		engineSize = Double.parseDouble(JOptionPane.showInputDialog("Enter Engine Size: "));
		vehicleTwo.getEngineSize(engineSize);
		
		carCounter ++;
		System.out.println(carCounter);
		vehicleTwo.toString(color, horsepower, make, model, engineSize);
		
		//Vehicle Three
		FivePointFour vehicleThree = new FivePointFour();

		System.out.println("VEHICLE THREE");
		color = JOptionPane.showInputDialog("Enter Color: ");
		vehicleThree.getColor(color);

	
		horsepower = Integer.parseInt(JOptionPane.showInputDialog("Enter Horsepower: "));
		vehicleThree.getHorsepower(horsepower);

	
		make = JOptionPane.showInputDialog("Enter Make: ");
		vehicleThree.getMake(make);

	
		model = JOptionPane.showInputDialog("Enter Model: ");
		vehicleThree.getModel(model);


		engineSize = Double.parseDouble(JOptionPane.showInputDialog("Enter Engine Size: "));
		vehicleThree.getEngineSize(engineSize);
		
		carCounter ++;
		System.out.println(carCounter);
		vehicleThree.toString(color, horsepower, make, model, engineSize);
		
		JOptionPane.showMessageDialog(null, "You have created three cars!");
		
		if(vehicleOne.equals(vehicleTwo)){
			JOptionPane.showMessageDialog(null, "Vehice One and Two are the same");
			}
		if(vehicleOne.equals(vehicleThree)){
			JOptionPane.showMessageDialog(null, "Vehice One and Three are the same");
		}
		if(vehicleTwo.equals(vehicleThree)){
			JOptionPane.showMessageDialog(null, "Vehice Two and Three are the same");
		}
		
	}
}

class Uber{
	
	
}

