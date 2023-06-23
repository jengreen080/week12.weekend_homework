package Person.Passenger;

import Person.Person;

public class Passenger extends Person {
    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags){
        super(name);
        this.name = name;
        this.numberOfBags = numberOfBags;
    }
    @Override
    public String getName(){
        return name;
    }

    public String setName(String name){
        return this.name = name;
    }
}
