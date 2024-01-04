package Inheritance;

public class Person {
    protected String name;
    protected String lastname;

    public Person(String name,String lastname)
    {
        this.name = name;
        this.lastname = lastname;
    }
    public Person()
    {

    }

    public String getName()
    {
        return this.name;
    }

    public String getLastname()
    {
        return this.lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void greet()
    {
        System.out.println("Hello World");
    }
}
