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
import javax.ws.rs.core.MediaType;

import org.nikhar.api.easynotes.model.User;
import org.nikhar.api.easynotes.service.UserService;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
	
	private UserService uservice = new UserService();
	
	@GET
	public List<User> getAllUser(){
		return uservice.getAllUser();
	}
	@POST
	public User addNewUser(User user){
		return uservice.addUser(user);
	}
	@GET
	@Path("/{UserName}")
	public User getUser(@PathParam("UserName") String userName){
		return uservice.getUser(userName);
	}
	@PUT
	@Path("/{UserName}")
	public User updateNewUser(@PathParam("UserName") String userName, User user){
     	user.setUsername(userName);
     	return uservice.updateUser(user);
     	
	}
	@DELETE
	@Path("/{UserName}")
	public User removeUser(@PathParam("UserName") String userName){
		return uservice.removeUser(userName);
	}
	

}
