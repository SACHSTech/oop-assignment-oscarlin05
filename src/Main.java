import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

import org.junit.experimental.max.MaxCore;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String strNickname;
        int intAge;
        boolean blnMaturity;

        boolean end = false;

        System.out.print("What is your nickname? ");
        strNickname = input.readLine();
        System.out.print("What is your age? ");
        intAge = Integer.parseInt(input.readLine());
        if (intAge >= 18) {
            blnMaturity = true;
        }
        else {
            blnMaturity = false;
        }

        MyList list = new MyList(new ArrayList<Media>());
        User userInfo = new User(strNickname, intAge, blnMaturity);
        while (end != true) {

        }
}
}

