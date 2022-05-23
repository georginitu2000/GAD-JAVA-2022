package lab7.ch2;
public class Main {
    public Player Winner(Player p1,Player p2){
        Player winner = null;
        if(p1.getOpt().equals("paper")){
            if(p2.getOpt().equals("rock")){
                winner = p1;
            }
            else if(p2.getOpt().equals("scissors")){
                winner = p2;
            }
        }
        if(p1.getOpt().equals("rock")){
            if(p2.getOpt().equals("paper")){
                winner = p2;
            }
            else if(p2.getOpt().equals("scissors")){
                winner = p1;
            }
        }
        if(p1.getOpt().equals("scissors")){
            if(p2.getOpt().equals("rock")){
                winner = p2;
            }
            else if(p2.getOpt().equals("paper")){
                winner = p1;
            }
        }
        return winner;
    }

    public static void main(String[] args) throws InterruptedException {
        Player p1 = new Player("Player1");
        Player p2 = new Player("Player2");

        p1.start();
        p2.start();

        p1.join();
        p2.join();
        Player winner = new Main().Winner(p1, p2);
        if(winner!=null){
            System.out.println("Winner: "+winner);
            System.out.println(p1);
            System.out.println(p2);
        }
        else{
            System.out.println("Draw");
            System.out.println(p1);
            System.out.println(p2);
        }
    }

}