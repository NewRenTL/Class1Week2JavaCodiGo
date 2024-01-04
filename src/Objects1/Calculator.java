package Objects1;

public class Calculator {
    public float sum(float a,float b)
    {
        return a+b;
    }
    public float substraction(float a,float b)
    {
        return  a-b;
    }

    public float multiplication(float a,float b)
    {
        return a*b;
    }

    public float division(float a , float b)
    {
        if(b == 0)
        {
            System.out.println("Can't divide by 0");
            return -1;
        }
        return a/(b);

    }
}
