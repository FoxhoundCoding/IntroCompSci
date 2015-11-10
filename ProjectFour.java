
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 
 * @author colin_000
 *PROMPTS user for User,Pass,AccType,Name,Email
 *CHECKS to see if all fields have been filled
 *IF fields aren't filled makes border color red
 *CHECKS format of Password & Email
 *IF all else checks out the information is sent to the Get/Set Class.
 *Produces a JOP with User,Pass,AccType info for the user to see
 *EXITS program
 *
 */
public class ProjectFour extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Project Four");
		TextField UserTxt = new TextField();
		PasswordField PassTxt = new PasswordField();
		PasswordField ConfPassTxt = new PasswordField();
		TextField FNameTxt = new TextField();
		TextField LNameTxt = new TextField();
		TextField EmailTxt = new TextField();
		Label InvalidPassLabel = new Label ("Password and Confirm Password do not match.");
		InvalidPassLabel.setVisible(false);
		Label InvalidEmailLabel = new Label ("Email does not exist.");
		InvalidEmailLabel.setVisible(false);
		Label InvalidPassLengthLabel = new Label("Password must be 8 characters or more."); 
		InvalidPassLengthLabel.setVisible(false);
		Label UserLabel = new Label("Username");
		Label PassLabel = new Label("Password");
		Label ConfPassLabel = new Label("Confirm Password");
		Label FNameLabel = new Label("First Name");
		Label LNameLabel = new Label("Last Name");
		Label EmailLabel = new Label("Email");
		Label AccountLabel = new Label("Account Type");
		Button EnterBttn = new Button("Sign Up");
		//Account combo box
		ComboBox<String> AccountCombo = new ComboBox<String>();
		AccountCombo.getItems().addAll("Admin", "Faculty", "Staff", "Student", "Guest");

		//Sets default border color to black
		FNameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		LNameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		UserTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		PassTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		ConfPassTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		EmailTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");  	

		EnterBttn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0){

				String Username = UserTxt.getText();
				String Password = PassTxt.getText();
				String ConfPass = ConfPassTxt.getText(); 
				String FName = FNameTxt.getText();
				String LName = LNameTxt.getText();
				String Email = EmailTxt.getText();
				String AccType = AccountCombo.getValue();

				boolean FNameBool = false;
				boolean LNameBool = false;
				boolean UserBool = false;
				boolean PassBool = false;
				boolean EmailCheck = false;
				boolean ConfPassBool = false;
				boolean PassCorBool = false;
				boolean EmailBool = false;
				boolean AccBool = false;

				if (!FName.equals("")){
					FNameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					FNameBool = true;
				}
				else{
					FNameTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//Sets border-color to red if text box is left blank
				}
				if (!LName.equals("")){
					LNameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					LNameBool = true;
				}
				else{
					LNameTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");
				}
				if (!Email.equals("")){
					EmailBool = true;
				}
				else{
					EmailTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");
				}
				if (!Username.equals("")){
					UserTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					UserBool = true;
				}
				else{
					UserTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");
				}
				if (!Password.equals("")){
					PassBool = true;
				}
				else{
					PassTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");
				}
				if (!ConfPass.equals("")){
					ConfPassBool = true;
				}
				else{
					ConfPassTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");
				}

				int PassLength = Password.length(); //Check Password length
				System.out.println(Password.length()); 

				if((FNameBool == true) && (LNameBool == true) && (EmailBool == true) && //
						(UserBool == true) && (PassBool == true) && (ConfPassBool == true)){


					PassTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					ConfPassTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					EmailTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					System.out.println("a");

					//Checks if Password is more >= 8 characters long
					if (PassLength >= 8){
						System.out.println("b");
					}
					else{
						InvalidPassLengthLabel.setTextFill(Color.RED);
						InvalidPassLengthLabel.setVisible(true);
					}
					//Checks for Password for required input types
					if (Password.equals(ConfPass)){
						System.out.println("d");
						//Checks Password format with RegEx
						if (Password.matches(".*[a-z].*") && Password.matches(".*[A-Z].*") && Password.matches(".*[0-9].*") && (Password.matches(".*[^A-Za-z0-9].*"))){
							System.out.println("e");
							PassCorBool = true;
						}
						else{ 
							JOptionPane.showMessageDialog(null, "Password must contain lower case & upper case character, number, and special character!", "Invalid", JOptionPane.WARNING_MESSAGE);
							System.out.println("g");
						}
					}
					else{
						InvalidPassLabel.setTextFill(Color.RED);
						InvalidPassLabel.setVisible(true);
					}
					//Checks Email via RegEx
					if(Email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{3,})$")){
						EmailCheck = true;

					}
					else{
						InvalidEmailLabel.setTextFill(Color.RED);
						InvalidEmailLabel.setVisible(true);
					}
					if(AccType != null){
						//Implements the Get and Set methods
						ProjectFourPointOne person = new ProjectFourPointOne(Username, Password, AccType);
						person.toString(person.Username, person.Password, person.AccountType);
						System.exit(0); 
					}
					else{
						JOptionPane.showMessageDialog(null,"Please select and account type" );
					}

				}
				else{
					JOptionPane.showMessageDialog(null, "Please fill out all fields.", "Invalid", JOptionPane.WARNING_MESSAGE);

				}


			}
		});
		//Scene setting
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(UserLabel, 0,0);
		grid.add(PassLabel, 0,1);
		grid.add(ConfPassLabel, 0,2);
		grid.add(FNameLabel, 0,3);
		grid.add(LNameLabel, 0,4);
		grid.add(EmailLabel, 0,5);
		grid.add(AccountLabel, 0,6);
		grid.add(UserTxt, 1,0);
		grid.add(PassTxt, 1,1);
		grid.add(ConfPassTxt, 1,2);
		grid.add(FNameTxt, 1,3);
		grid.add(LNameTxt, 1,4);
		grid.add(EmailTxt, 1,5);
		grid.add(AccountCombo, 1,6);
		grid.add(EnterBttn, 1,7);
		grid.add(InvalidPassLabel, 1, 8);
		grid.add(InvalidPassLengthLabel, 1, 9);
		grid.add(InvalidEmailLabel, 1, 10);

		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args){
		launch(args);
	}
}
