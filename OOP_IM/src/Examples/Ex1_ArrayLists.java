package Examples;

import java.util.ArrayList;


public class Ex1_ArrayLists {

    public static void run(){

//Loading------------------------------------------------------------------------------------------------------------------        
ArrayList <String> allNames = new ArrayList();
//   ArrayList <String> allNames = new ArrayList <String> ();
//        List <String> allNames = new ArrayList();
ArrayList <Double> allDollars = new ArrayList();
ArrayList <Integer> allFilms = new ArrayList();
ArrayList <Boolean> allOscars = new ArrayList();


//Adding------------------------------------------------------------------------------------------------------------------

allNames.add("Samuel L Jackson");   allDollars.add(14627.8);   allOscars.add(false);


allNames.add("Robert Downey Jr");   allDollars.add(14327.7);   allOscars.add(true);

allNames.add("Zeo Saldana");   allDollars.add(14227.7);   allOscars.add(false);

        allNames.add(1, "Scarlett Johansson");   allDollars.add(1,14527.7);   allOscars.add(1,true);

        allFilms.add(1,52);


//Chaning--------------------------------------------------------------
allDollars.set(1,15000.0);
allDollars.set(0,allDollars.get(0) + 20000);



//Removing-----------------------------------------------------------------------------
//allNames.remove("Zoe Saldana");
        allNames.remove(3);
        allDollars.remove(3);
        allOscars.remove(3);



        for (int i = 0; i < allNames.size(); i++) {
            System.out.println(allNames.get(i) +  "  $" + allDollars.get(i) );
        }
    }
}
