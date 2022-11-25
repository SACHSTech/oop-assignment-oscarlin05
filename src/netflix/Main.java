package netflix;
import java.io.*;
import java.util.*;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Scanner keyboard = new Scanner(System.in);

        String strLogoff;
        String strNickname;
        boolean blnMaturity;
        int intAge;
        boolean end = false;

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

        while (end != true) {
        
            // Welcome page for user input 
            System.out.println("Welcome to Netflix! \nif you decide to logoff, please type 'logoff' ");
            System.out.print("What is your nickname? ");
            strNickname = input.readLine();
        
            //strLogoff = keyboard.nextLine();

            System.out.print("What is your age? ");
            intAge = keyboard.nextInt();
            blnMaturity = false;
            while (!keyboard.hasNextInt()) {
                System.out.println("Invalid option \nWhat is your age? ");
                intAge = input.read();
            }
            if (intAge >= 18) {
                blnMaturity = true;
            }
            else {
                blnMaturity = false;
                System.out.println("Your content has age restrictions applied.");
            }

            User newuser = new User(strNickname, intAge, blnMaturity);

            System.out.println(newuser.getNickname());

            System.out.println(newuser.getAge());
        
        /**if (strLogoff == "logoff" ) {
            end = true;
            System.out.println("Thank you for using Netflix.");
        } */
        System.out.println(strNickname + intAge + blnMaturity);
        
    }


}
}

