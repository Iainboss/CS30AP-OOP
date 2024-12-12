package As3_LeagueTeams;

import Examples.Ex3_Client;
import Examples.Library;

import java.io.*;
import java.util.ArrayList;

public class As2_LeagueMain {

    public static void run() {

        ArrayList<As2_Team> allTeams = new ArrayList<>();


        loadFile("Data/F1Teams.csv", allTeams);
//        allTeams.get(0).setName(  allTeams.get(0).getName().substring(1));

        allTeams.add(new As2_Team("Red Bull Racing", "Milton Keynes - UK", "TopField", 1,5,2.3,2.4) );
        allTeams.add(new As2_Team("Scuderia Ferrari", "Maranello - ITA", "Top Field", 3, 16, 3.13, 2.9));
        allTeams.add(new As2_Team("Mercedes AMG", "Brackley - UK", "Top Field", 2, 8, 2.7, 3.18));
        allTeams.add(new As2_Team("McLaren F1", "Woking - UK", "Mid-Top Field", 4, 8, 1.56, 2.91));
        allTeams.add(new As2_Team("Aston Martin Racing", "Silverstone - UK", "Mid Field", 5, 0, 1.14, 3.08));
        allTeams.add(new As2_Team("Williams Racing", "Oxford - IK", "Bottom Field", 7, 9, 0.795, 3.28));
        allTeams.add(new As2_Team("Haas", "Kannapolis - US", "Bottom Field", 10, 0, 0.71, 4.22));
        allTeams.add(new As2_Team("Alfa Romeo", "Hinwil - CH", "Bottom Field", 9, 0, 0.815, 3.51));
        allTeams.add(new As2_Team("AlphaTauri", "Faenza - ITA", "Bottom Field", 8, 0, 0.905, 3.23));
        allTeams.add(new As2_Team("Alpine F1", "Enstone - UK", "Mid Field", 6, 2, 1.08, 3.19));
        while (true) {
//Red Bull
allTeams.get(0).addPlayer("Max Verstappen", 01, 398, 22.3);
allTeams.get(0).addPlayer("Sergio Perez",11,200,15.4 );

// Ferrari
            allTeams.get(1).addPlayer("Charles Leclerc", 16, 200, 12.0);
            allTeams.get(1).addPlayer("Carlos Sainz Jr.", 55, 190, 8.0);

//Mercedes
            allTeams.get(2).addPlayer("Lewis Hamilton", 44, 210, 70.0);
            allTeams.get(2).addPlayer("George Russell", 63, 185, 8.5);

// McLaren
            allTeams.get(3).addPlayer("Lando Norris", 04, 175, 7.5);
            allTeams.get(3).addPlayer("Oscar Piastri", 81, 160, 4.5);

// Aston Martin
            allTeams.get(4).addPlayer("Fernando Alonso", 14, 220, 18.0);
            allTeams.get(4).addPlayer("Lance Stroll", 18, 120, 7.0);

// Williams
            allTeams.get(5).addPlayer("Alex Albon", 23, 125, 3.5);
            allTeams.get(5).addPlayer("Logan Sargeant", 02, 30, 2.5);

// Haas
            allTeams.get(6).addPlayer("Kevin Magnussen", 20, 110, 5.5);
            allTeams.get(6).addPlayer("Nico Hülkenberg", 27, 105, 6.0);

// Alfa Romeo
            allTeams.get(7).addPlayer("Valtteri Bottas", 77, 95, 8.0);
            allTeams.get(7).addPlayer("Zhou Guanyu", 24, 90, 4.0);

// Alpha Tauri
            allTeams.get(8).addPlayer("Yuki Tsunoda", 22, 75, 1.5);
            allTeams.get(8).addPlayer("Daniel Ricciardo", 03, 115, 8.0); // Ricciardo replaced Nyck de Vries mid-season

// Alpine
            allTeams.get(9).addPlayer("Esteban Ocon", 31, 145, 10.0);
            allTeams.get(9).addPlayer("Pierre Gasly", 10, 150, 12.0);

            System.out.println("Press 1 to print all teams\nPress 2 to calculate the average team value\nPress 3 to view spot in the field\nPress 4 to update team stats\nPress 5 to sort teams by position\nPress 6 to display players\nPress 7 to display all team info\nPress 8 to update player stats\nPress 9 to save and exit");
            int choice = Library.input.nextInt();
            Library.input.nextLine();



            if (choice == 1) {
                for (int i = 0; i < allTeams.size(); i++) {
//                    System.out.println(allTeams.get(i).getPosition() + " " + allTeams.get(i));
                    System.out.println(allTeams.get(i).toString());

                }

            }
            if (choice == 2) {
                System.out.println("Press 1 to calculate by value or 2 to calculate by pit stop time");
                int answer = Library.input.nextInt();
                Library.input.nextLine();
                if(answer == 1) {
                    double totalValue = 0;
                    for (int i = 0; i < allTeams.size(); i++) {
                        totalValue += allTeams.get(i).getValue();
                    }
                    System.out.println("The average value of an F1 team is " + totalValue / 10 + " billion dollars");
                }
                else if(answer ==2){
                    double avgPit = 0;
                    for (int i = 0; i < allTeams.size(); i++) {
                        avgPit += allTeams.get(i).getPitTime();
                    }
                    System.out.println("The average pit stop time for an F1 team is " + avgPit/10 + " s");
                }
            }
            if (choice == 3) {
                System.out.println("What team would you like to view the standing for?");
                String answer = Library.input.nextLine();
                int foundIndex = searchByName(allTeams, answer);
                if (foundIndex == -1) {
                    System.out.println("Team not found. Try again later");
                } else {
                    allTeams.get(foundIndex).findField();
                }

            }
            if (choice == 4) {
                System.out.println("Would you like to update a teams position?");
                String response = Library.input.nextLine();
                if (response.toLowerCase().contains("yes")) {
                    System.out.println("What team would you like to change the position for?");
                    String teamChange = Library.input.nextLine();

                    int foundTeam = searchByName(allTeams, teamChange);

                    if (foundTeam == -1) {
                        System.out.println("Sorry team not found");

                    } else {

                        System.out.println(allTeams.get(foundTeam).getName() + " is currenty #" + allTeams.get(foundTeam).getPosition() + " what position are they now?");

                        int newPos = Library.input.nextInt();
                        Library.input.nextLine();

                        if (newPos <= 10) {
                            // Get the old position of the team
                            int oldPos = allTeams.get(foundTeam).getPosition();

                            // If the new position is higher, shift teams downward
                            if (newPos > oldPos) {
                                for (int i = 0; i < allTeams.size(); i++) {
                                    if (allTeams.get(i).getPosition() < oldPos && allTeams.get(i).getPosition() < newPos) {
                                        allTeams.get(i).setPosition(allTeams.get(i).getPosition() - 1);
                                    }
                                }
                            }
                            // If the new position is lower, shift teams upward
                            else if (newPos < oldPos) {
                                for (int i = 0; i < allTeams.size(); i++) {
                                    if (allTeams.get(i).getPosition() >= newPos && allTeams.get(i).getPosition() < oldPos) {
                                        allTeams.get(i).setPosition(allTeams.get(i).getPosition() + 1);
                                    }
                                }
                            }


                            // Now set the selected team's position to the new position
                            allTeams.get(foundTeam).setPosition(newPos);
                        }
                        }


                } else {
                    System.out.println("What team would you like to update the stats for?");
                    String answer = Library.input.nextLine();
                    int foundIndex = searchByName(allTeams, answer);
                    if (foundIndex == -1) {
                        System.out.println("Team not found. Try again later");
                    } else {
                        allTeams.get(foundIndex).updateStats();
                    }
                }
            }
            if (choice == 5) {
                System.out.println("Sorting by position in the championship ");

                for (int i = 0; i < allTeams.size() - 1; i++) {
                    int lowestIndex = i;
                    for (int j = i + 1; j < allTeams.size(); j++) {
                        if (allTeams.get(j).getPosition() < allTeams.get(lowestIndex).getPosition()) {
                            lowestIndex = j;


                            As2_Team tempTeam = allTeams.get(i);
                            allTeams.set(i, allTeams.get(lowestIndex));
                            allTeams.set(lowestIndex, tempTeam);


                        }
                    }

                }
                for (int i = 0; i < allTeams.size(); i++) {
                    allTeams.get(i).printStandings();
                }
            }

            if(choice == 6){

            System.out.println("What team would you like to search players for?");
            String answer = Library.input.nextLine();

            int foundIndex = searchByName(allTeams, answer);

            if(foundIndex == -1){
                System.out.println("Team not found. Try again.");
            }else {
                allTeams.get(foundIndex).printPlayers();
            }

            }

            if(choice ==7){
                System.out.println("What team would you like to display stats for?");
                String answer = Library.input.nextLine();
                int foundIndex = searchByName(allTeams, answer);
                if(foundIndex == -1){
                    System.out.println("Team not found, try again later");
                }else{


                    System.out.println("Based in " + allTeams.get(foundIndex).getLocation() + " is typically a " + allTeams.get(foundIndex).getTypStanding()+ " team. Valued at $" + allTeams.get(foundIndex).getValue() + " billion. Currently has " + allTeams.get(foundIndex).getChampionships() + " championships.");
                    allTeams.get(foundIndex).printPlayers();
                    allTeams.get(foundIndex).totalPoints();
                }
            }

            if(choice ==8){
                System.out.println("What team is the player you're looking for?");
                String answer = Library.input.nextLine();
                int foundTeam = searchByName(allTeams, answer);
                        if(foundTeam==-1){
                            System.out.println("Team not found, try again.");

                        }else{
                            allTeams.get(foundTeam).printPlayers();
                        System.out.println("What is the name of the player you're looking for?");
                        String player = Library.input.nextLine();
                     System.out.println("Not working yet.");
                        }
            }
if(choice==9){
    System.out.println("Saved and exiting...");
    saveFile("Data/F1Teams.csv", allTeams);
break;
}



        }//while
System.out.println("Exited");

    }//run

