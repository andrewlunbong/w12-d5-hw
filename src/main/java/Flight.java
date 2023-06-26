import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int totalWeightPerFlight;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Pilot> pilots;
    private ArrayList<Passenger> passengers;
    private int capacity;


    public Flight(String flightNumber, String destination, String departureAirport, String departureTime, int totalWeightPerFlight, int capacity){
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.pilots = new ArrayList<Pilot>();
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.totalWeightPerFlight = totalWeightPerFlight;
        this.capacity = capacity;
    }


    public String getFlightNumber(){
        return flightNumber;
    }

    public String getDestination(){
        return destination;
    }

    public String getDepartureAirport(){
        return departureAirport;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public int getTotalWeightPerFlight(){
        return totalWeightPerFlight;
    }

    public int passengersCount(){
        return this.passengers.size();
    }

    public int availableSeat(){
        return this.capacity - this.passengersCount();
    }
    public int getCapacity() {
        return capacity;
    }


    public ArrayList<Pilot>getPilots(){
        return pilots;
    }

    public void addPilot(Pilot pilot){
        this.pilots.add(pilot);

    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public void addPassenger(Passenger passenger) {
        if (availableSeat() > 0) {
            this.passengers.add(passenger);

        }
    }
}
