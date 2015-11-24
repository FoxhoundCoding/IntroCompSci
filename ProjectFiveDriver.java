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
 * *SET textfields, labels, action button
 *INIT variables
 *PROMPTS user for grade and weight
 *CHECKS for null input
 *IF null textbox turns to red
 *ELSE, SET booleans to true
 *CALC the overall average grade
 *CALLS to constructor class
 *PRINTS .toString via JOptionPane
 *EXITS PROGRAM
 *
 */
public class ProjectFiveDriver extends Application {

	@Override
	public void start(Stage primaryStage) {


		//set textfields,labels,and action button
		primaryStage.setTitle("Project Five");
		Label usernameLabel = new Label("Name: ");
		TextField usernameTxt = new TextField("");
		TextField testOneTxt = new TextField("");
		TextField testTwoTxt = new TextField("");
		TextField testThreeTxt = new TextField("");
		TextField testFourTxt = new TextField("");
		TextField weightOneTxt = new TextField("");
		TextField weightTwoTxt = new TextField("");
		TextField weightThreeTxt = new TextField("");
		TextField weightFourTxt = new TextField("");
		Label testLabel = new Label ("Test Grades (ex 90 or 100) ");
		Label weightLabel = new Label ("Weight (ex 0.30 0r 0.05) ");
		Button EnterBttn = new Button("Calculate");

		usernameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		testOneTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		testTwoTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		testThreeTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		testFourTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		weightOneTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		weightTwoTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		weightThreeTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
		weightFourTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");

		EnterBttn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0){

				usernameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				testOneTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				testTwoTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				testThreeTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				testFourTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				weightOneTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				weightTwoTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				weightThreeTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
				weightFourTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");

				//declare variables
				String username = "";
				String testOneString = testOneTxt.getText();
				String testTwoString = testTwoTxt.getText();
				String testThreeString = testThreeTxt.getText();
				String testFourString = testFourTxt.getText();
				String weightOneString = weightOneTxt.getText();
				String weightTwoString = weightTwoTxt.getText();
				String weightThreeString = weightThreeTxt.getText();
				String weightFourString = weightFourTxt.getText();

				double testOne = 0.0;
				double testTwo = 0.0;
				double testThree = 0.0;
				double testFour = 0.0;
				double weightOne = 0.0;
				double weightTwo = 0.0;
				double weightThree = 0.0;
				double weightFour = 0.0;

				boolean userBool = false;
				boolean testOneBool = false;
				boolean testTwoBool = false;
				boolean testThreeBool = false;
				boolean testFourBool = false;
				boolean weightOneBool = false;
				boolean weightTwoBool = false;
				boolean weightThreeBool = false;
				boolean weightFourBool = false;

				//conditions

				//username
				if (usernameTxt.getText().isEmpty())
				{
					usernameTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
				}
				else
				{
					if(!usernameTxt.getText().matches("[0-9]"))
					{
						usernameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						username = (usernameTxt.getText());
						userBool = true;
					
					}
				}

				//testOneTxt
				if (testOneTxt.getText().isEmpty())
				{
					testOneTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
				}
				else
				{
					if(testOneTxt.getText().matches("[^0-9]"))
					{
						testOneTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
					if (testOneTxt.getText().matches("\\d+\\.\\d+") || (testOneTxt.getText().matches("\\d+")))
					{
						testOne = Double.parseDouble(testOneTxt.getText());
						testOneBool = true;
						testOneTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					}
					else
					{
						testOneTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
				}

				//testTwoTxt
				if (testTwoTxt.getText().isEmpty())
				{
					testTwoTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
				}
				else
				{
					if(testTwoTxt.getText().matches("[^0-9]"))
					{
						testTwoTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
					if (testTwoTxt.getText().matches("\\d+\\.\\d+") || (testTwoTxt.getText().matches("\\d+")))
					{
						testTwo = Double.parseDouble(testTwoTxt.getText());
						testTwoBool = true;
						testTwoTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					}
					else
					{
						testTwoTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
				}

				//testThreeTxt
				if (testThreeTxt.getText().isEmpty())
				{
					testThreeTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
				}
				else
				{
					if(testThreeTxt.getText().matches("[^0-9]"))
					{
						testThreeTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
					if (testThreeTxt.getText().matches("\\d+\\.\\d+") || (testThreeTxt.getText().matches("\\d+")))
					{
						testThree = Double.parseDouble(testThreeTxt.getText());
						testThreeBool = true;
						testThreeTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					}
					else
					{
						testThreeTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
				}
				
				//testFourTxt
				if (testFourTxt.getText().isEmpty())
				{
					testFourTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
				}
				else
				{
					if(testFourTxt.getText().matches("[^0-9]"))
					{
						testFourTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
					if (testFourTxt.getText().matches("\\d+\\.\\d+") || (testFourTxt.getText().matches("\\d+")))
					{
						testFour = Double.parseDouble(testFourTxt.getText());
						testFourBool = true;
						testFourTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					}
					else
					{
						testFourTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
				}
				
				//weightOneTxt
				if (weightOneTxt.getText().isEmpty())
				{
					weightOneTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
				}
				else
				{
					if(weightOneTxt.getText().matches("[^0-9]"))
					{
						weightOneTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
					if (weightOneTxt.getText().matches("\\d+\\.\\d+") || (weightOneTxt.getText().matches("\\d+")))
					{
						weightOne = Double.parseDouble(weightOneTxt.getText());
						weightOneBool = true;
						weightOneTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					}
					else
					{
						weightOneTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
				}
				
				//weightTwoTxt
				if (weightTwoTxt.getText().isEmpty())
				{
					weightTwoTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
				}
				else
				{
					if(weightTwoTxt.getText().matches("[^0-9]"))
					{
						weightTwoTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
					if (weightTwoTxt.getText().matches("\\d+\\.\\d+") || (weightTwoTxt.getText().matches("\\d+")))
					{
						weightTwo = Double.parseDouble(weightTwoTxt.getText());
						weightTwoBool = true;
						weightTwoTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					}
					else
					{
						weightOneTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
				}
				
				//weightThreeTxt
				if (weightThreeTxt.getText().isEmpty())
				{
					weightThreeTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
				}
				else
				{
					if(weightThreeTxt.getText().matches("[^0-9]"))
					{
						weightThreeTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
					if (weightThreeTxt.getText().matches("\\d+\\.\\d+") || (weightThreeTxt.getText().matches("\\d+")))
					{
						weightThree = Double.parseDouble(weightThreeTxt.getText());
						weightThreeBool = true;
						weightThreeTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					}
					else
					{
						weightThreeTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
				}
				
				//weightFourTxt
				if (weightFourTxt.getText().isEmpty())
				{
					weightFourTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
				}
				else
				{
					if(weightFourTxt.getText().matches("[^0-9]"))
					{
						weightFourTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
					if (weightFourTxt.getText().matches("\\d+\\.\\d+") || (weightFourTxt.getText().matches("\\d+")))
					{
						weightFour = Double.parseDouble(weightFourTxt.getText());
						weightFourBool = true;
						weightFourTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
					}
					else
					{
						weightFourTxt.setStyle("-fx-border-color: red; -fx-padding: 3px;");//red
					}
				}


				//checks Bool's
				if((testOneBool == true) && (testTwoBool == true) && (testThreeBool == true) && //
						(testFourBool == true) && (weightOneBool == true) && (weightTwoBool == true) //
						&& (weightThreeBool == true) && (weightFourBool == true) && (userBool == true)){

					double comboWeights = (weightOne + weightTwo + weightThree + weightFour);
					double gradePointAverage = ((testOne*weightOne)+(testTwo*weightTwo)+(testThree*weightThree)+(testFour*weightFour));

					if (comboWeights > 1.0){
						JOptionPane.showMessageDialog(null, "Sum of weights can not be more than 100% (i.e 1.0)");
					}
					else{

						testOneTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						testTwoTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						testThreeTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						testFourTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						weightOneTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						weightTwoTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						weightThreeTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						weightFourTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");
						usernameTxt.setStyle("-fx-border-color: black; -fx-padding: 3px;");


						//calling Constructor class
						ProjectFiveConstructor newUser = new ProjectFiveConstructor();

						newUser.setUsername(username);
						newUser.setGPA(gradePointAverage);
						newUser.setTestOneGrade(testOne);
						newUser.getUsername(username);
						newUser.getGPA(gradePointAverage);
						newUser.getTestOneGrade(testOne);

						newUser.toString(newUser.Username, newUser.GPA);
						System.exit(0); 
					}
				}
				System.out.println(userBool + "" + testOneBool + "" + testTwoBool + "" + testThreeBool+ "" + testFourBool + "" + weightOneBool + "" + weightTwoBool+ "" + weightThreeBool + "" + weightFourBool);
			}
		});

		//Scene setting
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(20);
		grid.setHgap(20);
		grid.add(testLabel, 0,0);
		grid.add(testOneTxt, 0,1);
		grid.add(testTwoTxt, 0,2);
		grid.add(testThreeTxt, 0,3);
		grid.add(testFourTxt, 0,4);
		grid.add(weightLabel, 1, 0);
		grid.add(weightOneTxt, 1, 1);
		grid.add(weightTwoTxt, 1, 2);
		grid.add(weightThreeTxt, 1, 3);
		grid.add(weightFourTxt, 1, 4);
		grid.add(EnterBttn, 1,6);
		grid.add(usernameTxt, 1,5);
		grid.add(usernameLabel, 0,5);


		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args){
		launch(args);
	}
}
