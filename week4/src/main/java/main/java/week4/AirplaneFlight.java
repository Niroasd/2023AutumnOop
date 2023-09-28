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
    private int departureTime;
    private Airports arrivalAirport;
    private int arrivalTime;

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

    public int getDepartureTime() {
        return this.departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    // constructor with dep and arrival times.
    public AirplaneFlight(int flightNumber, Airports departureAirport, int departureTime, Airports arrivalAirport,
            int arrivalTime) {
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
        this.departureTime = 0;
        this.arrivalAirport = arrivalAirport;
        this.arrivalTime = 0;
    }
}