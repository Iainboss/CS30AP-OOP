package As1_Crops;

import Examples.Ex3_Client;
import Examples.Library;

import java.util.ArrayList;

public class As1_Main {

   public static double totalRevenue =0;
    public static void run(){

        ArrayList<As1_Crop> allCrops = new ArrayList<>();

        allCrops.add(new As1_Crop("Wheat", 49.7,"bushel", 6.6));
        allCrops.add(new As1_Crop("Corn",175.2,"bushel", 5.5));
        allCrops.add(new As1_Crop("Soybeans", 49.7,"bushel", 13.5));
        allCrops.add(new As1_Crop("Rice", 2678,"kilogram", 0.78));
        allCrops.add(new As1_Crop("Canola", 1.5,"ton", 603.4));

allCrops.get(0).setAcres(300);
allCrops.get(1).setAcres(100);
allCrops.get(2).setAcres(100);
allCrops.get(3).setAcres(450);
allCrops.get(4).setAcres(50);






            while(true) {

                System.out.println("Press 1 to print all crops\nPress 2 to search and harvest a crop\nPress 3 to print total revenue\nPress 4 to exit.");
                int choice = Library.input.nextInt();
                Library.input.nextLine();

                if (choice == 1) {

                    for (int i = 0; i < allCrops.size(); i++) {
                        System.out.println(allCrops.get(i));

                    }
                }
                if (choice == 2) {
System.out.println("What crop are you looking for?");
String name = Library.input.nextLine();
int foundCrop = searchByName(allCrops, name);
if( foundCrop==-1){
    System.out.println("Sorry, this crop is currently unavailable");
}else {

totalRevenue+=allCrops.get(foundCrop).harvest();

}

                }
                if (choice == 3) {
                    System.out.println("The total revenue from all harvested crops is $" +totalRevenue);
                }
                if (choice == 4) {
                    break;
                }
                System.out.println();

            }//while

        }








    public static int searchByName( ArrayList<As1_Crop> list, String searchTerm){
        for (int i = 0; i < list.size(); i++) {
            if(searchTerm.equalsIgnoreCase(list.get(i).getName())){
                return i;
            }
        }
        return -1;
    }

}
