package Person.CrewMember.Pilot;

import Person.CrewMember.CrewMember;
import Person.CrewMember.Rank;
import com.sun.xml.internal.bind.v2.TODO;

public class Pilot extends CrewMember {

    private String name;
    private Rank crewMemberRank;
    private String pilotLicenceNumber;

    public Pilot(String name, Rank crewMemberRank, String pilotLicenceNumber){
        super(name, crewMemberRank);
        this.name = name;
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
        return this.name = name;
    }
    public String flyPlane() {
        return "IN THE CLOUDS";
    }
}
