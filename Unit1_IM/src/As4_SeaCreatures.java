public class As4_SeaCreatures {
public static String [] allCreatures = {  "Blue Tang", "Blue Whale", "Clownfish", "Common Dolphin", "Common Octopus", "Common Starfish", "Great White Shark", "Green Sea Turtle", "Lined Seahorse", "Vaquita"};
public static String[] allTypes = { "Fish", "Mammal", "Fish", "Mammal", "Mollusk", "Echinoderm", "Fish", "Reptile", "Fish", "Porpoise"};
public static boolean[] isEndangered = { false, true, false, false, false, false, true, true, false, true};

    public static void run() {
        while (true) {

            for (int i = 0; i < allCreatures.length; i++) {

                System.out.println(allCreatures[i]);


            }
            System.out.println("What creature would you like to search?");
            String answer = Library.input.nextLine();
if(answer.equalsIgnoreCase("exit")){
    break;
}
            int foundIndex = Search.StringBinarySearch(allCreatures, answer);
            if (foundIndex == -1) {
                System.out.println("Sorry I couldn't find that creature on our list. Please try again later.");

            } else {
                System.out.println("The " + allCreatures[foundIndex] + " is a " + allTypes[foundIndex]);
                if (isEndangered[foundIndex] == false) {
                    System.out.println("This creature is not endangered");
                } else {
                    System.out.println("This creature is endangered.");
                }
            }
        }

    }




}
