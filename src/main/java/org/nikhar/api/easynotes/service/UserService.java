package org.nikhar.api.easynotes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.nikhar.api.easynotes.database.DatabaseClass;
import org.nikhar.api.easynotes.model.User;

public class UserService {
	private Map<String, User> users = DatabaseClass.getUser();
	
	public UserService(){
		users.put("Nikhar",new User( 1,"Nikhar","Bhavsar","Nik"));
	}

	
	public List<User> getAllUser(){
		
		return new ArrayList<User>(users.values());
	}
	public User getUser(String userName){
		return users.get(userName);
	}
	
	public User addUser(User user){
		
		user.setId(users.size() + 1);
		users.put(user.getUsername(), user);
		return user;
	}
	public User updateUser(User user){
		if(user.getUsername().isEmpty()){
			return null;
		}else{
		users.put(user.getUsername(), user);
		return user;
		}
		
	}
	public User removeUser(String userName){
		
		return users.remove(userName);
	}
}
