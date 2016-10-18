package studio_1__Quiz_Time;

import java.util.Arrays;

public class MultChoice extends Question {

	//this is a question with 
		//question
		//correct answer
		//answer choices

	private String[] choices;
	
	public MultChoice(String question, String answer, boolean hasChoices, String[] choices) {
		super(question, answer, hasChoices);
		this.choices = choices;
	}
	
	public MultChoice(String question, String answer, boolean hasChoices) {
		super(question, answer, hasChoices);
	}
	

	// gets choices
	// if the array doesn't exist, it creates one with no choices in it.
	public String[] getChoices() {

		// if the array is doesn't exist..
		if (this.choices == null) {

			// ...create an array with 0 items.
			this.choices = new String[0];
		}
		
		// return the choice array.
		return this.choices;	
	}
	
	
	// sets choice array
	public void setChoices(String[] choices) {
		this.choices = choices;
	}

	
	// adds a choice
	public void addAChoice(String choice) {
	
		//get the existing choice array (which will create one if it doesn't exist).
		String[] choiceArray = getChoices();

		//special behaviors required for 0- & 2- length choice arrays
		if (choiceArray.length == 0) {
			
			//add space for 2 elements and add the element to both places.
			choiceArray = Arrays.copyOf(choiceArray, (choiceArray.length + 2));
			choiceArray[0] = choice;
			choiceArray[1] = choice;
		}
		
		//adding a second choice
		//if both choices are the same
		//(as in, we used the above code to force multiple choices by duplicating the only choice)
		else if (choiceArray.length == 2 && choiceArray[0] == choiceArray[1]) {

			//overwrite the second choice with the new choice.
			choiceArray[1] = choice;
			
		}
		
		//adding third or more choices
		else {

			//lengthen it
			choiceArray = Arrays.copyOf(choiceArray, (choiceArray.length + 1));

			//add the choice
			choiceArray[choiceArray.length - 1] = choice;
		}

		//set the array
		setChoices(choiceArray);
	}
	
	

}
