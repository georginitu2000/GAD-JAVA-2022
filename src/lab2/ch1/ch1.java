package lab2.ch1;

public class ch1 {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Mihai",100,40);
        Fighter f2=new Fighter("Ion",100,45);
        BoxingMatch b = new BoxingMatch(f1,f2);

       Fighter winner=b.fight();
       System.out.println(winner.getName());
    }
}