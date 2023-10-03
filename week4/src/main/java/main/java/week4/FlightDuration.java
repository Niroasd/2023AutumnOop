package main.java.week4;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class FlightDuration extends AirplaneFlight {
    public FlightDuration(int flightNumber, Airports departureAirport, LocalTime departureTime, Airports arrivalAirport,
            LocalTime arrivalTime) {
        super(flightNumber, departureAirport, departureTime, arrivalAirport, arrivalTime);
    }

    public Double duration() {
        double flightDuration = this.getDepartureTime().until(this.getArrivalTime(), ChronoUnit.MINUTES);
        return flightDuration;
    }

    public static void main(String[] args) {

        FlightDuration flight1 = new FlightDuration(666, Airports.HEL, LocalTime.of(8, 00), Airports.TKU,
                LocalTime.of(9, 15));
        FlightDuration flight2 = new FlightDuration(349, Airports.JYV, LocalTime.of(13, 42), Airports.POR,
                LocalTime.of(18, 22));

        System.out.println("The flight from " + (flight1.getDepartureAirport()) + " to "
                + (flight1.getDestinationAirport()) + " Takes " + flight1.duration() + " Minutes.");

        System.out.println("The flight from " + (flight2.getDepartureAirport()) + " to "
                + (flight2.getDestinationAirport()) + " Takes " + flight2.duration() + " Minutes.");
    }
}
