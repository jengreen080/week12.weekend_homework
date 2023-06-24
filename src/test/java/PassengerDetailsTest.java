import Flight.PassengerDetails;
import Person.Passenger.Passenger;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class PassengerDetailsTest {

    PassengerDetails passengerDetails;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before() {
        passenger1 = new Passenger("Oscar", 1);
        passenger2 = new Passenger("Rusty", 1);
        HashMap<Passenger, String> passengerDetails = new HashMap<>();
        passengerDetails.put(passenger1, "Destination: Edinburgh");
        passengerDetails.put(passenger2, "Destination: Rio");
    }

//    @Test
//    public void accessHashmapValue(){
//        assertEquals("Destination: Rio", passengerDetails.showHashmap());
//    }

    @Test
        public void accessHashmapValue(){
            assertEquals("Destination: Rio", passengerDetails.showHashmap().values());
        }
}
