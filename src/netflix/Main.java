package netflix;
import java.io.*;
import java.util.*;
import javax.print.attribute.standard.MediaName;

public class Main {
    public static void main(String[] args) throws IOException{

        // bufferedreader for user input
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // instance variables
        String strLogoff;
        String strNickname;
        boolean blnMaturity;
        int intAge;
        boolean end = false;
        String str = "";

        // create objects for user and list 
        User newuser = new User("nickname", 0, false);
        MyList list = new MyList();

        System.out.println("Welcome to Netflix Recommendations!\n \nIf you decide to logoff, please type 'LOGOFF' \nTo start, please type in 'START'\n");

        // loop the program
        while (!str.toUpperCase().equals("LOGOFF")) {
    
            str = input.readLine().toUpperCase();

            // logoff option
            if (str.equals("LOGOFF")){
                System.out.println("Thank you for using Netflix Recommendations");
                break;
            }

            // Welcome page for user input 
            System.out.println("\nWhat is your nickname? ");
            newuser.setNickname();

            System.out.print("What is your age? ");
            newuser.setAge();

            if (str.equals("START")) {

                // check for user age to display appropriate shows
                if (newuser.getAge() >= 18) {
                    blnMaturity = true;
                    System.out.println("You have access to all the content.");
                    System.out.println();
                    System.out.println(list.getMovieList());
                    System.out.println(list.getShowList());
                    System.out.println("Type 'recommendations' for recommeded media.");

                    str = input.readLine().toUpperCase();

                    // display recommendations
                    if (str.equals("RECOMMENDATIONS")) {
                        System.out.println("\nWhat genre do you like? [HORROR] [COMEDY] [ACTION] [FANTASY] [ADVENTURE]");
                        String genre = input.readLine().toUpperCase();

                        if (genre.equals("HORROR")) {
                            System.out.println("The Walking Dead");
                            System.out.println("\nIf you would like to restart the process, please type 'start'\nIf not, please type 'logoff'");                 

                        }
        
                        else if (genre.equals("COMEDY")) {
                            System.out.println("Mr. Bean");
                            System.out.println("\nIf you would like to restart the process, please type 'start'\nIf not, please type 'logoff'");                 

                        }
        
                        else if (genre.equals("ACTION")) {
                            System.out.println("Stranger Things");
                            System.out.println("\nIf you would like to restart the process, please type 'start'\nIf not, please type 'logoff'");                 

                        }
        
                        else if (genre.equals("FANTASY")) {
                            System.out.println("Lucifer");
                            System.out.println("\nIf you would like to restart the process, please type 'start'\nIf not, please type 'logoff'");                 

                        }
        
                        else if (genre.equals("ADVENTURE")) {
                            System.out.println("13 Reasons Why");
                            System.out.println("\nIf you would like to restart the process, please type 'start'\nIf not, please type 'logoff'");                 

                        }
                    }   
                }

                // display recommendations for restricted content 
                else {
                    blnMaturity = false;
                    System.out.println("You have restricted access to the content.");
                    System.out.println();
                    System.out.println(list.getRestrictedMovieList());
                    System.out.println(list.getRestricedShowList());
                    System.out.println("Type 'recommendations' for recommeded media.");

                    str = input.readLine().toUpperCase();

                    if (str.equals("RECOMMENDATIONS")) {
                        System.out.println("\nWhat genre do you like? [HORROR] [COMEDY] [ACTION] [FANTASY] [ADVENTURE]");
                        String genre = input.readLine().toUpperCase();

                        if (genre.equals("HORROR")) {
                            System.out.println("Sorry, you are age restricted");
                            System.out.println("\nIf you would like to restart the process, please type 'start'\nIf not, please type 'logoff'");                 

                        }
        
                        else if (genre.equals("COMEDY")) {
                            System.out.println("The Office");
                            System.out.println("\nIf you would like to restart the process, please type 'start'\nIf not, please type 'logoff'");                 

                        }
        
                        else if (genre.equals("ACTION")) {
                            System.out.println("Star Wars Rebel");
                            System.out.println("\nIf you would like to restart the process, please type 'start'\nIf not, please type 'logoff'");                 

                        }
        
                        else if (genre.equals("FANTASY")) {
                            System.out.println("Dino Dan");
                            System.out.println("\nIf you would like to restart the process, please type 'start'\nIf not, please type 'logoff'");                 

                        }
        
                        else if (genre.equals("ADVENTURE")) {
                            System.out.println("What If...?");
                            System.out.println("\nIf you would like to restart the process, please type 'start'\nIf not, please type 'logoff'");                 

                        }
                    }   
                }        
            }
        }
    }
}

