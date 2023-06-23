package Person.Passenger;

import Person.Person;

public class Passenger extends Person {
    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags){
        super(name);
        this.numberOfBags = numberOfBags;
    }
}
