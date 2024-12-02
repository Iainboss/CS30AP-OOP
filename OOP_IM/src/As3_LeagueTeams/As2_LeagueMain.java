package As3_LeagueTeams;

import Examples.Library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class As2_LeagueMain {

public static void run(){

    ArrayList<As2_Team> allTeams = new ArrayList<>();

    loadFile("Data/F1Teams.csv", allTeams);


    while(true) {

        System.out.println("Press 1 to print all teams\nFind highest or lowest team\nPress 3 to view spot in the field\nPress 4 to update team stats.");
        int choice = Library.input.nextInt();
        Library.input.nextLine();

        if (choice == 1) {
            for (int i = 0; i < allTeams.size(); i++) {
                System.out.println(allTeams.get(i));
            }

        }
        if (choice == 2) {
            System.out.println("Not yet implemented! (Ask couprie)");
        }
        if (choice == 3) {
           System.out.println("What team would you like to view the standing for?");
           String answer = Library.input.nextLine();
           int foundIndex = searchByName(allTeams, answer);
if(foundIndex == -1){
    System.out.println("Team not found. Try again later");
}else {
    allTeams.get(foundIndex).findField();
}

        }
        if (choice == 4) {
            System.out.println("What team would you like to update the stats for?");
            String answer = Library.input.nextLine();
            int foundIndex = searchByName(allTeams, answer);
            if(foundIndex == -1){
                System.out.println("Team not found. Try again later");
            }else {
                allTeams.get(foundIndex).updateStats();
            }

        }

    }//while











}//run

//------------------------LOAD FILE---------------------------------------------
    public static void loadFile(String filename, ArrayList<As2_Team> list ) {

        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));

            String dataToRead;
            while( file.ready()){
                dataToRead = file.readLine();

                String tempArray[] = dataToRead.split(",");

                list.add( new As2_Team( tempArray[0],tempArray[1], tempArray[2], Integer.parseInt(tempArray[3]),Integer.parseInt(tempArray[4]),Double.parseDouble(tempArray[5]) ));

            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }//end loadFile



    public static int searchByName(ArrayList<As2_Team> list, String searchTerm){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().toLowerCase().contains(searchTerm.toLowerCase())){
return i;
            }
        }
        return -1;
    }

}
