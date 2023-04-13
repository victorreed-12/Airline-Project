package com.airlineProject.airline.service;

import com.airlineProject.airline.model.AirLine;
import com.airlineProject.airline.repository.AirLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirLineService {

@Autowired
    private AirLineRepository repo;
    public List<AirLine> bookings = new ArrayList<>();

    public List<AirLine> getAllAirlineBookings() {
        repo.findAll().forEach(bookings::add);
        //int airlineCapacity= 100;
        //if(airlineCapacity>100)
        System.out.println("Flight is full, check next available flight");
        return bookings;
    }
    public AirLine findOneById(int id) {
        return repo.findById(id).orElseThrow();
    }
    public void addAirline(AirLine booking) {
        repo.save(booking);
    }

    public void updateAirline(int id, AirLine booking) {
        repo.save(booking);
    }

    public void deleteById(int id) {
        repo.deleteById(id);
    }

}

