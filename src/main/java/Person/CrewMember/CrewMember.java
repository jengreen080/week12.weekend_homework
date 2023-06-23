package Person.CrewMember;

import Person.Person;
import com.sun.xml.internal.bind.v2.TODO;

public class CrewMember extends Person {

    private String name;
    private Rank crewMemberRank;

    public CrewMember(String name, Rank crewMemberRank){
        super(name);
        this.crewMemberRank = crewMemberRank;
    }
}
