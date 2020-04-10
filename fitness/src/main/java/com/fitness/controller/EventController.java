package com.fitness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.infy.service.EventService;
import com.fitness.models.Event;



@RestController
public class EventController {
	
	@Autowired
	private EventService eventService;
	 
	//GET LIST OF EVENTS
	@RequestMapping(value = "/event", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Event>> events() {
		 
		  HttpHeaders headers = new HttpHeaders();
		  List<Event> events = eventService.listEvents();
		 
		  if (events == null) {
		   return new ResponseEntity<List<Event>>(HttpStatus.NOT_FOUND);
		  }
		  headers.add("Number Of Records Found", String.valueOf(events.size()));
		  return new ResponseEntity<List<Event>>(events, headers, HttpStatus.OK);
	}
		
	//SAVE EVENTS
	 @RequestMapping(value = "/event", method = RequestMethod.POST,consumes = "application/json")
	 public ResponseEntity<Event> addEventDetails(@RequestBody Event event) {
		  HttpHeaders headers = new HttpHeaders();
		  if (event == null) {
		   return new ResponseEntity<Event>(HttpStatus.BAD_REQUEST);
		  }
		  eventService.saveEvent(event);
		  headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
	      headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
		  headers.add("Event Created Successfully ", String.valueOf(event.getTitle()));
		  return new ResponseEntity<Event>(event, headers, HttpStatus.CREATED);
	 }

}
