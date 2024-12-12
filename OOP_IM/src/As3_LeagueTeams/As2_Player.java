package As3_LeagueTeams;


import Examples.Library;

public class As2_Player {

private String Pname;
private int playerID;
private int points;
private double salary;




    public  As2_Player(String n, int i, int p, double s){

Pname = n;
playerID = i;
points= p;
salary = s;


}

public String toString(){

    return Pname +" has " + points + " points. Contract is $" + salary + " million. ID#: " + playerID;
}

    public int getPoints() {
        return points;
    }

    public void changePlayerStats(){
        System.out.println("What stat would you like to update? 1 for ID, 2 for points, 3 for salary");
        int answer = Library.input.nextInt();
        Library.input.nextLine();
        if(answer ==1){
            System.out.println("Current ID#: " + playerID + " New ID#?");
            playerID = Library.input.nextInt();
            Library.input.nextLine();

        }
        else if(answer == 2){
            System.out.println(Pname + " currently has " + points + " points, how many are being added?");
            points += Library.input.nextInt();
            Library.input.nextLine();
        }
        else if(answer ==3){
            System.out.println(Pname + " is currently making $" + salary + " million. New salary?");
            salary = Library.input.nextDouble();
            Library.input.nextLine();
        }else {
            System.out.println("No option selected.");
        }
    }

    public String getPname() {
        return Pname;
    }

    public int getPlayerID() {
        return playerID;
    }

    public double getSalary() {
        return salary;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
