import java.util.Scanner;

public class Driver {
/**
 * Driver for FivePointThree
 * @author colin_000
 * @param args
 */
	public static void main(String[] args){

		//Vehicle One
		FivePointThree vehicleOne = new FivePointThree();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("VEHICLE ONE");
		System.out.println("Enter Color: ");
		String color = keyboard.nextLine();
		vehicleOne.getColor(color);

		System.out.println("Enter Horsepower: ");
		int horsepower = keyboard.nextInt();
		vehicleOne.getHorsepower(horsepower);

		System.out.println("Enter Make: ");
		String make = keyboard.nextLine();
		vehicleOne.getMake(make);

		System.out.println("Enter Model: ");
		String model = keyboard.nextLine();
		vehicleOne.getModel(model);

		System.out.println("Enter Engine Size: ");
		double engineSize = keyboard.nextDouble();
		vehicleOne.getEngineSize(engineSize);
		System.out.println("Make: "+make+"\n"+"Model: "+model+"\n"+"Color: "+color+"\n"+"Engine Size: "+engineSize+"\n"+"Horsepower: "+horsepower);

		//Vehicle Two
		FivePointThree vehicleTwo = new FivePointThree();
		Scanner keyboardTwo = new Scanner(System.in);
		System.out.println("VEHICLE TWO");
		System.out.println("Enter Color: ");
		color = keyboardTwo.nextLine();
		vehicleOne.getColor(color);

		System.out.println("Enter Horsepower: ");
		horsepower = keyboardTwo.nextInt();
		vehicleOne.getHorsepower(horsepower);

		System.out.println("Enter Make: ");
		make = keyboardTwo.nextLine();
		vehicleOne.getMake(make);

		System.out.println("Enter Model: ");
		model = keyboardTwo.nextLine();
		vehicleOne.getModel(model);

		System.out.println("Enter Engine Size: ");
		engineSize = keyboardTwo.nextDouble();
		vehicleOne.getEngineSize(engineSize);
		System.out.println("Make: "+make+"\n"+"Model: "+model+"\n"+"Color: "+color+"\n"+"Engine Size: "+engineSize+"\n"+"Horsepower: "+horsepower);
		
		//Vehicle Three
		FivePointThree vehicleThree = new FivePointThree();
		Scanner keyboardThree = new Scanner(System.in);
		System.out.println("VEHICLE THREE");
		System.out.println("Enter Color: ");
		color = keyboardThree.nextLine();
		vehicleOne.getColor(color);

		System.out.println("Enter Horsepower: ");
		horsepower = keyboardThree.nextInt();
		vehicleOne.getHorsepower(horsepower);

		System.out.println("Enter Make: ");
		make = keyboardThree.nextLine();
		vehicleOne.getMake(make);

		System.out.println("Enter Model: ");
		model = keyboardThree.nextLine();
		vehicleOne.getModel(model);

		System.out.println("Enter Engine Size: ");
		engineSize = keyboardThree.nextDouble();
		vehicleOne.getEngineSize(engineSize);
		if(vehicleThree != null){
		System.out.println("Make: "+make+"\n"+"Model: "+model+"\n"+"Color: "+color+"\n"+"Engine Size: "+engineSize+"\n"+"Horsepower: "+horsepower);
		//Output
		vehicleOne.toString();
		vehicleTwo.toString();
		vehicleThree.toString();
		System.exit(0);
		}
		
	}
}
