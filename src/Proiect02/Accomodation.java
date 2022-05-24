package Proiect02;

public class Accomodation implements Element{
    private int nightsNo;
    private RoomType type;


    public Accomodation(int nightsNo, RoomType type) {
        this.nightsNo=nightsNo;
        this.type=type;
    }
    public int getNightsNo()
    {
        return nightsNo;
    }

    public RoomType getType() {
        return type;
    }

    public void accept(Visitor v)
    {
        v.visit(this);
    }
}
