package org.nikhar.api.easynotes.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;



import org.nikhar.api.easynotes.database.DatabaseClass;
import org.nikhar.api.easynotes.model.*;

public class NoteService {
	
	private Map<Long,Note> notes = DatabaseClass.getNote();
	
	public NoteService(){
		notes.put(1L,new Note(1,"Hey","Nikhar","11",1111.000,12.585));
		notes.put(2L,new Note(2,"Good Day","Vedant","11",152.000,12.885));	
	}
	
	public List<Note> getAllNotesPerYear(int year){
		List<Note> getNoteperYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for(Note note : notes.values()){
			cal.setTime(note.getCreated());
			if(cal.get(Calendar.YEAR) == year){
				getNoteperYear.add(note);
			}
		}
		return getNoteperYear;
	}
	public List<Note> getAllMessagePerPage(int start , int number){
		
		ArrayList<Note> specificlist = new ArrayList<Note>(notes.values());
		if(start+number < specificlist.size()){
			return new ArrayList<Note>();
		}
		return specificlist.subList(start, start+number);
	}
	public List<Note> getAllNotes(){

		return new ArrayList<Note>(notes.values());
		
	}
	public Note getNote(long id){
		return notes.get(id);
	}
	public Note addNote(Note note){
		note.setId(notes.size()+1);
		notes.put(note.getId(),note);
		return note;
	}
	public Note updateNote(Note note){
		if(note.getId()<=0){
			return null;
		}
		notes.put(note.getId(),note);
		return note;
		
	}
	public Note removeNote(long id){
		return notes.remove(id);
		
	}
	
	

}
