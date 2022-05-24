package Proiect02;

public class Main {
    public static void main(String[] args) {
        Element elms[]=new Element[3];
        elms[0]=new Accomodation(3,RoomType.Double);
        elms[1]=new SpaAcces(1);
        elms[2]=new Meals(2);

        CostVisitor v=new CostVisitor();
        for(Element e:elms)
        {
            e.accept(v);
        }
        System.out.println("Costul total al sederii la hotel este de "+v.getCost()+" lei");
    }
}
