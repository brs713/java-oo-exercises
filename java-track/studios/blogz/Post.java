package blogz;

import java.util.Date;

public class Post extends Entity{

	
//	reate a Post class with properties to represent a blog post's body and title, along author and created properties
	//(this last one should be of type Date from the java.util.Date package). 
	//The created property should not be updated after it is set, to declare it as final 
	//(and read up on final properties while you're at it): private final Date created;
	
//	Add a property to keep track of when the post is modified. Unlike created, this property should be modifiable, 
	//and your methods should update it appropriately when changing the title or body fields.
//	Finally, make sure you've tested all of the behaviors that you've coded, paying attention to the note below.	
//	
	
	private String body;
	private String title;
	private String author;
	private final Date created;
	
	private Date modified;

	public Post(String body, String title, String author, Date created, Date modified) {
		super();
		this.body = body;
		this.title = title;
		this.author = author;
		this.created = created;
		this.modified = modified;
	}

	
	/**
	 *	Getters & Setters
	 */
	//Body
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
		
	}
	
	//Title
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		setModified();
	}

	//Author
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
		setModified();
	}

	//Modified
	public Date getModified() {
		return modified;
	}

	public void setModified() {
		this.modified = new Date();
	}

	//Created
	public Date getCreated() {
		return created;
	}
	

}
