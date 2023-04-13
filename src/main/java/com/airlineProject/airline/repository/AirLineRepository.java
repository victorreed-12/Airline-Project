package com.airlineProject.airline.repository;

import com.airlineProject.airline.model.AirlineTicketing;
import org.springframework.data.repository.CrudRepository;

public interface AirLineRepository extends CrudRepository<AirlineTicketing, Integer> {
}
