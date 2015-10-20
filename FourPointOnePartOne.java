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

public class FourPointOnePartTwo extends Application {

	int Limit = 3;
	int Try = 0;
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Four Point One Part Two");
		TextField UserTxt = new TextField();
		TextField PassTxt = new TextField();
		Label UserLabel = new Label("Username");
		Label PassLabel = new Label("Password");
		Button EnterBttn = new Button("Enter");
		

		EnterBttn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0){

				String UserIn = "";
				String PassIn = "";
				String[] SetUser = {"UserOne"};
				String[] SetPass = {"PassOne"};  


				UserIn = UserTxt.getText();
				PassIn = PassTxt.getText();


				if((UserIn.equals(SetUser[0])) && (PassIn.equals(SetPass[0]))){
					JOptionPane.showMessageDialog(null, "Wecome " + UserIn);
					System.exit(0);
				}
				else{ 
					JOptionPane.showMessageDialog(null, "Incorrect Username or Password!", "Error", JOptionPane.WARNING_MESSAGE);
					Try++;

				}

				if (Try == Limit){
					JOptionPane.showMessageDialog(null, "Please contact your adminstrator to unlock your account!", "Error", JOptionPane.WARNING_MESSAGE);
					System.exit(0);
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
