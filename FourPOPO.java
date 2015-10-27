package FXPackage;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FourPointOnePartOne extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Four Point One Part One");
		TextField UserTxt = new TextField();
		TextField PassTxt = new TextField();
		Label UserLabel = new Label("Username");
		Label PassLabel = new Label("Password");
		Button EnterBttn = new Button("Enter");
		EnterBttn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0){

				int Index = 0;
				String UserIn = "";
				String PassIn = "";
				String AccIn = "";
				String[] SetUser = {"UserOne", "UserTwo", "UserThree"};
				String[] SetPass = {"PassOne", "PassThree", "PassThree"}; 
				String[] SetAcc = {"Admin", "Student", "Staff"};
				boolean Loop = false;
				boolean AccLoop = false; 

				UserIn = UserTxt.getText();
				PassIn = PassTxt.getText();

				while(Index < 3 && Loop == false)
				{
					if((UserIn.equals(SetUser[Index])) && (PassIn.equals(SetPass[Index]))){
						JOptionPane.showMessageDialog(null, "Wecome " + UserIn);
						Loop = true;
					}
					else{
						Index++;
					}
				}
				if( Loop == true){
					do{
						AccIn = (String) JOptionPane.showInputDialog(null, "Choose account type:  ","Account Type",JOptionPane.QUESTION_MESSAGE, null,SetAcc, SetAcc[0]); 
						System.out.println(AccIn);
						if(AccIn.equals(SetAcc[Index])){
							JOptionPane.showMessageDialog(null, "Wecome " + AccIn + ": " + UserIn + "!");
							AccLoop = true;
						}
						else{
							JOptionPane.showMessageDialog(null, "Incorrect Account Choice!", "Error", JOptionPane.WARNING_MESSAGE);
						}
					} while (AccLoop == false);
				}
				else{
					JOptionPane.showMessageDialog(null, "Incorrect Username or Password!", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(UserLabel, 0,0);
		grid.add(PassLabel, 0,1);
		grid.add(UserTxt, 1,0);
		grid.add(PassTxt, 1,1);
		grid.add(EnterBttn, 1,2);

		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

