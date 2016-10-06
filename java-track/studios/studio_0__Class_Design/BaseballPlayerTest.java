package studio_0__Class_Design;

import static org.junit.Assert.*;

import org.junit.Test;

public class BaseballPlayerTest {

//TODO:  determine & code expressions to replace the 'true' in the assertTrue lines 
	
	@Test
	public void testRecordHits() {
		BaseballPlayer bp = new BaseballPlayer("Jackie", 79, true, false, 60, 243, 27, 9001);
		bp.recordHits(2);
		assertTrue("Problem with recordHits()", bp.getHits() == 9003);
	}

	@Test
	public void testRecordRBIs() {
		BaseballPlayer bp = new BaseballPlayer("Jackie", 79, true, false, 60, 243, 27, 9001);
		bp.recordRBIs(5000);
		assertTrue("Problem with recordRBIs()", bp.getRBIs() == 5243);
	}

}
