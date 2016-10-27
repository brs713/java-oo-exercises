package blogz;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User extends Entity{


	private String username;
	private String hashedPassword;

	private static ArrayList<User> userList = new ArrayList<User>();


	/**
	 *	Constructor(s)
	 */
	public User(String username, String plainTextPwd) {
		super();
		try{
			isValidUsername(username);
			this.username = username;
		}
		catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException:  " + e.getMessage());
			e.printStackTrace();			
		}
		this.hashedPassword = User.hashPassword(plainTextPwd);
		User.userList.add(this);
	}


	/**
	 *	Other Methods
	 */
	public static boolean isValidUsername(String username) {

		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		Matcher m = p.matcher(username);

		if (!m.matches()) {
			throw new IllegalArgumentException("Invalid username");
		}
		return true;
	}

	public static boolean isValidPassword(String password) {			//TODO Did I implement matcher correctly?
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		Matcher m = p.matcher(password);
		return m.matches();
	}

	private static String hashPassword(String plainTextPwd) {
		return plainTextPwd.concat("1");
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


	public static ArrayList<User> getAllUsers() {
		return User.userList;
	}
}
