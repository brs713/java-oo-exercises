import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {

	@Test
	public void testMove() {
		Robot r = new Robot("Sarge", new int[]{1, 2}, 20, 90);
		r.move();
		assertTrue("Problem with move()", r.getX() == 1 && r.getY() == 22);
}

	@Test
	public void testRotate() {
		Robot r = new Robot("Sarge", new int[]{1, 2}, 20, 90);
		r.rotate(180);
		assertTrue("Problem with rotate()", r.getOrientation() == 270);
	}

	@Test
	public void testDistanceFromRobot() {
		Robot r = new Robot("Sarge", new int[]{1, 2}, 20, 90);
		Robot s = new Robot("Siri", new int[]{1, 5}, 10, 270);
		assertTrue("Problem with distanceFromRobot()", r.distanceFromRobot(s) == 3);
	}

}
