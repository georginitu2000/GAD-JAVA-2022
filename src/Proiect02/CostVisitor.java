package Proiect02;

public class CostVisitor implements Visitor{
    private int totalCost;

    @Override
    public void visit(Meals meals) {
        totalCost=totalCost+ meals.getMealsNo()*60;
    }

    @Override
    public void visit(Accomodation acc) {
        if(acc.getType()==RoomType.Single)
            totalCost=totalCost+ acc.getNightsNo()*100;
        else if (acc.getType()==RoomType.Double)
            totalCost=totalCost+ acc.getNightsNo()*150;
        else totalCost=totalCost+ acc.getNightsNo()*200;

    }

    @Override
    public void visit(SpaAcces spa) {
        totalCost=totalCost+ spa.getDaysNo()*40;

    }

    public int getCost(){return totalCost;}
}
