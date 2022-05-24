package Proiect02;



public class SpaAcces implements Element{
    private int daysNo;


    public SpaAcces(int daysNo) {
        this.daysNo=daysNo;
    }
    public int getDaysNo()
    {
        return daysNo;
    }
    public void accept(Visitor v)
    {
        v.visit(this);
    }
}
