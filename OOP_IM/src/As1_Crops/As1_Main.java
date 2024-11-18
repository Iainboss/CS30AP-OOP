package As1_Crops;

import Examples.Ex3_Client;

import java.util.ArrayList;

public class As1_Main {

    public static void run(){

        ArrayList<As1_Crop> allCrops = new ArrayList<>();

        allCrops.add(new As1_Crop("Wheat", 49.7,"Bushels", 9.6));
        allCrops.add(new As1_Crop("Corn",175.2,"Bushels", 5.5));
        allCrops.add(new As1_Crop("Soybeans", 49.7,"Bushels", 13.5));
        allCrops.add(new As1_Crop("Rice", 3476,"Kilograms", 0.35));
        allCrops.add(new As1_Crop("Canola", 1.5,"Tons", 603.4));

allCrops.get(0).setAcres(300);
allCrops.get(1).setAcres(100);
allCrops.get(2).setAcres(100);
allCrops.get(3).setAcres(450);
allCrops.get(4).setAcres(50);


        for (int i = 0; i < allCrops.size(); i++) {
            System.out.println(allCrops.get(i));

        }
    }
}
