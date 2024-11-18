
    public class As3_ParallelSort {

        public static String[] allNames = MyFiles.loadStringArr("IntelliJ_DataSet/Movies/Names.txt");
        public static int[] allDates = MyFiles.loadIntArr("IntelliJ_DataSet/Movies/Date.txt");
        public static double[] allRatings = MyFiles.loadDoubleArr("IntelliJ_DataSet/Movies/Rating.txt");
        public static int[] allRuntimes = MyFiles.loadIntArr("IntelliJ_DataSet/Movies/Runtime.txt");

        public static void run() {


            while (true) {

                System.out.println("Press 1 to sort by release date \nPress 2 to sort by runtime\nPress 3 to sort by year\nPress 4 to sort by rating.\nPress 5 to search for a movie.\nPress 6 to exit");
                int choice = Library.input.nextInt();
                Library.input.nextLine();

                if (choice == 1) {
                    for (int i = 0; i < allDates.length - 1; i++) {
                        for (int j = 0; j < allDates.length - 1; j++) {

                            if (allDates[j] > allDates[j + 1]) {

                                int temp = allDates[j];
                                allDates[j] = allDates[j + 1];
                                allDates[j + 1] = temp;

                                String temp2 = allNames[j];
                                allNames[j] = allNames[j + 1];
                                allNames[j + 1] = temp2;
                                //
                                int temp3 = allRuntimes[j];
                                allRuntimes[j] = allRuntimes[j + 1];
                                allRuntimes[j + 1] = temp3;

                                double temp4 = allRatings[j];
                                allRatings[j] = allRatings[j + 1];
                                allRatings[j + 1] = temp4;


                            }
                        }

                    }

                    for (int i = 0; i < allDates.length; i++) {
                        System.out.println(allDates[i] + " " + allNames[i] + " " + allRatings[i] + " " + allRuntimes[i]);

                    }

                }


                if (choice == 2) {
                    for (int i = 0; i < allRuntimes.length - 1; i++) {
                        for (int j = 0; j < allRuntimes.length - 1; j++) {

                            if (allRuntimes[j] > allRuntimes[j + 1]) {

                                int temp = allRuntimes[j];
                                allRuntimes[j] = allRuntimes[j + 1];
                                allRuntimes[j + 1] = temp;

                                String temp2 = allNames[j];
                                allNames[j] = allNames[j + 1];
                                allNames[j + 1] = temp2;
                                //
                                int temp3 = allDates[j];
                                allDates[j] = allDates[j + 1];
                                allDates[j + 1] = temp3;

                                double temp4 = allRatings[j];
                                allRatings[j] = allRatings[j + 1];
                                allRatings[j + 1] = temp4;

                            }
                        }

                    }
                    for (int i = 0; i < allDates.length; i++) {
                        System.out.println(allRuntimes[i] + " " + allNames[i] + " " + allDates[i] + " " + allRatings[i]);

                    }


                }
                if (choice == 3) {
                   System.out.println(" What year do you want to search before?");
                  int answer = Library.input.nextInt();
                    for (int i = 0; i < allDates.length; i++) {
                        if(allDates[i]<answer){
                            System.out.println(allNames[i] + ": Released: " + allDates[i] + " Rated: " + allRatings[i] + " Runs: " + allRuntimes[i] + " minutes");
                        }
                    }

                }
                if (choice == 4) {

                    System.out.println("What rating do you want to search above?");
                    double answer = Library.input.nextDouble();

                    int numAbove = 0;
                    for(int i = 0; i < allRatings.length; i++) {
                        if (allRatings[i] > answer) {
                            numAbove += 1;
                        }
                    }

                    System.out.println("The number of movies rated above " + answer + " is " + numAbove);
                }
                if (choice == 5) {

                    System.out.println("What movie do you want to search for?");
                    String answer = Library.input.nextLine();
                   int foundIndex = Search.linearSearch(allNames,answer);
                    if(foundIndex ==-1){
System.out.println("Not found");

                    }else {
                        System.out.println(allNames[foundIndex] + ": Released: " + allDates[foundIndex] + " Rated: " + allRatings[foundIndex] + " Runs: " + allRuntimes[foundIndex] + " minutes");
                    }



                }//while
                if (choice == 6) {
                    System.out.println("Bye");
                    break;
                }

            }//while
        }
    }
