
import java.util.ArrayList;
import java.util.Arrays;

public class Course {
	
	//Fields:
	
	//name
	//credits
	//number of seats remaining
	//roster of students
	
	private String name;
	private int credits;
	private int numSeatsRemaining;
	private Student[] roster;

//	create static class member to collect all of your courses
	private static ArrayList<Course> courseList = new ArrayList<Course>();
	
	
//	add a static method getAllCourses()
//	returns an ArrayList of all courses.
	public static ArrayList<Course> getAllCourses() {
		return courseList;
	}
	
	
	public Course(String name, int credits, int numSeatsRemaining, Student[] roster) {
		this.name = name;
		this.credits = credits;
		this.numSeatsRemaining = numSeatsRemaining;
		this.roster = roster;
		courseList.add(this);
	}
	
	public Course(String name, int credits, int numSeatsRemaining) {
		this.name = name;
		this.credits = credits;
		this.numSeatsRemaining = numSeatsRemaining;
		courseList.add(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getRemainingSeats() {
		return this.numSeatsRemaining;
	}
	
	public boolean addStudent(Student kid) {

		boolean isEnrolled = false;		
	
		//if roster is null
		if (this.roster == null) {

			//create roster (length = 1)
			this.roster = new Student[1];

			//add student
			this.roster[0] = kid;
			
			//update seats
			--this.numSeatsRemaining;
			
			//return true
			return true;
		}

		//else
		else {
			
			//if student already in roster
			for (Student x : this.roster) {
				if (x == kid) {

					//return true
					return true;
				}

				//else
				else {

					//if class not full
					if (this.numSeatsRemaining != 0) {

						//make roster longer
						this.roster = Arrays.copyOf(this.roster, (this.roster.length + 1));

						//add student
						this.roster[this.roster.length - 1] = kid;

						//update seats
						--this.numSeatsRemaining;
						
						//return true
						return true;
					}

					//else
					else {

						//return false
						return false;
					}
				}
			}			
		}
		return isEnrolled;	
			
//		boolean isEnrolled = false;		
//		//iterate through and find kid in roster
//		if (this.roster == null) {
//			this.roster = new Student[0];
//			System.out.println("something" + kid);
//		}
//		
//		if (this.roster != null) {
//
//			//		if (Arrays.stream(this.roster).anyMatch(kid::equals)) {
//			//			isEnrolled = true;			
//			//		}
//
//			for (Student x : this.roster) {
//				if (x == kid) {
//					return true;
//				}
//			}
//		}
//
//		System.out.println("len: " + this.roster.length + " and the kid to be added is " + kid);
//		this.roster = Arrays.copyOf(this.roster, (this.roster.length + 1));
//		this.roster[this.roster.length] = kid;
//		System.out.println("len: " + this.roster.length + "  kid is " + this.roster[this.roster.length]);
//
//		return isEnrolled;
	}
	
	public String generateRoster() {

		//create empty string & add all elements in roster to string
		String list = Arrays.toString(this.roster);
		
		return list; 
	}

	public double averageGPA() {
		double totalGPA = 0.0;
		for (Student x : this.roster) {
			totalGPA += x.getGPA();
		}
		return totalGPA / this.roster.length;
	}
	
	public String toString() {
		return "Course: " + this.name + " - Credits: " + this.credits;
	}
}

