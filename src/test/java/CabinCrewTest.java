import Person.CrewMember.CabinCrew.CabinCrew;
import Person.CrewMember.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrew cabinCrew;
    Rank rank;
    @Before
    public void before() {
        cabinCrew = new CabinCrew("Tess", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Tess", cabinCrew.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrew.getRank());
    }

    @Test
    public void canRelayMessageToPassengers(){
        assertEquals("Please fasten your seatbelts", cabinCrew.relayMessageToPassengers());
    }
    @Test
    public void canSetName(){
        cabinCrew.setName("Megan");
        assertEquals("Megan", cabinCrew.getName());
    }

    @Test
    public void canSetRank(){
        cabinCrew.setRank(Rank.LEAD_ATTENDANT);
        assertEquals(Rank.LEAD_ATTENDANT, cabinCrew.getRank());
    }
}
