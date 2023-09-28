package main.java.week4;

public class FlightDuration extends AirplaneFlight {
    public Double Duration() {
        double flightDuration = getArrivalTime() - getDepartureTime();
        return flightDuration;
    }
}
