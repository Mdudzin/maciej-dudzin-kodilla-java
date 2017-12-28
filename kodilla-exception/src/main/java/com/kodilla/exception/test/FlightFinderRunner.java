package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String args[]) {

        FlightFinder flightFinder = new FlightFinder();

        Flight[] flightsEnquired = new Flight[10];
        flightsEnquired[0] = new Flight("GDA", "KRK");
        flightsEnquired[1] = new Flight("GDA", "LAX");
        flightsEnquired[2] = new Flight("GDA", "HAM");
        flightsEnquired[3] = new Flight("GDA", "BJS");
        flightsEnquired[4] = new Flight("KRK", "PEK");
        flightsEnquired[5] = new Flight("LAX", "SVO");
        flightsEnquired[6] = new Flight("TXL", "KTW");
        flightsEnquired[7] = new Flight("HAM", "LAX");
        flightsEnquired[8] = new Flight("LAX", "KRK");
        flightsEnquired[9] = new Flight("LAX", "JFK");

        int n = 1;


        for(Flight flight: flightsEnquired) {

            System.out.println("Flight enquired #" + n + ": from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + ".");

            try {

                flightFinder.findFlight(flight);

            } catch (RouteNotFoundException e) {

                System.out.println(e);

            } finally {

                System.out.println();
                n++;

            }
        }
    }
}