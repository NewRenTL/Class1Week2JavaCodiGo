package Inheritance;

public class Teacher extends Person{

    private int numCourses;
    private int ranking;
    public Teacher(String nombre,String apellido,int numCourses,int ranking)
    {
        super(nombre,apellido);
        this.numCourses = numCourses;
        this.ranking = ranking;
    }
    @Override
    public void greet() {
        System.out.println("Welcome");
    }
}
