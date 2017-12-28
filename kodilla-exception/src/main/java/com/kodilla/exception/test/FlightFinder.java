package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> airports = new HashMap<String, Boolean>();
        airports.put("GDA", true);
        airports.put("HAM", true);
        airports.put("LAX", true);
        airports.put("JFK", false);
        airports.put("KRK", false);


        if(airports.containsKey(flight.getDepartureAirport()) && airports.containsKey(flight.getArrivalAirport()) && airports.get(flight.getDepartureAirport()) == true && airports.get(flight.getArrivalAirport()) == true) {

            System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available.");

        } else if (airports.containsKey(flight.getDepartureAirport()) && airports.containsKey(flight.getArrivalAirport())) {

            System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is not available.");
            System.out.println("Airport is not accepting flights either at requested departure location or at requested arrival location.");

        } else {

            throw new RouteNotFoundException("No airport exists at either requested departure location or at requested arrival location.");

        }
    }
}