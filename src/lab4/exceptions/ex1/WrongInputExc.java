package lab4.exceptions.ex1;

public class WrongInputExc extends Exception{
    public WrongInputExc(int i)
    {
        super("the following value is not supported "+i);
    }
}
