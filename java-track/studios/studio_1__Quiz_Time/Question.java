package studio_1__Quiz_Time;

//Your next task will be to create a program that allows the user to take a quiz.
//This means you will have to create some questions, and get some feedback from the user.
//
//First, the questions. We want to be able to handle multiple types of questions: 
		//multiple choice and 
		//fill in the blank.
//
//Consider:
//
//    What do these types of questions have in common?
//    What makes these question types different?
//
//Construct a base class (called Question.java) that contains the common features, and 
//create subclasses as necessary.
//
//Make sure that there is functionality included to 
		//display the questions, 
		//the choices (if necessary) and 
		//check to see if the answer is correct.

public class Question {
	
	//Fields:
	
	//question string
	//correct answer
	//hasChoices
	
	protected String askString;
	protected String answer;
	protected boolean hasChoices;	
	
	//Behavior:

	//display questions
	//display choices
	//check answer	
	//createQuestion
	
	//constructor
	public Question(String askString, String answer, boolean hasChoices){
		this.askString = askString;
		this.answer = answer;
		this.hasChoices = hasChoices;
	}


	public String getAskString() {
		return askString;
	}


	public void getAskString(String askString) {
		this.askString = askString;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public boolean isType() {
		return hasChoices;
	}


	public void setType(boolean type) {
		this.hasChoices = type;
	}
	
	

}
