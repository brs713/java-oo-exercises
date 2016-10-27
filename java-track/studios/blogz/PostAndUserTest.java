package blogz;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;


public class PostAndUserTest {


    // instance properties go here

    private static boolean initialized = false;

    public PostAndUserTest() {

    	String username = "" + Math.random() * 10000;
    	String password = "" + Math.random() * 10000;
    	User u = new User("Zekey", password);    	
    	
        if (!initialized) {
            // code that should only run once goes here
            initialized = true;
        }

    }

	
	/**
	 *  USER TESTS 
	 */
	@Test
	public void testUser() {
		double username = Math.random() * 10000;
		double password = Math.random() * 10000;
		User u = new User("zekey", "" + password);
		assertTrue("user constructor is messed up", u.getUsername().equals("zekey"));
	}
	
	@Test
	public void hashPassword() {
		// tests for the effects of privatized password hashing by verifying side effects of the constructor
		double username = Math.random() * 10000;
		double password = Math.random() * 10000;
		User u = new User("zekey", "" + password);
		assertEquals("static hashPassword() isn't working", u.getHashedPassword(), ("" + password).concat("1"));
	}
	
//	@Test
//	public void isValidPassword() {
////		double username = Math.random() * 10000;
//		double password = Math.random() * 10000;
////		User u = new User("" + username, "" + password);
//		
//		
//		boolean result = User.isValidPassword("" + password);
//		assertEquals("isValidPassword() is faulty", result, true);
//	}
	
	@Test
	public void testGetAllUsers() {
		int userCount = User.getAllUsers().size();
		int limit = (int)(Math.random() * 1000);
		for (int i = 0; i < limit; ++i) {
			User u = new User("Zekey", "" + limit);
		}
		assertEquals("getAllUsers() is messed up!", User.getAllUsers().size(), userCount + limit);
	}
	
	
	
	
		
	/**
	 *  POST TESTS 
	 */
	@Test
	public void testPost() {
		String blah = "" + Math.random();
		assertEquals("testPost() doesn't work", blah, blah);
	}
	
	@Test
	public void testGetUid() {
		int userCount = User.getAllUsers().size();
		int limit = (int)(Math.random() * 1000);
		//for (int i = 0; i < limit; ++i) {
			User u = new User("Zekey", "" + limit);
		//}
		assertEquals("getAllUsers() is messed up!", u.getUid(), userCount + 1);

	}
	
}
