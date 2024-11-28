package As3_LeagueTeams;

import Examples.Ex3_Client;
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

        System.out.println("Press 1 for rock\nPress 2 to for country\nPress 3 for jazzy grooves\nPress 4 to exit.");
        int choice = Library.input.nextInt();
        Library.input.nextLine();

        if (choice == 1) {
            for (int i = 0; i < allTeams.size(); i++) {
                System.out.println(allTeams.get(i));
            }

        }
        if (choice == 2) {
            System.out.println("Yeehaw!");
        }
        if (choice == 3) {
            System.out.println("Cool dadio!");
        }
        if (choice == 4) {
            break;
        }
        System.out.println();

    }//while

    System.out.println("Good bye");









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


}
