package Objects1;

public class Class1 {
    private String name;

    private byte age;
    private String email;

    public Class1(String name,byte age,String email)
    {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public void greet()
    {
        System.out.println("Hello everyone, my name is "+name+" and I'm "+age+ " years old and my email is "+email);
    }

    public String getName()
    {
        return this.name;
    }

    public Byte getAge()
    {
        return this.age;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String new_email)
    {
        this.email = new_email;
    }

    public void setAge(Byte new_age)
    {
        this.age = new_age;
    }

    public void setName(String new_name)
    {
        this.name = new_name;
    }

}
