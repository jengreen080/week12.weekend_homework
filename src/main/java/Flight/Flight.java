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

    public Flight(ArrayList<Pilot> listOfPilots, ArrayList<CabinCrew> listOfCabinCrew, ArrayList<Passenger> passengerList, String flightNumber, String destination, String departureAirport, String departureTime, double totalWeightAllowance, int flightCapacity){
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


}
