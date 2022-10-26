package CA_1;

import java.util.ArrayList;

public class App {
    public static void main(String[] atgs){

        Player john = new Player("John",18,"Back",24);
        Player phil = new Player("Phil",19,"Winger",21);
        Player carl = new Player("Carl",18,"Midfielder",19);
        Player sam = new Player("Sam",17,"Back",4);
        Player ben = new Player("Ben",21,"Winger",10);

        ArrayList<Player> players = new ArrayList<>();
        players.add(john);
        players.add(phil);
        players.add(carl);
        players.add(sam);
        players.add(ben);

        Team sparrow = new Team("Sparrow","Bird",players);

        System.out.println(sparrow.toString());
        System.out.println("\n");
        System.out.println(sparrow.FindPlayerByJerseyNumber(21));
        System.out.println(sparrow.FindPlayerByPosition("Back"));

        System.out.println(john.getCounter());
    }
}
