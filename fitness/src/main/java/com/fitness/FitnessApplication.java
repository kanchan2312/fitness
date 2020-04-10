package com.fitness;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.fitness.dao.EventRepository;
import com.fitness.infy.service.EventService;
import com.fitness.models.Event;
import com.fitness.models.EventLocation;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class FitnessApplication  implements CommandLineRunner {
	

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	EventRepository eventRepository;
	
	@Autowired
	EventService eventService;
	
	public static void main(String[] args) {
		SpringApplication.run(FitnessApplication.class, args);
		
	}
	@Override
    public void run(String... args)  {
        System.out.println("StartApplication...");
        runJDBC();
    }
	
	void runJDBC() {
		System.out.println("Creating tables for testing...");

        jdbcTemplate.execute("DROP TABLE fitness_event IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS fitness_event(" +
                "event_id SERIAL, title VARCHAR(255), description VARCHAR(255),"
                + "event_time TIMESTAMP, added_by NUMERIC(15, 2), latitude NUMERIC(15, 2) , longitude NUMERIC(15, 2))");
        
        //Dummy entry
        EventLocation eventLoc = new EventLocation();
        eventLoc.setLatitude(1234.34);
        eventLoc.setLongitude(134.34);
        Event event = new Event(1,"test event", "test description", new Date(), 123, eventLoc);
        eventService.saveEvent(event);
		
	}
}
