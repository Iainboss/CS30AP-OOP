public class Ex3_PrimeMinisters {

public static String[] allNames = MyFiles.loadStringArr("IntelliJ_DataSet/PMs/names.txt");
public static int[] allYears = MyFiles.loadIntArr("IntelliJ_DataSet/PMs/startyear.txt");
public static String[] allParties = MyFiles.loadStringArr("IntelliJ_DataSet/PMs/party.txt");


public static void run(){

    sortByName();
    for (int i = 0; i < allNames.length ; i++) {
        System.out.println(allNames[i] + "  Party  " + allParties[i] +" Term started in  " + allYears[i]);
    }


}

public static void sortByName() {


    for (int i = 0; i < allNames.length - 1; i++) {
        int lowestIndex = i;
        for (int j = i + 1; j < allNames.length; j++) {
            if (allNames[j].compareToIgnoreCase(allNames[lowestIndex]) < 0) {
                lowestIndex = j;
            }
        }
//swaps the lowest to the beginning
        String temp = allNames[i];
        allNames[i] = allNames[lowestIndex];
        allNames[lowestIndex] = temp;


        String temp1 = allParties[i];
        allParties[i] = allParties[lowestIndex];
        allParties[lowestIndex] = temp1;


        int temp2 = allYears[i];
        allYears[i] = allYears[lowestIndex];
        allYears[lowestIndex] = temp2;

    }


}
}//endSortByName


