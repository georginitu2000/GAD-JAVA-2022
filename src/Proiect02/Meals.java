package Proiect02;

public class Meals implements Element{
    private int mealsNo;

    public Meals(int mealsNo) {
        this.mealsNo=mealsNo;
    }
    public int getMealsNo()
    {
        return mealsNo;
    }
    public void accept(Visitor v)
    {
        v.visit(this);
    }

}
