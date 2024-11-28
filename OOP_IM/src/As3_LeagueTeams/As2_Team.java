package As3_LeagueTeams;

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
        return name + "   " + location + " " + TypStanding + " " +  +position +" " + championships + " " + value;
    }//toString


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
