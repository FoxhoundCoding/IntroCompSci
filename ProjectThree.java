import javax.swing.JOptionPane;
/**
 * 
 * @author colin_000
 *SET Variables
 *LOOP for whether try is less or equal to limit 
 *PROMPT User for Username
 *CHECK if Username is equal to on of the items in Username Array
 *IF not Try++
 *INIT Index to keep track of which part of the array was inputted 
 *PROMPT for password
 *Check if password is equal to index
 *IF not Try++
 *PROPMT for AccountType
 *CHECK index again
 *IF not re-prompt user for Account Type
 */
public class ProjectThree {
/**
 * 
 * @param args
 */
	public static void main(String[] args) { 


		boolean UserBool = false;
		boolean PassBool = false;
		String Username = "";
		String Password = ""; 
		String[] SetUser = {"User1","User2","User3"};
		String[] SetPass = {"Pass1", "Pass2", "Pass3"};

		int UserData = 0;
		int Try = 0; 
		int Limit = 3;

		String[] AccChoice = { "Admin", "Staff", "Student"};

		boolean Loop = false;//Purely used to set up loop 
		while(Loop == false ){
			//UserBool = true;
			//PassBool = true;

			if(Try > Limit){
				JOptionPane.showMessageDialog(null, "User Locked Out! Please contact Administrator.", "//"
						+ "User Timed Out", JOptionPane.WARNING_MESSAGE);//WARNING_MESSAGE creates "indicator"
				Loop = false; //end loop
				System.exit(0);}

			if (Try < Limit){
				//Once Try is greater than Limit, User is locked out.

				if (UserBool != true){
					UserData = 0;//UserData keeps track of which part of the array is input
					Username = JOptionPane.showInputDialog("Please Enter Username: ");}


				while((UserBool == false) && (UserData <= 2)){ //If Loop is set to false and Password corresponds with Username index
					if((Username.equals(SetUser[UserData])) && UserBool == false){
						UserBool = true;}

					else{
						UserData ++ ;}
				}


				if(UserBool == true){
					Password = JOptionPane.showInputDialog("Please Enter Password: ");
					if(Password.equals(SetPass[UserData])){
						PassBool = true;}

					else{
						PassBool = false;
						JOptionPane.showMessageDialog(null, "Incorrect password!", "//"
								+ "INVALID", JOptionPane.WARNING_MESSAGE);}
					}
				
				else{
					JOptionPane.showMessageDialog(null, "Incorrect user name!", "//"
							+ "INVALID", JOptionPane.WARNING_MESSAGE);}
			}


			if((Try<Limit) && (UserBool == true) && (PassBool == true)){
				
				String input = (String) JOptionPane.showInputDialog(null, "Choose account type:  ","Account Type",JOptionPane.QUESTION_MESSAGE, null,AccChoice,AccChoice[0]); 
				System.out.println(input);
				
				while(input != AccChoice[UserData]){
					
					JOptionPane.showMessageDialog(null, "Wrong Account Choice.", "Invalid",//
							JOptionPane.WARNING_MESSAGE);
					input = (String) JOptionPane.showInputDialog(null, "Choose account type:  ","Account Type",JOptionPane.QUESTION_MESSAGE, null,AccChoice,AccChoice[0]); 
					System.out.println(input);}//Reprompts User for Account Type rather than adding to the Try counter
			
				switch(input){
				//If and only if the string is correct does the switch case work
				case "Admin":
					if(UserData == 0){
						JOptionPane.showMessageDialog(null, "Welcome " +  "Admin, you can update and read file!");
						Loop =  true;}
					break;
				case "Staff":
					if(UserData == 1){
						JOptionPane.showMessageDialog(null, "Welcome " +  "Staff, you can update, edit, read, and delete file!");
						Loop =  true;}
					break;
				case "Student":
					if(UserData == 2){
						JOptionPane.showMessageDialog(null, "Welcome " + "Student, you can only read file!");
						Loop =  true;}
					break;}
			}
			else{
				//Try counter for if password or username input is not correct
				Try++;}
		}
	}
}


