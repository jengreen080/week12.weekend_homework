package Flight;

import Person.Passenger.Passenger;

import java.util.HashMap;

public class PassengerDetails {

    private HashMap<Passenger, String> passengerDetails;

    public PassengerDetails(HashMap<Passenger, String> passengerDetails){
        this.passengerDetails = passengerDetails;
    }

    public void addPassengerhtDetails(Passenger passenger, String time){
        passengerDetails.put(passenger, time);
    }

    public HashMap<Passenger, String> showHashmap(){
        return passengerDetails;
    }
}
