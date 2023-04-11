package com.airlineProject.airline.airLine;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class AirLine {
     @Id
    private long id;
    private String customerName;
    private String gender;
    private long contactNumber;
    private String email;
    private String airLine;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private String departure;
    private String destination;

    public AirLine() {
    }

    public AirLine(long id, String customerName, String gender, long contactNumber, String email, String airLine, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, String departure, String destination) {
        this.id = id;
        this.customerName = customerName;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.email = email;
        this.airLine = airLine;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.departure = departure;
        this.destination = destination;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", gender='" + gender + '\'' +
                ", contactNumber=" + contactNumber +
                ", email='" + email + '\'' +
                ", airLine='" + airLine + '\'' +
                ", departureDateTime=" + departureDateTime +
                ", arrivalDateTime=" + arrivalDateTime +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }@E


}
