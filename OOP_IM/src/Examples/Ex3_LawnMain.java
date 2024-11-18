package Examples;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Ex3_LawnMain {


    public static void run(){


        ArrayList<Ex3_Client> allClients = new ArrayList<>();

        allClients.add(  new Ex3_Client( "McDavid", "100 Maple Dr", 1000, false )   );
        allClients.add(  new Ex3_Client( "Draisaitl", "102 Maple Dr", 600, true )   );
        allClients.add(  new Ex3_Client( "Nugent-Hopkins", "50 Main Street ", 600, false )   );
        allClients.add(  new Ex3_Client( "Skinner", "10450 82 Avenue", 300, true )   );
        allClients.add(  new Ex3_Client( "Podkulzin", "5 Putin Lane", 200, false )   );

        for (Ex3_Client clientTemp: allClients) {
System.out.println(clientTemp);
//System.out.println(allClients.get(i) );     //For Regular fori loops
        }



    }//run

}//LawnMain
