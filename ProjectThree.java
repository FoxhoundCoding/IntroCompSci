import javax.swing.JOptionPane;

public class ProjectThree {

	public static void main(String[] args) {


		boolean LoopTwo = true;
		boolean PassBool = true;
		String Username = "";
		String Password = ""; 
		String[] SetUser = {"User1","User2","User3"};
		String[] SetPass = {"Pass1", "Pass2", "Pass3"};

		int UserData = 0;
		int Try = 0; 
		int Limit = 3;

		String[] AccChoice = { "Admin", "Staff", "Student"};

		boolean Loop = true;//Purely used to set up loop 
		while(Loop == true ){
			LoopTwo = true;
			PassBool = true;
			UserData = 0;

			if(Try > Limit){
				JOptionPane.showMessageDialog(null, "User Locked Out! Please contact Administrator.", "//"
						+ "User Timed Out", JOptionPane.WARNING_MESSAGE);//WARNING_MESSAGE creates "indicator"
				System.out.println("b");
				Loop = false; //end loop
				System.exit(0);}

			if (Try < Limit){
				//Once Try is greater than Limit, User is locked out.
				LoopTwo = true;
				PassBool = true;
				UserData = 0;
				Username = JOptionPane.showInputDialog("Please Enter Username: ");


				while((LoopTwo == true) && (UserData < 2)){
					if((Username.equals(SetUser[UserData]))){
						LoopTwo = false;}
					else{ 
						UserData ++ ;
						System.out.println("a");}
				}
				Password = JOptionPane.showInputDialog("Please Enter Password: ");
				if((Password.equals(SetPass[UserData]))){
					PassBool = false;
					System.out.println("c");}
				else{
					PassBool = true;}
			}
			if((Try<Limit) && (LoopTwo == false) && (PassBool == false)){
				String input = (String) JOptionPane.showInputDialog(null, "Choose account type:  ","Account Type",JOptionPane.QUESTION_MESSAGE, null,AccChoice,AccChoice[0]); 
				System.out.println(input);

				switch(input){ 
				//If and only if the string is correct does the switch case work
				case "Admin":
					if(UserData == 0){
						JOptionPane.showMessageDialog(null, "Welcome " +  "Admin, you can update and read file!");
						Loop = false;}
					else{ 
						Try = Try +1;
						JOptionPane.showMessageDialog(null, "Either Username or Password is incorrect.", "Invalid", JOptionPane.WARNING_MESSAGE);}
					break;
				case "Staff":
					if(UserData == 1){
						JOptionPane.showMessageDialog(null, "Welcome " + "Staff, you can update, read, add, delete file.");
						Loop = false;}
					else{ 
						Try = Try +1;
						JOptionPane.showMessageDialog(null, "Either Username or Password is incorrect.", "Invalid", JOptionPane.WARNING_MESSAGE);}
					break;
				case "Student":
					if(UserData == 2){
						JOptionPane.showMessageDialog(null, "Welcome " + "Student, you can only read file!");
						Loop = false;}
					else{ 
						Try = Try +1;
						JOptionPane.showMessageDialog(null, "Either Username or Password is incorrect.", "Invalid", JOptionPane.WARNING_MESSAGE);}
					break;}	
			}
			else{ 
				Try = Try +1;
				System.out.println("w");
			}
		}
	}
}
