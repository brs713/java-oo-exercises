package studio_0__Class_Design;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testGetPerimeter() {
		Rectangle r = new Rectangle(3, 4);
		assertTrue("Problem with getPerimeter()", r.getPerimeter() == 14);
	}

	@Test
	public void testGetArea() {
		Rectangle r = new Rectangle(3, 4);
		assertTrue("Problem with getArea()", r.getArea() == 12);
	}

	@Test
	public void testIsSmaller() {
		Rectangle r = new Rectangle(3, 4);
		Rectangle s = new Rectangle(4, 5);
		assertTrue("Problem with isSmaller()", r.isSmaller(s) == true);
	}

	@Test
	public void testIsSquare() {
		Rectangle r = new Rectangle(3, 3);
		Rectangle s = new Rectangle(3, 4);
		assertTrue("Problem with isSquare()", r.isSquare() == true);
		assertFalse("Problem with isSquare()", s.isSquare() == true);
	}

}
