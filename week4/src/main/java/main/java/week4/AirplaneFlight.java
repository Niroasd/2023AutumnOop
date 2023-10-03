package main.java.week4;

import java.time.LocalTime;

public class AirplaneFlight {
    public enum Airports {
        HEL,
        TMP,
        JYV,
        TKU,
        OUL,
        POR
    }

    private int flightNumber;

    private Airports departureAirport;
    private LocalTime departureTime;
    private Airports arrivalAirport;
    private LocalTime arrivalTime;

    // getters and setters.

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Airports getDepartureAirport() {
        return this.departureAirport;
    }

    public void setDepartureAirport(Airports departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airports getDestinationAirport() {
        return this.arrivalAirport;
    }

    public void setDestinationAirport(Airports arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalTime getDepartureTime() {
        return this.departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    // constructor with dep and arrival times.
    public AirplaneFlight(int flightNumber, Airports departureAirport, LocalTime departureTime,
            Airports arrivalAirport,
            LocalTime arrivalTime) {

        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.arrivalAirport = arrivalAirport;
        this.arrivalTime = arrivalTime;
    }

    // constructor withOUT dep and arrival times.
    public AirplaneFlight(int flightNumber, Airports departureAirport, Airports arrivalAirport) {

        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }
}