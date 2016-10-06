
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
		double t = this.cred / 15.0;
		t = Math.ceil(t);
		double tuition = (t * 20000);// + ((int) ((Math.round(this.cred % 15) / 15.0) * 20000));
		//System.out.println("T is " + t);
		return tuition;
	}
	
	public Student createLegacy(Student mom, Student pop) {
		this.f = mom.getName();
		this.l = pop.getName();
		this.id = mom.getStudentID() + pop.getStudentID();
		this.cred = (mom.getCredits() > pop.getCredits()) ? mom.getCredits() : pop.getCredits();;
		this.gpa = (mom.getGPA() + pop.getGPA()) / 2.0;
		return this;
	}
	
}
