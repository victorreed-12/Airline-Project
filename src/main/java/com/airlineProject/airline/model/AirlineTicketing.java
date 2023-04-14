package com.airlineProject.airline.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class AirlineTicketing {
     @Id
    private long id;
     private Long ticketNumber;
     private String tripType;
    private String customerName;
    private String gender;
    private long contactNumber;
    private String email;
    private String airLine;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private LocalDateTime returnDateTime;
    private String departure;
    private String destination;
    private String returnDeparture;
    private String returnDestination;

    public AirlineTicketing() {
    }

    public AirlineTicketing(long id, Long ticketNumber, String tripType, String customerName, String gender, long contactNumber, String email, String airLine, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, LocalDateTime returnDateTime, String departure, String destination, String returnDeparture, String returnDestination) {
        this.id = id;
        this.ticketNumber = ticketNumber;
        this.tripType = tripType;
        this.customerName = customerName;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.email = email;
        this.airLine = airLine;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.returnDateTime = returnDateTime;
        this.departure = departure;
        this.destination = destination;
        this.returnDeparture = returnDeparture;
        this.returnDestination = returnDestination;
    }

    @Override
    public String toString() {
        return "AirlineTicketing{" +
                "id=" + id +
                ", ticketNumber=" + ticketNumber +
                ", tripType='" + tripType + '\'' +
                ", customerName='" + customerName + '\'' +
                ", gender='" + gender + '\'' +
                ", contactNumber=" + contactNumber +
                ", email='" + email + '\'' +
                ", airLine='" + airLine + '\'' +
                ", departureDateTime=" + departureDateTime +
                ", arrivalDateTime=" + arrivalDateTime +
                ", returnDateTime=" + returnDateTime +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", returnDeparture='" + returnDeparture + '\'' +
                ", returnDestination='" + returnDestination + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Long ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public LocalDateTime getReturnDateTime() {
        return returnDateTime;
    }

    public void setReturnDateTime(LocalDateTime returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getReturnDeparture() {
        return returnDeparture;
    }

    public void setReturnDeparture(String returnDeparture) {
        this.returnDeparture = returnDeparture;
    }

    public String getReturnDestination() {
        return returnDestination;
    }

    public void setReturnDestination(String returnDestination) {
        this.returnDestination = returnDestination;
    }
}
