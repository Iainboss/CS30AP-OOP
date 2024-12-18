package As3_LeagueTeams;

import Examples.Library;
import java.util.ArrayList;

public class As2_Team {


private String name;
private String location;
private String TypStanding;
private int  position;
private int championships;
private double value;

private double pitTime;

    private ArrayList<As2_Player> allPlayers = new ArrayList<>();


public As2_Team(String n, String l, String t, int p, int c, double v, double pT){

name = n;

location = l;
TypStanding = t;
position = p;
championships = c;
value = v;
pitTime = pT;

}

    public String toString(){
        return name + " is currently #" + position;
    }//toString


    public void findField(){

    System.out.println( name + " is typically a " +TypStanding + " team.");


    }

public void updateStats(){
System.out.println("What stat would you like to update? Press 1 for name, 2 for location, 3 for world championships or 4 for team value, 5 for pit stop time");
int answer = Library.input.nextInt();
Library.input.nextLine();
if(answer ==1){
    System.out.println("You are updating the team name, the current name is " + name + " what is the new name?");
    String newName = Library.input.nextLine();
    System.out.println(name + " will be changed to " + newName);
    name = newName;
}
else if( answer == 2){
    System.out.println("You are updating the team's location. They are currently based in " + location + " where are they now?");
    String newLocation = Library.input.nextLine();
    System.out.println(name + "'s location will be changed to "+ newLocation);
    location = newLocation;
}
else if(answer ==3){
    System.out.println("You are updating the number of world championships for this team. They currently have " + championships + " how many do they have now?");
    int newChampionships = Library.input.nextInt();
    Library.input.nextLine();
    System.out.println(name + " now has " + newChampionships + " championships");
    championships = newChampionships;
}
else if(answer ==4){
    System.out.println("You are updating the team's value, they are currently worth " + value + " billion dollars, how much are they worth now? (In billions)");
    double newValue = Library.input.nextDouble();
    System.out.println(name + " is now worth " + newValue + " billion dollars");
    value = newValue;
}
else if(answer ==5){
    System.out.println("You are updating the pit time, current time is " + pitTime + "s. New time?");
    double newTime = Library.input.nextDouble();
    System.out.println(name + "'s pit time is now " + newTime + "s");
    pitTime = newTime;
}else {
    System.out.println("No option selected.");
}


}

public void playerStats(){
    System.out.println("What is the player ID of the player you want to update the stats for?");
    int findplayerID = Library.input.nextInt();
    Library.input.nextLine();
    for (int i = 0; i < allPlayers.size(); i++) {
        if(allPlayers.get(i).getPlayerID()==findplayerID){
            allPlayers.get(i).changePlayerStats();
        }
        else{
            System.out.println("No player found.");
        }
    }
}

public void printStandings(){
    System.out.println(position + " " + name);
}

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getTypStanding() {
        return TypStanding;
    }

    public int getPosition() {
        return position;
    }

    public int getChampionships() {
        return championships;
    }

    public double getValue() {
        return value;
    }


    public void setPosition(int position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPitTime() {
        return pitTime;
    }



    public void addPlayer(String n, int i, int p, double s){

    allPlayers.add(new As2_Player(n,i,p,s));
    }

    public void printPlayers(){
        for (int i = 0; i < allPlayers.size(); i++) {
            System.out.println( name + ": " +allPlayers.get(i).toString());
        }
    }

    public void totalPoints(){

    int totalPoints = 0;
        for (int i = 0; i < allPlayers.size(); i++) {
            totalPoints += allPlayers.get(i).getPoints();

        }
        System.out.println(name + " has " + totalPoints + " total points.");
    }


    public ArrayList<As2_Player> getAllPlayers() {
        return allPlayers;
    }

}//Team
