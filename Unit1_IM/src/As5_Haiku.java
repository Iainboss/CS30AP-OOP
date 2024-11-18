import java.util.ArrayList;
public class As5_Haiku {
    public static String[] poem1 = MyFiles.loadStringArr("IntelliJ_DataSet/Haikus/Haiku1Poem.txt");


    public static void run(){
        String saveFile;





        for (int i = 0; i < poem1.length; i++) {
            System.out.println(poem1[i]);
        }

        Search.SortAlphabetically(poem1);



        for (int i = 0; i < poem1.length; i++) {
            System.out.println(poem1[i]);
        }


        System.out.println("What word would you like to replace?");
        String wordReplace  = Library.input.nextLine();
        System.out.println("What do you want to replace it with?");
        String replaceWord = Library.input.nextLine();


        System.out.println("What file would you like to save to?");
        int answer = Library.input.nextInt();
        Library.input.nextLine();

        if(answer==1){
            saveFile="haikupoem2.txt";
        }
        else if(answer == 2){
            saveFile = "haikupoem3.txt";
        }

    }


}
