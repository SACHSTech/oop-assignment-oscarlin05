import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("What type of subscription are you interesting in purchasing? (type in the plan) \n \nBasic: allows up to 1 user with 720p streaming quality--------$9.99 \nStandard: allows up to 2 users with 1080p streaming quality---$15.99 \nPremium: allows up to 4 users with 4k streaming quality-------$19.99 ");
        String strSubscriptionType = input.nextLine().toLowerCase();

        while (strSubscriptionType != "basic" || strSubscriptionType != "premium" || strSubscriptionType != "standard") {

            if (strSubscriptionType.equals("basic")) {
            }
            else if (strSubscriptionType.equals("standard")) {
            }
            else if (strSubscriptionType.equals("premium")) {
            }
            else {
                System.out.println("PLEASE ENTER A VALID OPTION");
                System.out.println("What type of subscription are you interesting in purchasing? \nBasic: allows up to one user with 720p streaming quality \nStandard: allows up to 2 users with 1080p streaming quality \nPremium: allows up to 4 users with 4k streaming quality");
                strSubscriptionType = input.nextLine().toLowerCase();                
            }
        }
    }
}

