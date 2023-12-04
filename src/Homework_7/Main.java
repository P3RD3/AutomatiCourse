package Homework_7;

public class Main {
    public static void main(String[] args) {
        Team Chelsea = new Team();
        Players ToddHayward = new Players(Chelsea,"Todd Hayward",80,67,73,45,90);
        Players GeorgeBirmingham = new Players(Chelsea,"George Birmingham", 90,85,80,84,78);
        Chelsea.printTeamRoster();

    }
}
