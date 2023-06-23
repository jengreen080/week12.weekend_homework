import Person.CrewMember.Pilot.Pilot;
import Person.CrewMember.Rank;
import Person.Passenger.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    @Before
    public void before(){
        passenger = new Passenger("Fred", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Fred", passenger.getName());
    }

    @Test
    public void canSetName(){
        passenger.setName("Mike");
        assertEquals("Mike", passenger.getName());
    }
}
