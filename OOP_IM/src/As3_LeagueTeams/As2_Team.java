package As3_LeagueTeams;

import Examples.Library;

public class As2_Team {


private String name;
private String location;
private String TypStanding;
private int  position;
private int championships;
private double value;


public As2_Team(String n, String l, String t, int p, int c, double v){

name = n;
location = l;
TypStanding = t;
position = p;
championships = c;
value = v;

}

    public String toString(){
        return name;
    }//toString


    public void findField(){

    System.out.println( name + " is typically a " +TypStanding + " team.");


    }

public void updateStats(){
    System.out.println("What stat would you like to update?");
String answer = Library.input.nextLine();

if(answer.toLowerCase().contains("position")){
    System.out.println("You are updating the team's position in the championship. They are currently #" + position+ ". What position are they now?" );
   int newPos = Library.input.nextInt();
   if(newPos<=10){
       position = newPos;
       System.out.println("Position updated. " + name + " is now #" + position + " in the championship" );

   }else {
       System.out.println("Cannot place a team lower than 10th.");
   }

}
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
}//Team
