package studio_0__Class_Design;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTest {

//  *** I had to create getters and pull out values to perform these tests, but 
//		what's needed is an object comparing function and .equals() didn't work.
	
	@Test
	public void testMultiply() {
		Fraction f = new Fraction(3, 4);
		Fraction g = new Fraction(1, 2);
		Fraction h = new Fraction(3, 8);
		assertTrue("Problem with multiply()", f.multiply(g).getN() == h.getN() && f.multiply(g).getD() == h.getD());
	}

	@Test
	public void testReciprocate() {
		Fraction f = new Fraction(9, 12);
		Fraction r = new Fraction(12, 9);
		assertTrue("Problem with reciprocate()", f.getN() == r.getD() && f.getD() == r.getN());
	}

	@Test
	public void testSimplify() {
		Fraction f = new Fraction(12, 16);
		Fraction r = new Fraction(3, 4);
		assertTrue("Problem with simplify()", f.simplify().getN() == r.getN() && f.simplify().getD() == r.getD());
	}
}
