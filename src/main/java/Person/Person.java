package Person;

public abstract class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public abstract String getName();
//    {return name;}
    public abstract String setName(String name);
//    {
//        return this.name = name;
//    }

}
