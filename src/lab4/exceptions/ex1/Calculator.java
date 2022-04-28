package lab4.exceptions.ex1;

public class Calculator {
    private int intermediateOp(int i) throws WrongInputExc
    {
       if(i%2==0)
           throw new WrongInputExc(i);
       if(i==5)
           throw new FatalExc();
       return i*3;
    }
    public int calculateResult(int param)
    {
        int result=0;
        try {
            result = intermediateOp(param);
        }catch(WrongInputExc e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
