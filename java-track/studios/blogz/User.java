package blogz;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

	
	//Create a User class with properties to represent username and hashed password.
	//The constructor should take in a password in plain text (that is, non-hashed) and 
//****	//call a private static method hashPassword 
//		to generate the hashed password before 
	//setting the appropriate instance property. 
	//
	//For now, this method can just return the the password that is passed in, unchanged. We'll implement hashing later on.
	//
//			
	//Write a method to verify a password against its hash, isValidPassword.
	//
	//In the User class, write a 
	//static method isValidPassword that 
//		returns a boolean signifying whether or not the given string is valid. 
	//	
	//A username should be considered valid if it is 
//		4-12 characters long, 
//		starts with a letter, and 
//		contains only letters, numbers, -, and _. 
	//	
//		This check should happen in the constructor, and 
//			an appropriate exception should be thrown 
//				if the password is not valid. 
//				
	//For this task, use the Pattern class, following 
//		the pattern used near the top of the linked reference page. T
//		he regular expression to use is: [a-zA-Z][a-zA-Z0-9_-]{4,11}.
	//	
	//Add a static property of type List<User> 
//		to hold the list of all users along with 
	//	
	//a method to return this list. 
	//
	//This is similar to what you did in Gradebook Revisited. 
	//Note that List is an interface, so 
//		you'll need to choose an appropriate implemented type, such as ArrayList, when initializing this property.

	private String username;
	private String hashedPassword;
	
	private static ArrayList<User> userList = new ArrayList<User>();
	
	
	/**
	 *	Constructor(s)
	 */
	public User(String username, String plainTextPwd) {
		super();
		this.username = username;
		this.hashedPassword = User.hashPassword(plainTextPwd);
		User.userList.add(this);
	}

	
	/**
	 *	Getters & Setters
	 */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	
	/**
	 *	Other Methods
	 */
	private static String hashPassword(String plainTextPwd) {
		return plainTextPwd.concat("1");
	}

	public static boolean isValidPassword() {
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		Matcher m = p.matcher("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		return m.matches();
	}
	
	//Add a static property of type List<User> 
//	to hold the list of all users along with 
//	
//a method to return this list. 
	public static ArrayList<User> getAllUsers() {
		return User.userList;
	}
}
