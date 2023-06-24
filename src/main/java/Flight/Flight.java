package Flight;

import Person.CrewMember.CabinCrew.CabinCrew;
import Person.CrewMember.Pilot.Pilot;
import Person.Passenger.Passenger;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> listOfPilots;
    private ArrayList<CabinCrew> listOfCabinCrew;
    private ArrayList<Passenger> passengerList;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private double totalWeightAllowance;
    private int flightCapacity;

    public Flight(ArrayList<Pilot> listOfPilots, ArrayList<CabinCrew> listOfCabinCrew, ArrayList<Passenger> passengerList, String flightNumber, String destination, String departureAirport, String departureTime, double totalWeightAllowance, int flightCapacity) {
        this.listOfPilots = listOfPilots;
        this.listOfCabinCrew = listOfCabinCrew;
        this.passengerList = passengerList;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.totalWeightAllowance = totalWeightAllowance;
        this.flightCapacity = flightCapacity;
    }

    public void mustHaveMoreThanOnePilot(){
        if (listOfPilots.size() < 1) {
            throw new IllegalStateException("Flight must have at least one pilot");
        }
    }

    public void hasCabinCrew(){
        if (listOfCabinCrew.size() < 2) {
            throw new IllegalStateException("Flight must have cabin crew");
        }
    }

    public void addPilot(Pilot pilotToAdd){
        listOfPilots.add(pilotToAdd);
    }
    public void addCabinCrew(CabinCrew cabinCrewToAdd){
        listOfCabinCrew.add(cabinCrewToAdd);
    }
    public void addPassenger(Passenger passengerToAdd){
        passengerList.add(passengerToAdd);
    }

    public int showAvailableSeats(){
        return this.flightCapacity - this.passengerList.size();
    }

    public void checkInAPassenger(Passenger newPassenger){
        if (passengerList.size() < flightCapacity){
            passengerList.add(newPassenger);
        }
    }

}
