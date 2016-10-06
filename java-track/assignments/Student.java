
public class Student {
	
//	Fields:
//	
//    Name (first
//	 and last)
//    Student ID
//    Credits
//    GPA


//	Methods:
//		
//	Constructor
//	getClassStanding()
//	submitGrade()
//	computeTuition()
//	createLegacy()
//	toString()
	
	private String f;
	private String l;
	private int id;
	private int cred;
	private double gpa;
	
	
	//CONSTRUCTORS:
	
	// basic Student constructor
	public Student (String f, String l, int id, int cred, double gpa) {
		this.f = f;
		this.l = l;
		this.id = id;
		this.cred = cred;
		this.gpa = gpa;
	}
	
	// freshman Student constructor
	public Student (String f, String l, int id) {
		this.f = f;
		this.l = l;
		this.id = id;		
	}
	

	//GETTERS:
	
	public String getName() {
		return this.f + " " + this.l;
	}
	
	public int getStudentID() {
		return this.id;
	}
	
	public int getCredits() {
		return this.cred;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	private void setGPA(double gpa) {
		this.gpa = gpa;
	}

	// returns the students class standing based on how many credits they have
	public String getClassStanding () {
		if (this.cred < 30) {
			return "Freshman";
		}
		else if (30 <= this.cred && this.cred < 60) {
			return "Sophomore";
		}
		else if (60 <= this.cred && this.cred < 90) {
			return "Junior";
		}
		else {
			return "Senior";
		}
	}
	
	public void submitGrade(double courseGrade, int courseCred) {
		double qual = this.cred * this.gpa;
		this.cred += courseCred;
		qual += (courseCred * courseGrade);
		double newgpa = (qual / this.cred) * 1000;
		newgpa = Math.round(newgpa);
		setGPA(newgpa / 1000.0); //newgpa);
		return;
	}
	
	public double computeTuition() {
		double tuition = 0;
		if (this.cred >= 15) {
			tuition = (this.cred / 15) * 20000.0;
//			System.out.println("tuition is " + tuition);
		}
		double multiplier = 1.0 / 15.0;
		//t = Math.ceil(t);
//		System.out.println("t = " + multiplier);
		double partial = Math.floor((multiplier * 20000) * 1000.0);//+ ((int) ((Math.round(this.cred % 15) / 15.0) * 20000));
//		System.out.println("Tuition 1 is " + partial);
		partial /= 1000.0;
//		System.out.println("T2 is " + partial);
		partial = Math.floor(partial * 100.0);
//		System.out.println("T3 = " + partial);
		partial /= 100.0;
//		System.out.println("T4 " + partial);
		partial *= (this.cred % 15);
		tuition += partial;
//		System.out.println("tuition is " + tuition + " and partial is " + partial);
		return tuition;
	}
	
	public Student createLegacy(Student mom, Student pop) {
		String f = mom.getName();
		String l = pop.getName();
		int id = mom.getStudentID() + pop.getStudentID();
		int cred = (mom.getCredits() > pop.getCredits()) ? mom.getCredits() : pop.getCredits();;
		double gpa = (mom.getGPA() + pop.getGPA()) / 2.0;
		Student kid = new Student(f, l, id, cred, gpa);
		return kid;
	}
	
	public String toString() {
		return "" + this.getName() + " " + this.getStudentID();
	}
	
}
