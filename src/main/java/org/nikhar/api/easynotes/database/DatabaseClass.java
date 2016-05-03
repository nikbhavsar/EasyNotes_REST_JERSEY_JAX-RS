package org.nikhar.api.easynotes.database;

import java.util.HashMap;
import java.util.Map;

import org.nikhar.api.easynotes.model.Note;
import org.nikhar.api.easynotes.model.User;

public class DatabaseClass {
	
	private static Map<Long, Note> notes = new HashMap<>(); 
	private static Map<String, User> allusers = new HashMap<>();
	
	public static Map<Long,Note> getNote(){
		return notes;
	}
	public static Map<String,User> getUser(){
		return allusers;
	}

}
