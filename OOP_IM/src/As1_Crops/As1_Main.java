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

                System.out.println("Press 1 to print all crops\nPress 2 to search and harvest a crop\nPress 3 to print total revenue\nPress 4 to plant crops\nPress 5 to exit");
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
                    System.out.println("What crop would you like to plant?");
                    String answer = Library.input.nextLine();
                    int foundIndex = searchByName(allCrops, answer);
                    if(foundIndex == -1){
                        System.out.println("No crop found. Planting a new crop");

                        System.out.println("What is the name of the crop you are planting");
                        String newName = Library.input.nextLine();

                        System.out.println("What unit of measurement is used for this crop?");
                        String newUnit = Library.input.nextLine();

                        System.out.println("How many units can you yield per acre of land of this crop?");
                        double newYield = Library.input.nextDouble();

                        System.out.println("How much does one unit of this crop sell for?");
                        double newPrice = Library.input.nextDouble();


                        allCrops.add(new As1_Crop(newName, newYield,newUnit, newPrice));
                        allCrops.get( allCrops.size()-1).setAcres(0);
                        System.out.println("Your crop has been added. How many acres would you like to plant?");
                        int numAcres = Library.input.nextInt();

                        allCrops.get(allCrops.size()-1).plantCrops(numAcres);
                       System.out.println("Planted!");

                    }else {
      System.out.println("How many acres would you like to plant?");
      int numAcres = Library.input.nextInt();
      allCrops.get(foundIndex).plantCrops(numAcres);

                    }
                }

                if(choice==5){
                    System.out.println("Exiting crop menu...");
                    break;
                }


            }//while
        System.out.println("Exited");
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