    //------------------------LOAD FILE---------------------------------------------
    public static void loadFile(String filename, ArrayList<As2_Team> list) {

        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));

            String dataToRead;
            while (file.ready()) {
                dataToRead = file.readLine();

                String tempArray[] = dataToRead.split(",");
//                System.out.println(tempArray[0]);
                list.add(new As2_Team(tempArray[0], tempArray[1], tempArray[2], Integer.parseInt(tempArray[3]), Integer.parseInt(tempArray[4]), Double.parseDouble(tempArray[5]), Double.parseDouble(tempArray[6])));

            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }//end loadFile


    public static int searchByName(ArrayList<As2_Team> list, String searchTerm) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }




    public static void saveFile(String filename, ArrayList<As2_Team> tempList) {
        try {
            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < tempList.size(); i++) {
//the next lines are customized for whatever data you are getting.
                String toSave = "";
                toSave = tempList.get(i).getName();  //assumes getter method are used for private variables
                toSave += "," + tempList.get(i).getLocation();
                toSave += "," + tempList.get(i).getTypStanding();
                toSave += "," + tempList.get(i).getChampionships();
                toSave += "," + tempList.get(i).getPosition();
                toSave += "," + tempList.get(i).getValue();
                toSave += "," + tempList.get(i).getPitTime();

//The above 6 lines could be replaced by a call to a carefully made toString() function

                file.println(toSave);

            }
            file.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }//end saveFile

}
