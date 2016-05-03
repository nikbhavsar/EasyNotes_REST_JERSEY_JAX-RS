package org.nikhar.api.easynotes.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Note {
	
	private long id;
	private String note;
	private String timing;
	private Double latitude;
	private Double longitude;
	private Date created;
	private String user;
	
	public Note(){
		
	}
	
	
	public Note(long id, String note, String user,String timing,Double latitude,Double longitude) {
		
		this.id = id;
		this.note = note;
		this.user = user;
		this.timing = timing;
		this.latitude = latitude;
		this.longitude = longitude;
		this.created = new Date();
	}

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}


	public String getTiming() {
		return timing;
	}


	public void setTiming(String timing) {
		this.timing = timing;
	}


	public Double getLatitude() {
		return latitude;
	}


	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}


	public Double getLongitude() {
		return longitude;
	}


	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}
