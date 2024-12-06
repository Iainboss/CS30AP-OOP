package As3_LeagueTeams;

import Examples.Library;

public class As2_Team {


private String name;
private String location;
private String TypStanding;
private int  position;
private int championships;
private double value;

private double pitTime;


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
        return name ;
    }//toString


    public void findField(){

    System.out.println( name + " is typically a " +TypStanding + " team.");


    }

public void updateStats(){
System.out.println("What stat would you like to update? Press 1 for name, 2 for location, 3 for world championships or 4 for team value");
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
    System.out.println(name + " now has " + newChampionships + " championships");
    championships = newChampionships;
}
else if(answer ==4){
    System.out.println("You are updating the team's value, they are currently worth " + value + " billion dollars, how much are they worth now? (In billions)");
    double newValue = Library.input.nextDouble();
    System.out.println(name + " is now worth " + newValue + " billion dollars");
    value = newValue;


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

    public double getPitTime() {
        return pitTime;
    }
}//Team
