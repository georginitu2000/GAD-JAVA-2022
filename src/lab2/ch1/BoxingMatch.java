package lab2.ch1;

public class BoxingMatch {
    Fighter f1;
    Fighter f2;

    public BoxingMatch(Fighter f1, Fighter f2)
    {
        this.f1=f1;
        this.f2=f2;
    }
    public Fighter fight()
    {
    while(f1.getHealth()>0 && f2.getHealth()>0)
    {
        f1.attack(f2);
        if(f2.getHealth()>0)
            f2.attack(f1);
        else return f1;

    }
    return f2;
    }

}
