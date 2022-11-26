package netflix;
import java.io.*;
import java.util.*;
import java.util.Scanner;

import javax.print.attribute.standard.MediaName;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // instance variables
        String strLogoff;
        String strNickname;
        boolean blnMaturity;
        int intAge;
        boolean end = false;
        String str = "";

        // object movies 
        Medias smile = new Movies("Smile", "Parker Finn", "Horror", 2022, true);
        Medias minions = new Movies("Minions: The Rise of Gru", "Kyle Balda", "Comedy", 2022, false);
        Medias blackAdam = new Movies("Black Adam", "Jaume Collet-Serra", "Action", 2022, false);
        Medias spiderman = new Movies("Spider-Man: No Way Home", "Jon Watts", "Fantasy", 2021, false);
        Medias jumanji = new Movies("Jumanji: Welcome to the Jungle", "Jake Kasdan", "Adventure", 2017, false);

        // object shows
        Medias walkingDead = new Shows("The Walking Dead", "Greg Nicotero", "Horror", 2022, true, 11);
        Medias strangerThings = new Shows("Stranger Things", "Shawn Levy", "Thriller", 2022, true, 4);
        Medias lucifer = new Shows("Lucifer", "Len Wiseman", "Drama", 2021, false, 6);
        Medias riverdale = new Shows("Riverdale", "Meggy Kiley", "Romance", 2017, true, 6);
        Medias thirteenReasonsWhy = new Shows("13 Reasons Why", "Thomas Joseph McCarthy", "Mystery", 2020, true, 4);

        // create arraylist
        ArrayList<Movies> lists = new ArrayList<>();

        System.out.println("Welcome to Netflix! \nif you decide to logoff, please type 'logoff' \nTo start, please type in 'START");

        while (!str.toUpperCase().equals("LOGOFF")) {
    
            str = input.readLine().toUpperCase();

            // Welcome page for user input 

            if (str.equals("START")) {
            System.out.print("What is your nickname? ");
            strNickname = input.readLine();

            System.out.print("What is your age? ");
            intAge = Integer.parseInt(input.readLine());

            if (intAge >= 18) {
                blnMaturity = true;
                System.out.println("You have access to all the content.");
                System.out.println("\nMOVIES \n" + smile.getMediaName() + " directed by: " + smile.getDirectorName() + " filmed in " + smile.getFilmYear() + " Genre: " + smile.getGenre());
                System.out.println(minions.getMediaName() + minions.getDirectorName() + minions.getFilmYear() + minions.getGenre());
                System.out.println(blackAdam.getMediaName() + blackAdam.getDirectorName() + blackAdam.getFilmYear() + blackAdam.getGenre());
                System.out.println(spiderman.getMediaName() + spiderman.getDirectorName() + spiderman.getFilmYear() + spiderman.getGenre());
                System.out.println(jumanji.getMediaName() + jumanji.getDirectorName() + jumanji.getFilmYear() + jumanji.getGenre() + "\n");

                System.out.println("SHOWS \n" + walkingDead.getMediaName());
                System.out.println(strangerThings.getMediaName());
                System.out.println(lucifer.getMediaName());
                System.out.println(riverdale.getMediaName());
                System.out.println(thirteenReasonsWhy.getMediaName());

            }
            else {
                blnMaturity = false;
                System.out.println("Your content has age restrictions applied.");
                System.out.println("\nMOVIES \n" + minions.getMediaName());
                System.out.println(blackAdam.getMediaName());
                System.out.println(spiderman.getMediaName());
                System.out.println(jumanji.getMediaName());
                System.out.println("\nSHOWS \n" + lucifer.getMediaName());
            }


            System.out.println("Choose which movies you like to get recommendations (recommendations will be based on genres)");

            }

            // logoff option
            else if (str.equals("LOGOFF")){
                System.out.println("Thank you for using Netflix");
            }
        
    }


}
}

