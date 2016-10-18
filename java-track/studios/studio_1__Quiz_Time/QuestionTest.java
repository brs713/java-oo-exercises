package studio_1__Quiz_Time;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionTest {


	//MultChoice tests
	
	@Test
	public void testGetChoices() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAChoice() {
		
		double ques = Math.random();
		double ans = Math.random(); 
		MultChoice q = new MultChoice("" + ques, "" + ans, true);

		// test adding a choice to empty array
		assertEquals("failed addAChoice()- adding to empty choice list", q.getChoices().length, 0);
		
		// tests for adding single choice to 0-length array
		double choice = Math.random();
		q.addAChoice("" + choice);

		// verify that if a single choice is entered, the array is lengthened to duplicate the choice
		//	(MultChoice must be more than 1)
		assertEquals("failed addAChoice()- lengthening array", q.getChoices().length, 2);
		
		// verify that if there's only 1 choice, 2 are created and equal each other
		assertEquals("failed addAChoice()- single choice add is doubled", q.getChoices()[0], q.getChoices()[1]);

		// test to verify that adding a second choice overwrites the doubling effect of a single element choice list
		double secondChoice = Math.random();
		q.addAChoice("" + secondChoice);
		assertNotSame("failed addAChoice()- overwriting 2nd choice in 2-length list", q.getChoices()[0], q.getChoices()[1]);
		
	}


	@Test
	public void testAddAChoice2() {

		double ques = Math.random();
		double ans = Math.random(); 
		MultChoice q = new MultChoice("" + ques, "" + ans, true);
		
		// test choices beyond 2
		int limit = (int)(Math.random() * 20) + 2;

		for(int i = 0; i < limit; i++) {
			q.addAChoice("" + i);
			assertEquals("failed addAChoice()- adding beyond 2 choices", q.getChoices()[i], ("" + i));
		}
		assertEquals("failed addAChoice()- adding beyond 2 choices - length test", q.getChoices().length, limit);
	}




	@Test
	public void testGetAskString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAskStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAnswer() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAnswer() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsType() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetType() {
		fail("Not yet implemented");
	}

}
