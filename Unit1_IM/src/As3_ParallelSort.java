    import java.util.Arrays;
//bruh
    public class As3_ParallelSort {

        public static String[] allNames = MyFiles.loadStringArr("IntelliJ_DataSet/Movies/Names.txt");
        public static int[] allDates = MyFiles.loadIntArr("IntelliJ_DataSet/Movies/Date.txt");
        public static double[] allRatings = MyFiles.loadDoubleArr("IntelliJ_DataSet/Movies/Rating.txt");
        public static int[] allRuntimes = MyFiles.loadIntArr("IntelliJ_DataSet/Movies/Runtime.txt");

        public static void run() {


            while (true) {

                System.out.println("Press 1 to sort by release date \nPress 2 to sort by alphabetical order\nPress 3 to sort by runtime\nPress 4 to sort by rating.\nPress 5 to exit");
                int choice = Library.input.nextInt();
                Library.input.nextLine();

                if (choice == 1) {
                    for (int i = 0; i < allDates.length - 1; i++) {
                        for (int j = 0; j < allDates.length-1; j++) {

                            if (allDates[j] > allDates[j + 1]) {

                                int temp = allDates[j];
                                allDates[j] = allDates[j + 1];
                                allDates[j + 1] = temp;

                                String temp2 = allNames[j];
                                allNames[j] = allNames[j + 1];
                                allNames[j + 1] = temp2;
    //
                                int temp3 = allRuntimes[j];
                                allRuntimes[j] = allRuntimes[j+1];
                                allRuntimes[j + 1] = temp3;




                            }
                        }

                    }

                    for (int i = 0; i < allDates.length; i++) {
                        System.out.println(allDates[i] + " " + allNames[i] + " " + allRuntimes[i]);

                    }

                        }








                    if (choice == 2) {
                        System.out.println("Yeehaw!");

                    }
                    if (choice == 3) {
                        System.out.println("Cool dadio!");
                    }
                    if (choice == 4) {
                        System.out.println("Bludwin");
                    }
                    if (choice == 5) {
                        break;
                    }
                    System.out.println();

                }//while

            }
        }
