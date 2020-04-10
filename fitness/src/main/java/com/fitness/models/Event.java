package com.fitness.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "fitness_event")
public class Event {
	
	@Id
	@Column(name = "event_id")
	public int eventId;
	
	@Column(name = "title")
	public String title;
	
	@Column(name = "description")
	public String description;
    
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Column(name = "event_time")
    private Date eventTime;
	
	@Embedded
    private EventLocation eventLocation;
    
    @Column(name = "added_by")
	public int addedBy;
    
   // @Column(name = "")
	//public List<Integer> empAttendingEvent;
	
	public Event(int eventId, String title, String description, Date eventTime, int addedBy, EventLocation eventLocation) {
		super();
		this.eventId = eventId;
		this.title = title;
		this.description = description;
		this.eventTime = eventTime;
		this.addedBy = addedBy;
		this.eventLocation = eventLocation;
	}
	public Event() {
		
	}
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getEventTime() {
		return eventTime;
	}
	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}
	public int getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(int addedBy) {
		this.addedBy = addedBy;
	}
	
	public EventLocation getEventLocation() {
		return eventLocation;
	}
	
	public void setEventLocation(EventLocation eventLocation) {
		this.eventLocation = eventLocation;
	}

}
