
public class FourPointTwo {

	public static void main(String[] args) {

		//PART I
		System.out.println("Odd numbers within 100: ");

		for(int i = 0; i<100; i++){
			if(!(i%2 == 0)){
				System.out.println(i);
			}
		}

		//PART II
		int i = 0;
		System.out.println("Even numbers within 100: ");
		do{ 
			i++;
			if(i%2 == 0){
				System.out.println(i);
			}
		}while(i<100);

		//PART III
		for (int a = 1; a < 10; a += 2) {
			for (int b = 0; b < 9 - a / 2; b++)
				System.out.print(" ");

			for (int b = 0; b < a; b++)
				System.out.print("*");

			System.out.print("\n");
		}

		for (int a = 7; a > 0; a -= 2) {
			for (int b = 0; b < 9 - a / 2; b++)
				System.out.print(" ");

			for (int b = 0; b < a; b++)
				System.out.print("*");

			System.out.print("\n");
		}

	}

}
