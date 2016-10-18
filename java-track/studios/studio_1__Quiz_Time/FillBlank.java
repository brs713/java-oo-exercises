package studio_1__Quiz_Time;

public class FillBlank extends Question {
	
	//this is a question with 
		//question
		//correct answer

	public FillBlank(String question, String answer, boolean hasChoices) {

		super(question, answer, hasChoices);
		this.hasChoices = false;
	}

}
