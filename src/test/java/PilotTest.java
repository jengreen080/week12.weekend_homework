import Person.CrewMember.Pilot.Pilot;
import Person.CrewMember.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Jason", Rank.FIRST_OFFICER, "TF2938D");
    }

    @Test
    public void canFlyPlane(){
        assertEquals("IN THE CLOUDS", pilot.flyPlane());
    }

    @Test
    public void hasName(){
        assertEquals("Jason", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FIRST_OFFICER, pilot.getRank());
    }

    @Test
    public void canSetName(){
        pilot.setName("Megan");
        assertEquals("Megan", pilot.getName());
    }

    @Test
    public void canSetRank(){
        pilot.setRank(Rank.CAPTAIN);
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }
}
