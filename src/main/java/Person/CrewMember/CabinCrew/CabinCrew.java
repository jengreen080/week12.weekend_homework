package Person.CrewMember.CabinCrew;

import Person.CrewMember.CrewMember;
import Person.CrewMember.Rank;
import com.sun.xml.internal.bind.v2.TODO;

public class CabinCrew extends CrewMember {
    private String name;
    private Rank crewMemberRank;

    public CabinCrew(String name, Rank crewMemberRank){
        super(name, crewMemberRank);
    }
    TODO relayMessagesToPassengers;
}
