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

        while (true) {

            System.out.println("Press 1 to print all teams\nPress 2 to calculat the average team value\nPress 3 to view spot in the field\nPress 4 to update team stats\nPress 5 to sort teams by position\nPress 6 to save and exit");
            int choice = Library.input.nextInt();
            Library.input.nextLine();



            if (choice == 1) {
                for (int i = 0; i < allTeams.size(); i++) {
//                    System.out.println(allTeams.get(i).getPosition() + " " + allTeams.get(i));
                    System.out.println(allTeams.get(i));

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
System.out.println("Sorry this feature is bugging rn");
//                        System.out.println(allTeams.get(foundTeam).getName() + " is currenty #" + allTeams.get(foundTeam).getPosition() + " what position are they now?");
//
//                        int newPos = Library.input.nextInt();
//                        Library.input.nextLine();
//
//                        if (newPos <= 10) {
//                            // Get the old position of the team
//                            int oldPos = allTeams.get(foundTeam).getPosition();
//
//                            // If the new position is higher, shift teams downward
//                            if (newPos > oldPos) {
//                                for (int i = 0; i < allTeams.size(); i++) {
//                                    if (allTeams.get(i).getPosition() >= oldPos && allTeams.get(i).getPosition() < newPos) {
//                                        allTeams.get(i).setPosition(allTeams.get(i).getPosition() - 1);
//                                    }
//                                }
//                            }
//                            // If the new position is lower, shift teams upward
//                            else if (newPos < oldPos) {
//                                for (int i = 0; i < allTeams.size(); i++) {
//                                    if (allTeams.get(i).getPosition() >= newPos && allTeams.get(i).getPosition() < oldPos) {
//                                        allTeams.get(i).setPosition(allTeams.get(i).getPosition() + 1);
//                                    }
//                                }
//                            }
//
//
//                            // Now set the selected team's position to the new position
//                            allTeams.get(foundTeam).setPosition(newPos);
//                        }
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
if(choice==6){
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
