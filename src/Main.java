// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Inheritance.Person;
import Inheritance.Teacher;
import Objects1.Calculator;
import Objects1.Class1;
import Objects1.Computer;
import java.util.Date;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        //Class creation
        /*
        Class1 n1 = new Class1("Diego",(byte) 20,"diego.bustamante@utec.edu.pe");
        n1.greet();
        Class1 n2  = new Class1("Diana",(byte) 19,"diana.monjaras@unsa.edu.pe");
        n2.greet();
        */

        /*Constructor*/
        //Computer c1 = new Computer("Lenovo","Intel",(short)512,8);
        //c1.informationComputerPrint();

        /*Calculator*/
        /*
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1,2));
        System.out.println(calculator.substraction(3,2));
        System.out.println(calculator.division(1,2));
        System.out.println(calculator.multiplication(3,2));
         */

        /*Inheritance*/
        Teacher t1 = new Teacher();
        System.out.println(t1.getName());
        t1.greet();





    }
}