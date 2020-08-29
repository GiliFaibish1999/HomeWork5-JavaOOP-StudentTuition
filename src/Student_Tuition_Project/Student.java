package Student_Tuition_Project;

// Gili Faibish Student Tuition project - student general definitions
public abstract class Student implements Course{
	
	// Variables definition
	private String name;
	private int course_count;
	private float tuition;
	private float cost;
		
	// This function defines the student attributes, students are later created accordingly  
	public Student(String name, int course_count){
		this.name= name;
		this.course_count = course_count;
	}

    // This function returns the cost before the limitation 
	public float getCost(){
		cost = course_count * course_cost;
		return this.cost;
	}
		
	// This function returns the tuition of a student
	public float getTuition(){
		cost = getCost();
		if (cost <= max_tuition) {
			tuition = cost;
		}
		else {
			tuition = max_tuition;
		}
		return this.tuition;
	}
	
	// This function returns the number of courses
	public int getCourseCount(){
		return this.course_count;
	}
	
	// This function returns the name of the student
	public String getName(){
		return this.name;
	}
}
