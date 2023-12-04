package Homework_7;

import java.util.ArrayList;

public class Team {
    private ArrayList<Players> playersList;

    public Team() {
        playersList = new ArrayList<>();
    }

    public void addPlayer(Players players){
        playersList.add(players);
    }

    public void printTeamRoster(){
        for (Players players: playersList){
            System.out.printf("Player Name:%s\n", players.getName());
            System.out.printf("Player rating:%d\n", players.getPlayerRating());
            System.out.println();
        }
    }
}
