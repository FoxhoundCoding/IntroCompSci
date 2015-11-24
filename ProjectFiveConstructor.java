import javax.swing.JOptionPane;

public class ProjectFiveConstructor {

	double GPA = 0.0;
	String Username = "";
	double [] gradeArray = new double [4];
	double testOneGrade = 0;
	double testTwoGrade = 0;
	double testThreeGrade = 0;
	double testFourGrade = 0;

	ProjectFiveConstructor(){
		GPA = 0.0;
		Username = "empty";
		double gradeArray[] = {0.0,0.0,0.0,0.0};
		testOneGrade = 0;
		testTwoGrade = 0;
		testThreeGrade = 0;
		testFourGrade = 0;

	}

	ProjectFiveConstructor(double GradePointAverage, String Name, double T1, double T2, double T3, double T4, double TArray[]){
		GPA = GradePointAverage;
		Username = Name;
		testOneGrade = T1;
		testTwoGrade = T2;
		testThreeGrade = T3;
		testFourGrade = T4;
		double gradeArray[] = {testOneGrade,testTwoGrade,testThreeGrade,testFourGrade};


	}

	public void getGPA(double GPA){
		this.GPA = GPA;
	}
	public double setGPA(double GPA){
		return GPA;
	}
	public void getUsername(String Username){
		this.Username = Username;
	}
	public String setUsername(String Username){
		return Username;
	}
	public void getTestOneGrade(double testOneGrade){
		this.testOneGrade = testOneGrade;
	}
	public double setTestOneGrade(double testOneGrade){
		return testOneGrade;
	}
	public void toString(String Username, double GPA){
		JOptionPane.showMessageDialog(null, "Student: " + Username + " " + "Overall Average: " + Math.round(GPA));
	}
}
class AccountOutput{


	public static void main(String args[]){


	}
}
