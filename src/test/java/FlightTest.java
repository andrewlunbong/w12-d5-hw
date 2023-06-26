import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void before(){
        cabinCrewMember1 = new CabinCrewMember("Lucy", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Jackie", Rank.LEAD_ATTENDANT);
        ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
        passenger1 = new Passenger("Shristi", 10);
        passenger2 = new Passenger("Andrew", 5);
        passenger3 = new Passenger("Angelito", 1);
        passenger4 = new Passenger("Jasmine", 2);
        ArrayList<Passenger> passengers = new ArrayList<>();
        pilot1 = new Pilot("John", Rank.CAPTAIN,"12345");
        pilot2 = new Pilot("Jack", Rank.FIRST_OFFICER,"67890");
        ArrayList<Pilot> pilots = new ArrayList<>();
        flight = new Flight("FR1234", "Lagos", "Edinburgh", "12:30pm", 40000, 10);
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);

    }



    @Test
    public void flightHasCapacity(){
        assertEquals(10, flight.getCapacity());
    }


    @Test
    public void hasFlightNumber(){
        assertEquals("FR1234", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("Lagos", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("Edinburgh", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("12:30pm", flight.getDepartureTime());
    }

    @Test
    public void flightHasTotalWeight(){
        assertEquals(40000, flight.getTotalWeightPerFlight());
    }

    @Test
    public void canBookPassenger(){
        passenger1 = new Passenger("Shristi", 10);
        passenger2 = new Passenger("Andrew", 5);
        passenger3 = new Passenger("Angelito", 1);
        passenger4 = new Passenger("Jasmine", 2);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(2, flight.availableSeat());
    }

    



}
