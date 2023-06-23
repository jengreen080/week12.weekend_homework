package Person.CrewMember;

import Person.Person;
import com.sun.xml.internal.bind.v2.TODO;

public abstract class CrewMember extends Person {

    private String name;
    private Rank crewMemberRank;

    public CrewMember(String name, Rank crewMemberRank){
        super(name);
        this.name = name;
        this.crewMemberRank = crewMemberRank;
    }

    public Rank getRank(){
        return crewMemberRank;
    }

    public Rank setRank(Rank newRank){
       return this.crewMemberRank = newRank;
    }

    public abstract String getName();
//    {
//        return name;
//    }

    public abstract String setName(String name);
}
