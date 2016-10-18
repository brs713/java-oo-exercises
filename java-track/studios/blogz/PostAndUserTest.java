package blogz;

import static org.junit.Assert.*;

import org.junit.Test;



//Create a User class with properties to represent username and hashed password.****
//The constructor should take in a password in plain text (that is, non-hashed) and**** 
//call a private static method hashPassword**** 
//	to generate the hashed password before**** 
//	
//setting the appropriate instance property.**** 
//
//For now, this method can just return the the password that is passed in, unchanged. We'll implement hashing later on.****
//
//		
//Write a method to verify a password against its hash, isValidPassword.****
//
//In the User class, write a ****
//static method isValidPassword that**** 
//	returns a boolean signifying whether or not the given string is valid.****
//	
//Add a static property of type List<User> 
//	to hold the list of all users along with 
//	
//a method to return this list. 
//
//This is similar to what you did in Gradebook Revisited. 
//Note that List is an interface, so 
//	you'll need to choose an appropriate implemented type, such as ArrayList, when initializing this property.


//In the User class, write a static method isValidUsername that 
//	returns a boolean signifying whether or not the given string is valid. 
//	A username should be considered valid if it is 
//	4-12 characters long, 
//	starts with a letter, and 
//	contains only letters, numbers, -, and _. 
//	This check should happen in the constructor, and an appropriate 
//	exception should be thrown if the username is not valid. (*not a try/catch yet?)
//	For this task, use the Pattern class, following the pattern used near the top of the linked reference page. 
//	The regular expression to use is: [a-zA-Z][a-zA-Z0-9_-]{4,11}.


public class PostAndUserTest {


	/**
	 *  USER TESTS 
	 */
	@Test
	public void testUser() {
		double username = Math.random() * 10000;
		double password = Math.random() * 10000;
		User u = new User("" + username, "" + password);
		assertTrue("user constructor is messed up", u.getUsername().equals("" + username));
	}
	
	@Test
	public void hashPassword() {
		// tests for the effects of privatized password hashing by verifying side effects of the constructor
		double username = Math.random() * 10000;
		double password = Math.random() * 10000;
		User u = new User("" + username, "" + password);
		assertEquals("static hashPassword() isn't working", u.getHashedPassword(), ("" + password).concat("1"));
	}
	
	@Test
	public void isValidPassword() {
//		double username = Math.random() * 10000;
//		double password = Math.random() * 10000;
//		User u = new User("" + username, "" + password);
		boolean result = User.isValidPassword();
		assertEquals("isValidPassword() is faulty", result, true);
	}
	
	@Test
	public void testGetAllUsers() {
		int userCount = User.getAllUsers().size();
		int limit = (int)(Math.random() * 1000);
		for (int i = 0; i < limit; ++i) {
			User u = new User("" + limit, "" + limit);
		}
		assertEquals("getAllUsers() is messed up!", User.getAllUsers().size(), userCount + limit);
	}
	
	
	
	/**
	 *  POST TESTS 
	 */
	@Test
	public void testPost() {
		Post blah = new Post();
		assertEquals("testPost() doesn't work", blah, blah);
	}



}
