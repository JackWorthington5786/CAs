package CA_1;

import java.util.ArrayList;

public class Team {
    private String name;
    private String mascot;
    private ArrayList<Player> players;

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", Mascot='" + mascot + '\'' +
                ", Players=" + players +
                '}';
    }

    public Player FindPlayerByJerseyNumber( int number ){
        for (Player player : players) {
            if (player.getJurseyNumber() == number){
                return player;
            }
        }
        return null;
    }
    public ArrayList<Player> FindPlayerByPosition( String position ){
        ArrayList<Player> playerList = new ArrayList<>();
        for (Player player : players) {
            if (player.getPosition().equals(position)){
                playerList.add(player);
            }
        }
        return playerList;
    }

    public Team(String name, String mascot, ArrayList<Player> players) {
        this.name = name;
        this.mascot = mascot;
        this.players = players;
    }
}
