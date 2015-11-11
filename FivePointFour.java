import java.util.Scanner;
public class FivePointThree {
/**
 * Constructor,Get,and Set Methods.
 */
	private String color;
	private int horsepower;
	private String make;
	private String model;
	private double engineSize;

	FivePointThree(){ 
		color = "empty";
		horsepower = 0;
		make = "empty";
		model = "empty";
		engineSize = 0.0;
	}

	FivePointThree(String color){
		this.color = "";
		this.horsepower = 0;
		this.make = "";
		this.model = "";
		this.engineSize = 0.0;
	}
	FivePointThree(String color, int horsepower){
		this.color = "";
		this.horsepower = 0;
		this.make = "";
		this.model = "";
		this.engineSize = 0.0;
	}
	FivePointThree(String color, int horsepower, String make){
		this.color = "";
		this.horsepower = 0;
		this.make = "";
		this.model = "";
		this.engineSize = 0.0;
	}
	FivePointThree(String color, int horsepower, String make, String model){
		this.color = "";
		this.horsepower = 0;
		this.make = "";
		this.model = "";
		this.engineSize = 0.0;
	}
	FivePointThree(String color, int horsepower, String make, String model, double engineSize){
		this.color = "";
		this.horsepower = 0;
		this.make = "";
		this.model = "";
		this.engineSize = 0.0;
	}
	public void getColor(String color){
		this.color = color;
	}
	public String setColor(String color){
		return color;
	}
	public void getHorsepower(int horsepower){
		this.horsepower = horsepower;
	}
	public int setHorsepower(int horsepower){
		return horsepower;
	}
	public void getMake(String make){
		this.make = make;
	}
	public String setMake(String make){
		return make;
	}
	public void getModel(String model){
		this.model = model;
	}
	public String setModel(String model){
		return model;
	}
	public void getEngineSize(double engineSize){
		this.engineSize = engineSize;
	}
	public double setEngineSize(double engineSize){
		return engineSize;
	}
	public void toString(String color, int horsepower, String make, String model, double engineSize){
		System.out.println("Make: "+make+"\n"+"Model: "+model+"\n"+"Color: "+color+"\n"+"Engine Size: "+engineSize+"\n"+"Horsepower: "+horsepower) ;
		
	}
}

