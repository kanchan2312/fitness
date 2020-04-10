package com.fitness.infy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.dao.EventRepository;
import com.fitness.models.Event;



@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;
	
	public List<Event> listEvents() {
		return eventRepository.findAll();
	}
	
	public void saveEvent(Event event) {
		 eventRepository.save(event);
	}
	
	public  Iterable<Event> saveEvent(List<Event> events) {
		return eventRepository.saveAll(events);
	}
	
			 
	
}

