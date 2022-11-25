package netflix;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Scanner keyboard = new Scanner(System.in);

        String strLogoff;
        String strNickname;
        boolean blnMaturity;
        int intAge;

        boolean end = false;

        while (end != true) {
        

            // Welcome page for user input 
            System.out.println("Welcome to Netflix! \nif you decide to logoff, please type 'logoff' ");
            System.out.print("What is your nickname? ");
            strNickname = input.readLine();
            //strNickname.toLowerCase();
            //strLogoff = keyboard.nextLine();


            System.out.print("What is your age? ");
            intAge = input.readInt();
            while (!keyboard.hasNextInt()) {
                System.out.println("Invalid option \nWhat is your age? ");
                intAge = input.read();
            }
        
        /**if (strLogoff == "logoff" ) {
            end = true;
            System.out.println("Thank you for using Netflix.");
        } */


        if (intAge >= 18) {
            blnMaturity = true;
        }
        else {
            blnMaturity = false;
        }

        System.out.println(strNickname + intAge + blnMaturity);
        
    }

}
}

