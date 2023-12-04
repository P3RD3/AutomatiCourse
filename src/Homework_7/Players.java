package Homework_7;

public class Players {

    private Team team;
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;
    private int playerRating;

   public Players(Team team, String newName, int initialEndurance, int initialSprint, int initialDribble, int initialPassing, int initialShooting ) {
       this.team = team;
       this.name = newName;
       setEndurance(initialEndurance);
       setSprint(initialSprint);
       setDribble(initialDribble);
       setPassing(initialPassing);
       setShooting(initialShooting);
       setPlayerRating(evaluatePlayerRating());

       team.addPlayer(this);
   }

   private int evaluatePlayerRating() {
    int skill = (this.dribble + this.shooting + this.passing + this.sprint + this.endurance) / 5;
       if (skill >= 90) {
           return 10;
       } else if (skill >= 80) {
           return 9;
       } else if (skill >= 70) {
           return 8;
       } else if (skill >= 60) {
           return 7;
       } else if (skill >= 50) {
           return 6;
       } else if (skill >= 40) {
           return 5;
       } else if (skill >= 30) {
           return 4;
       } else if (skill >= 20) {
           return 3;
       } else if (skill >= 10) {
           return 2;
       } else {
           return 1;
       }
   }

    private void setPlayerRating(int rating){
        switch (rating) {
            case 1:
                this.playerRating = 1;
                break;
            case 2:
                this.playerRating = 2;
                break;
            case 3:
                this.playerRating = 3;
                break;
            case 4:
                this.playerRating = 4;
                break;
            case 5:
                this.playerRating = 5;
                break;
            case 6:
                this.playerRating = 6;
                break;
            case 7:
                this.playerRating = 7;
                break;
            case 8:
                this.playerRating = 8;
                break;
            case 9:
                this.playerRating = 9;
                break;
            case 10:
                this.playerRating = 10;
                break;
            default:
                this.playerRating = 0;
        }
    }
    public int getPlayerRating() {
            return this.playerRating;
    }

    public String getName() {
       return this.name;
    }

    private void setEndurance(int newEndurance) {
        if (newEndurance > 0 && newEndurance < 100) {
            this.endurance = newEndurance;
        } else {
            System.out.println("Please note that player stats can only be between 0-100");
        }
    }

    private void setSprint(int newSprint){
        if(newSprint > 0 && newSprint < 100){
            this.sprint = newSprint;}
        else {
            System.out.println("Please note that player stats can only be between 0-100");
        }
    }
    private void setDribble(int newDribble){
        if(newDribble > 0 && newDribble < 100)
        {
            this.dribble = newDribble;
        }
        else
        {
            System.out.println("Please note that player stats can only be between 0-100");
        }
    }
    private void setPassing (int newPassing){
        if(newPassing > 0 && newPassing < 100){
            this.passing = newPassing;}
        else {
            System.out.println("Please note that player stats can only be between 0-100");
        }

    }
    private void setShooting(int newShooting){
        if(newShooting > 0 && newShooting < 100){
            this.shooting = newShooting;}
        else {
            System.out.println("Please note that player stats can only be between 0-100");
        }

    }

    public void deletePlayer(){
       System.out.printf("Player %s deleted!\n", this.name);
       this.name = null;
       this.endurance = 0;
       this.sprint = 0;
       this.playerRating = 0;
       this.dribble = 0;
       this.passing = 0;
       this.shooting = 0;
    }
}

