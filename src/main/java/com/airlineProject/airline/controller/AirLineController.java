package com.airlineProject.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlineProject.airline.model.AirlineTicketing;
import com.airlineProject.airline.service.AirLineService;


@RestController
@RequestMapping("/v1/app")
public class AirLineController {
	
	@Autowired
	private AirLineService service ;
	
	@GetMapping("/booking")
	public List<AirlineTicketing> getAllBookings(){
		return service.getAllAirlineBookings();
	}
	@GetMapping("/booking{id}")
	public AirlineTicketing findBookingById(@PathVariable int id) {
		return service.findBookingById(id);
	}
	@PostMapping("/booking")
	public void addBooking(AirlineTicketing booking) {
		service.addBooking(booking);
	}
	
	@PutMapping("/booking{id}")
	public void updateBooking(@PathVariable int id ,@RequestBody AirlineTicketing booking) {
		service.updateBooking(id,booking);
	}
	
    @DeleteMapping("/booking{id}")
    public void cancelBookingById(@PathVariable int id) {
    	service.cancelBookingById(id);
    }
}
