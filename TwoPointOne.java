import java.util.Scanner;

public class TwoPointOne {

	public static void main(String[] args) {

		String stuff = "";	//init String variable Stuff
		int total = 0;	//init int total 
		double average = 0.0;	//init double average 
		int input = 0;	//init int input
		
		for(int i =0; i< 10; i++){	//init for-loop until "i" == 10
		System.out.println("Enter a number: ");	//prompts user for number
		Scanner keyboard = new Scanner(System.in);	//Scans for keyboard input
		input = keyboard.nextInt();	//saves input
		stuff = stuff + input + ",";	//adds stuff + input
		total += input; //adds input to total
		}
		
		average = total / 10; //Divides input to find average
		stuff = stuff.substring(0, (stuff.length() -1 ));	//drops the last character of "stuff"
		System.out.println(stuff); //prints final product of var stuff
		System.out.println("Average: " + "\n"  + average);		//Ouputs average for the User
	}
}
