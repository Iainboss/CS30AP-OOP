
public class Exam_IM {
public static String[] abbreviation = {  "CHF",  "CZK",  "EUR",  "JPY",  "MAD"};
public static String[] longName = {   "Swiss Franc",  "Czech Koruna",  "Euro", "Japanese Yen",  "Moroccan Dirham"};
public static Double[] value = { 0.65,  16.47,  0.68,  109.97,  7.40};
    public static void run() {

        while(true) {

            System.out.println("Press 1 to print all \nPress 2 to find average\nPress 3 to search by value\nItem 4 was not completed.\nPress 5 to search by name\nPress 6 to sort by value\nPress 7 to print all + unofficial abbreviations\nPress 8 to exit");

            int choice = Library.input.nextInt();
            Library.input.nextLine();

            if (choice == 1) {
                for (int i = 0; i <abbreviation.length; i++) {
                    System.out.println(abbreviation[i] + " " + longName[i] + " " + value[i]);

                }

            }
            if (choice == 2) {
                double  average = 0;
                for (int i = 0; i < value.length; i++) {
                    average += value[i];


                }
                System.out.println(average/value.length);

            }
            if (choice == 3) {
System.out.println("Enter the value of the currency you want to search.");
double answer = Library.input.nextDouble();

Library.input.nextLine();
int foundIndex = Search.doubleSearch(value, answer);
if(foundIndex==-1){
    System.out.println("Currency not found");

}else {
    System.out.println("One Canadian dollar is worth " + value[foundIndex] + " " + abbreviation[foundIndex]);
}

}

            if (choice == 4) {

//I couldn't figure out how to make the binary search properly divide using strings.
System.out.println("Not completed");
            }

            if(choice == 5){
                System.out.println("What currency do you want to search for?");
                String answer = Library.input.nextLine();
                for (int i = 0; i < longName.length; i++) {

                    if( longName[i].toLowerCase().contains(answer)){
                        System.out.println(longName[i] + " " + abbreviation[i] + " " + value[i]);

                    }

                }


            }


            if(choice ==6){

                for (int i = 0; i < value.length - 1; i++) {
                    for (int j = 0; j < value.length - 1; j++) {

                        if (value[j] > value[j + 1]) {

                            double temp = value[j];
                            value[j] = value[j + 1];
                            value[j + 1] = temp;

                            String temp2 = abbreviation[j];
                            abbreviation[j] = abbreviation[j + 1];
                            abbreviation[j + 1] = temp2;
                            //
                            String temp3 = longName[j];
                            longName[j] = longName[j + 1];
                            longName[j + 1] = temp3;



                        }
                    }

                }
                System.out.println("Sorted by value: low to high.");




            }

            if(choice == 7){


                for (int i = 0; i <abbreviation.length; i++) {
                    System.out.println(abbreviation[i] + " " + longName[i] + " " + value[i] + " " + longName[i].substring(0,3));

                }



            }

if(choice == 8){
    break;
}

        }//while
System.out.println("You have exited.");


    }
}
