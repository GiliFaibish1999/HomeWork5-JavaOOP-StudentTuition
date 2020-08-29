package Student_Tuition_Project;

// Gili Faibish Student Tuition project - scholarship student object
public class ScholarshipStudent extends Student implements Course {
	
	// Variables definition
	private float scolarship;
	private float former_cost;
	private float tuition;

	// This function defines the scholarship student object
	public ScholarshipStudent(String name, int course_count, float scolarship) {
		super(name, course_count);
		this.scolarship = scolarship;
	}
	
	// This function returns the tuition of a scholarship student
	public float getTuition(){
		former_cost = this.getCost();
		if ((former_cost - this.scolarship) >= max_tuition) {
			tuition = max_tuition;
		}
		else if (former_cost - this.scolarship >= 0){
			tuition = this.getCost()-scolarship;
		}
		else if (former_cost - this.scolarship <= 0){
			tuition = 0;
		}
		return this.tuition;		
	}
	
	// This function returns the scholarship
	public float getScholarship(){
		return this.scolarship;
	}
}
