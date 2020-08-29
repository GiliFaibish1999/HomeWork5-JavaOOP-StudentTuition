package Student_Tuition_Project;

// Imports
import java.util.ArrayList;
import java.util.Random;

// Gili Faibish Student Tuition project - main class
public class DriverMain {
	public static void main(String[] args) {
		
		// Definition of an array list of students
		ArrayList<Student> Students_Array = new ArrayList<Student>(); 
		
		// Fills the students list with 10 students - Both standard and scholar,
	    // with a random number of courses and a random scholarship value (for the scholars)
		for (int i = 0; i < 5; i++) {
			
			// Random integers definition
			int scolarcoursecount = new Random().nextInt(6);
			int thisscolarship = new Random().nextInt(1000);
			int standardcoursecount = new Random().nextInt(6);
			
			// Makes sure every student has at least one course, and adds one if not
			if (scolarcoursecount<=0){
				scolarcoursecount = 1;
			}
			else {
				;
			}
			if (standardcoursecount<=0){
				standardcoursecount = 1;
			}
			else {
				;
			}
			
			// Creates and add a random scholar student to the list
			Student scostu = new ScholarshipStudent("Scholar" + (Students_Array.size()+1) ,  scolarcoursecount, thisscolarship+10 );
			Students_Array.add(scostu);
			
			// Creates and add a random standard student to the list
			Student stastu = new StandardStudent("Standard" +(Students_Array.size()+1), standardcoursecount);			
			Students_Array.add(stastu);
		}
		
		// Iterates over the students array and prints the name and tuition of each student
		for (int i = 0; i < Students_Array.size(); i++) {
			System.out.println("Name: " + Students_Array.get(i).getName() + ", Tuition: " + Students_Array.get(i).getTuition());			
		}
	}
}
