package Objects1;

public class Gato {
    private  String name;
    private  String color;
    private  String ownerName;

    public Gato(String name,String color,String ownerName)
    {
        this.color = color;
        this.name = name;
        this.ownerName = ownerName;
    }

    public Gato(String name,String color)
    {
        this.name = name;
        this.color = color;
        this.ownerName = "Unknown";
    }


}
