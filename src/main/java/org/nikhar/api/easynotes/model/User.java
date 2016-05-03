package org.nikhar.api.easynotes.model;

public class User {
	
	private long id;
	private String username;
	private String firstname;
	private String lastname;
	
	public User(){
		
	}
	
	
	public User(long id, String username, String firstname, String lastname) {
		
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
