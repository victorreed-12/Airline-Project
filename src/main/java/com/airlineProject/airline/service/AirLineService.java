package com.airlineProject.airline.service;

import com.airlineProject.airline.model.AirlineTicketing;
import com.airlineProject.airline.repository.AirLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirLineService {

@Autowired
    private AirLineRepository repo;
    public List<AirlineTicketing> bookings = new ArrayList<>();

    public List<AirlineTicketing> getAllAirlineBookings() {
        repo.findAll().forEach(bookings::add);
        return bookings;
    }
    public AirlineTicketing findBookingById(int id) {
        return repo.findById(id).orElseThrow();
    }
    public void addBooking(AirlineTicketing booking) {
        repo.save(booking);
    }

    public void updateBooking(int id, AirlineTicketing booking) {
        repo.save(booking);
    }

    public void cancelBookingById(int id) {
        repo.deleteById(id);
    }
    
    

}

