import Flight.Flight;
import Person.CrewMember.CabinCrew.CabinCrew;
import Person.CrewMember.Pilot.Pilot;
import Person.CrewMember.Rank;
import Person.Passenger.Passenger;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FlightTest {
    Flight flight;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    CabinCrew cabinCrew3;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    ArrayList<Pilot> listOfPilots;
    ArrayList<CabinCrew> listOfCabinCrew;
    ArrayList<Passenger> listOfPassengers;
    @Before
    public void before(){
        pilot1 = new Pilot("Jeff", Rank.CAPTAIN, "IT678");
        pilot2 = new Pilot("Lila", Rank.FIRST_OFFICER, "OK288");
        cabinCrew1 = new CabinCrew("Jess", Rank.LEAD_ATTENDANT);
        cabinCrew2 = new CabinCrew("Tom", Rank.FLIGHT_ATTENDANT);
        cabinCrew3 = new CabinCrew("Taylor", Rank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Jake", 2);
        passenger2 = new Passenger("Kevin", 1);
        passenger3 = new Passenger("Tad", 1);
        passenger4 = new Passenger("Justin", 3);
        passenger5 = new Passenger("Lee", 0);
        passenger6 = new Passenger("Till", 1);

        listOfPilots = new ArrayList<>();
//        listOfPilots.add(pilot1);
//        listOfPilots.add(pilot2);

        listOfCabinCrew = new ArrayList<>();
        listOfCabinCrew.add(cabinCrew1);
//        listOfCabinCrew.add(cabinCrew2);
//        listOfCabinCrew.add(cabinCrew3);

        listOfPassengers = new ArrayList<>();
        listOfPassengers.add(passenger1);
        listOfPassengers.add(passenger2);
        listOfPassengers.add(passenger3);
        listOfPassengers.add(passenger4);
        listOfPassengers.add(passenger5);
        listOfPassengers.add(passenger6);

        flight = new Flight(listOfPilots, listOfCabinCrew, listOfPassengers,"FG838","Georgia", "Heathrow", "13.00",300,10);
    }

    @Test
    public void hasPilots(){
        assertEquals(2, listOfPilots.size());
    }

    @Test
    public void hasCabinCrew(){
        assertEquals(3, listOfCabinCrew.size());
    }

    @Test
    public void hasPassengers(){
        assertEquals(6, listOfPassengers.size());
    }

    @Test
    public void canShowAvailableSeats(){
        assertEquals(4, flight.showAvailableSeats());
    }

    @Test
    public void mustHaveAtLeastOnePilot() {
        assertThrows(IllegalStateException.class, () -> {
            flight.mustHaveMoreThanOnePilot();
        });
    }

    @Test
    public void mustHaveSomeCabinCrew() {
        assertThrows(IllegalStateException.class, () -> {
            flight.hasCabinCrew();
        });
    }

    @Test
    public void canBookInAPassenger() {
        listOfPassengers.add(passenger1);
        listOfPassengers.add(passenger1);
        listOfPassengers.add(passenger1);
        listOfPassengers.add(passenger1);
        flight.checkInAPassenger(new Passenger("Keith", 1));
        assertEquals(10, listOfPassengers.size());
    }
}

