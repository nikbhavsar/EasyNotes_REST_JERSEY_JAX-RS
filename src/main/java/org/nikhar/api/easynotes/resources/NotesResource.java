package org.nikhar.api.easynotes.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.nikhar.api.easynotes.model.*;
import org.nikhar.api.easynotes.service.*;

@Path("/notes")
public class NotesResource {

	NoteService service = new NoteService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Note> getNotes(@QueryParam("year") int year) {

		if (year > 0) {
			service.getAllNotesPerYear(year);
		} 
	
		return service.getAllNotes();

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Note addNote(Note note) {

		return service.addNote(note);

	}

	@DELETE
	@Path("/{noteid}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteNote(@PathParam("noteid") long noteid) {

		service.removeNote(noteid);

	}

	@PUT
	@Path("/{noteid}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Note updateNote(@PathParam("noteid") long noteid, Note note) {
		note.setId(noteid);
		return service.updateNote(note);
	}

	@GET
	@Path("/{noteid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Note getNote(@PathParam("noteid") long noteid) {
		return service.getNote(noteid);
	}

}
